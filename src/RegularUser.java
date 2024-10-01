public class RegularUser extends User {
    public RegularUser(ChatMediator mediator, String name) {
        super(mediator, "(Regular)" + name);
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
