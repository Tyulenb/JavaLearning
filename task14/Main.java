package task14;

public class Main {
    public static void main(String[] args) {
        Chat confa = new Chat();
        User waiter = new User("Waiter");
        User client = new User("Client");
        User chef = new User("Chief");

        confa.addUser(chef);
        confa.addUser(client);
        confa.addUser(waiter);

        client.send("Lasagna please!");
        waiter.send("1 Lasagna to table 1");
        chef.send("I am starting to cook lasagna");
    }
}
