package lesson7.Main;

import lesson7.Calc.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("1. Addition\n2. Subtraction\n3. Power\n4. To bin\n5. To hex\n6. Tetration\n7. Exit");
            int answ = in.nextInt();
            int ans;
            switch (answ){
                case 1:
                    System.out.println("1. Integer numbers\n2. Float numbers\n3. Mixed");
                    ans = in.nextInt();
                    System.out.println("Write 2 numbers to sum them (a + b)");
                    switch (ans){
                        case 1:
                            long a = in.nextLong();
                            long b = in.nextLong();
                            System.out.println(calculator.Sum(a,b));
                            break;
                        case 2:
                            double a1 = in.nextDouble();
                            double b1 = in.nextDouble();
                            System.out.println(calculator.Sum(a1,b1));
                            break;
                        default:
                            System.out.println("First int, than double");
                            long a2 = in.nextLong();
                            double b2 = in.nextDouble();
                            System.out.println(calculator.Sum(a2, b2));
                    }
                    break;
                case 2:
                    System.out.println("1. Integer numbers\n2. Float numbers\n3. Mixed");
                    ans = in.nextInt();
                    System.out.println("Write 2 numbers to sub them (a + b)");
                    switch (ans){
                        case 1:
                            long a = in.nextLong();
                            long b = in.nextLong();
                            System.out.println(calculator.Sub(a,b));
                            break;
                        case 2:
                            double a1 = in.nextDouble();
                            double b1 = in.nextDouble();
                            System.out.println(calculator.Sub(a1,b1));
                            break;
                        default:
                            System.out.println("First int, than double");
                            long a2 = in.nextLong();
                            double b2 = in.nextDouble();
                            System.out.println(calculator.Sub(a2, b2));
                    }
                    break;
                case 3:
                    System.out.println("1. Power integer\n2. Power double");
                    ans = in.nextInt();
                    System.out.println("First number, than power");
                    switch (ans){
                        case 1:
                            long a = in.nextLong();
                            long b = in.nextLong();
                            System.out.println(calculator.Pow(a,b));
                            break;
                        case 2:
                            double a1 = in.nextDouble();
                            int b1 = in.nextInt();
                            System.out.println(calculator.Pow(a1,b1));
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Enter integer to convert it to binary");
                    long a = in.nextLong();
                    System.out.println(calculator.Bin(a));
                    break;
                case 5:
                    System.out.println("Enter integer to convert it to hexagon");
                    long a1 = in.nextLong();
                    System.out.println(calculator.Hex(a1));
                    break;
                case 6:
                    System.out.println("Enter a and b to perform   a (tetr) b");
                    byte a2 = in.nextByte();
                    byte b2 = in.nextByte();
                    System.out.println(calculator.Tetr(a2, b2));
                    break;
                default:
                    return;
            }
        }
    }
}
