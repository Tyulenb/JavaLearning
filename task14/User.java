package task14;

public class User {
    private String role;
    private Mediator mediator;

    public User(String role) {
        this.role = role;
    }

    public void send(String msg){
        System.out.println("User " + role + " sent message: " + msg);
        mediator.send(this, msg);
    }

    public void getMessage(String msg){
        System.out.println("User " + role + " received the message: " + msg);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
