package lesson1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final double ROUBLES_PER_YUAN = 11.91;
        System.out.println("Введите сумму в китайских юанях");
        Scanner in = new Scanner(System.in);
        int yuan = in.nextInt();
        double result = Math.round(ROUBLES_PER_YUAN*yuan);
        System.out.println(yuan + " юаней = " + result + " рублей");

    }
}
