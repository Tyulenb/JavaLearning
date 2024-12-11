package lesson15;

import java.io.*;
import java.net.*;
import java.util.*;
public class CalculatorHttpServer {
    private static final int PORT = 44;
    private static final List<String> notes = new ArrayList<>();
    private static String[] queries;
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT))
        {
            System.out.println("Note HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept())
                {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " +
                    e.getMessage());
        }
    }
    private static void handleClient(Socket clientSocket) throws
            IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());

        String line = in.readLine();

        if (line == null) return;

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String[] full_path = requestParts[1].split("\\?");

        String path = full_path[0];
        //try {
            queries = full_path[1].split("&");
        //}catch (Exception e){}

        System.out.println(Arrays.toString(full_path));
        System.out.println(path);
        System.out.println(Arrays.toString(queries));

        if (method.equals("GET") && path.equals("/calculate")) {
            handleCalculate(out);
        } else {
            handleNotFound(out);
        }
        out.flush();
    }

    private static void handleCalculate(PrintWriter out) {
        float a = 1;
        float b = 1;
        String op = queries[2].split("=")[1];

        try{
            a = Float.parseFloat(queries[0].split("=")[1]);
            b = Float.parseFloat(queries[1].split("=")[1]);
        }catch (Exception e){
            handleArgumentError(out);
        }

        StringBuilder response = new StringBuilder();
        float answer = calculate(a,b,op,out);

        response.append("<html><body><h2>Calculator</h2>");
        response.append(a);
        response.append(op);
        response.append(b);
        response.append("=");
        response.append(answer);
        response.append("</body></html>");
        sendHttpResponse(out, 200, response.toString());
    }

    private static float calculate(float a, float b, String op, PrintWriter out) {
        if(op.equals("+")){
            return a+b;
        }else if (op.equals("-")){
            return a-b;
        }else if(op.equals("*")){
            return a*b;
        }else if(op.equals("\\")||op.equals("/")){
            try {
                return a/b;
            }catch (ArithmeticException e){
                handleArithmeticException(out);
                return 0;
            }
        }else{
           handleArgumentError(out);
           return 0;
        }
    }

    private static void handleArithmeticException(PrintWriter out) {
        sendHttpResponse(out, 400, "<html><body><h1>Division by 0</h1></body></html>");
    }

    private static void handleArgumentError(PrintWriter out){
        sendHttpResponse(out, 400 ,"<html><body><h1>Arguments Error</h1></body></html>");
    }

    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404, "<html><body><h1>404 Not Found</h1></body></html>");
    }

    private static void sendHttpResponse(PrintWriter out, int
            statusCode, String body) {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
    }
    private static void sendHttpRedirect(PrintWriter out, String
            location) {
        out.println("HTTP/1.1 302 Found");
        out.println("Location: " + location);
        out.println("Content-Length: 0");
        out.println();
    }
}
