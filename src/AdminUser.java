public class AdminUser extends User {
    public AdminUser(ChatMediator mediator, String name) {
        super(mediator, "(Admin)" + name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " SEND = \"" + msg + "\"");
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " RECEIVED = \"" + msg + "\"");
    }
}
