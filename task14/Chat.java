package task14;

import java.util.ArrayList;

public class Chat implements Mediator{
    ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        user.setMediator(this);
        users.add(user);
    }

    public void remUser(User user){
        users.remove(user);
    }

    @Override
    public void send(User user, String msg) {
        for(User u: users){
            if(u!=user){
                u.getMessage(msg);
            }
        }
    }
}
