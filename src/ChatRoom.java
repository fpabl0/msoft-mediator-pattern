import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            // Don't send the message back to the sender
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
