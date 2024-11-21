package lesson12.Builder;

public class Order {
    private String MainDish;
    private String Garnish;
    private String Drink;
    private String Dessert;

    public void setMainDish(String mainDish) {
        MainDish = mainDish;
    }

    public void setGarnish(String garnish) {
        Garnish = garnish;
    }

    public void setDrink(String drink) {
        Drink = drink;
    }

    public void setDessert(String dessert) {
        Dessert = dessert;
    }


    @Override
    public String toString() {
        return "Order{" +
                "MainDish='" + MainDish + '\'' +
                ", Garnish='" + Garnish + '\'' +
                ", Drink='" + Drink + '\'' +
                ", Dessert='" + Dessert + '\'' +
                '}';
    }
}
