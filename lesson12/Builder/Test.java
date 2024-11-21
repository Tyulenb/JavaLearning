package lesson12.Builder;

public class Test {
    public static void main(String[] args) {
        OrderBuild builder = new OrderBuild();
        Order ord1 = builder.setMainDish("Cutlet")
                .setGarnish("Puree")
                .setDrink("Compote")
                .setDessert("charlotte")
                .build();
        System.out.println(ord1);

        OrderBuild builder1 = new OrderBuild();
        Order ord2 = builder1.setDrink("Cola").build();
        System.out.println(ord2);
    }
}
