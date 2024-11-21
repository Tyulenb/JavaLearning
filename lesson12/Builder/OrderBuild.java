package lesson12.Builder;

public class OrderBuild {
    private Order order = new Order();

    public OrderBuild setMainDish(String mainDish){
        order.setMainDish(mainDish);
        return this;
    }

    public OrderBuild setGarnish(String Garnish){
        order.setGarnish(Garnish);
        return this;
    }

    public OrderBuild setDrink(String Drink){
        order.setDrink(Drink);
        return this;
    }

    public OrderBuild setDessert(String dessert){
        order.setDessert(dessert);
        return this;
    }

    public Order build(){
        return order;
    }
}
