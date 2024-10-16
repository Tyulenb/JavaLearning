package lesson7.hex;

public class Hexagon {
    public static String hex(long a){
        char[] alph = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        StringBuilder sb = new StringBuilder();
        while(a>0){
           sb.append(alph[(int)(a%16)]);
           a=a/16;
        }
        return sb.reverse().toString();
    }
}
