package lesson12.Factory;

public class Test {
    public static void main(String[] args) {
        DeliveryService ds = new GroceryDelivery();
        ds.createOrder();
        System.out.println(ds);
    }
}
