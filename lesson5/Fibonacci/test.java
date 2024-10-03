package lesson5.Fibonacci;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        FibonacciArray fa = new FibonacciArray();
        System.out.println(fa.getElem(n));
    }
}
