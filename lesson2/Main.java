package lesson2;

public class Main {
    public static void main(String[] args) {
       Car matiz = new Car("Daewoo Matiz","Red");
       System.out.println(matiz);
       Car matiz1 = new Car(2001, "Red", "B", "Daewoo Matiz");
       System.out.println(matiz1.getModel());
       System.out.println(matiz1);
    }
}
