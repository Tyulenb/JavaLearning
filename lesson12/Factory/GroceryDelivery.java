package lesson12.Factory;

public class GroceryDelivery extends DeliveryService{

    String delivery = "Delivering grocery";

    @Override
    public DeliveryService createOrder() {
        return new GroceryDelivery();
    }
}
