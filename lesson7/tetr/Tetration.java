package lesson7.tetr;

import lesson7.pow.Power;

public class Tetration {
    public static long tetr(byte a, byte b){
        long p = a;
        for(int i = 0; i < b-2; i++){
            p = Power.pow(a, p);
        }
        return Power.pow(a, p);
    }
}
