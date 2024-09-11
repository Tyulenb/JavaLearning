package lesson1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        System.out.println("Введите сумму в китайских юанях");
        Scanner in = new Scanner(System.in);
        int yuan = in.nextInt();
        String China;
        if (yuan%10 >= 2 && yuan % 10 <= 4){
            China = " китайских юаня ";
        }else if (yuan%10==1){
            China = " китайский юань ";
        }else{
            China = " китайских юаней";
        }

        double result = Math.round(ROUBLES_PER_YUAN*yuan);

        String Russia;
        if(result%10==1){
            Russia = " российский рубль";
        } else if (result%10>=2 && result%10<=4) {
            Russia = " российских рубля";
        }else{
            Russia = " российских рублей";
        }


        System.out.println(yuan + China + " = " + result + Russia);
    }
}
