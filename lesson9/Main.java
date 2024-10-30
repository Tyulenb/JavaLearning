package lesson9;

public class Main {
    public static void main(String[] args) {
        Lobotryas<String> str = new Lobotryas<String>("raz");
        Lobotryas<String> str1 = new Lobotryas<String>("dva");
        System.out.println(str.concatenate(str1));


        Lobotryas<Integer> int1 = new Lobotryas<Integer>(10);
        Lobotryas<Integer> int2 = new Lobotryas<Integer>(15);
        System.out.println(int2.sub(int1));
        System.out.println(int1.add(int2));
    }
}
