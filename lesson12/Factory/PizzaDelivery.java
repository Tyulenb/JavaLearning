package lesson12.Factory;

public class PizzaDelivery extends DeliveryService{

    private String delivery = "Delivering pizza!";

    @Override
    public DeliveryService createOrder() {
        return new PizzaDelivery();
    }

    public String deliver(){
        return delivery;
    }

}
