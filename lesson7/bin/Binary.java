package lesson7.bin;

public class Binary {
    public static String bin(long a){
        StringBuilder sb = new StringBuilder();
        while (a > 0){
            sb.append(a%2);
            a=a/2;
        }
        sb.reverse();
        return sb.toString();
    }
}
