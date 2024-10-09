package lesson6;

public class Test {
    public static void main(String[] args) {
        BigInt a = new BigInt("18");
        BigInt b = new BigInt("1119");
        System.out.println(a.add(b));
        System.out.println(b.subtract(a));
        BigInt c1 = new BigInt("129");//new BigInt(new int[]{19,1,1});
        BigInt c2 = new BigInt("19"); //new BigInt(new int[]{1,1});
        System.out.println(c1.multiply(c2));
    }
}
