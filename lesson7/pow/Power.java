package lesson7.pow;

public class Power {
    public static long pow(long a, long b){
        if (b == 1){
            return a;
        }
        else if (b%2==0){
            return pow(a, b/2)*pow(a, b/2);
        }
        else{
            return a * pow(a, b-1);
        }
    }

    public static double pow(double a, long b){
        if (b == 1){
            return a;
        }
        else if (b%2==0){
            return pow(a, b/2)*pow(a, b/2);
        }
        else{
            return a * pow(a, b-1);
        }
    }
}
