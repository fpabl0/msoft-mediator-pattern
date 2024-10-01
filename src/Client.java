public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User adminUser = new AdminUser(mediator,"Pedro");
        User regularUser1 = new RegularUser(mediator, "Juan");
        User regularUser2 = new RegularUser(mediator, "María");

        mediator.addUser(adminUser);
        mediator.addUser(regularUser1);
        mediator.addUser(regularUser2);

        adminUser.send("Hola estudiantes, he creado este chat grupal para solucionar dudas");
        regularUser1.send("Gracias profesor.");
        regularUser2.send("Excelente ing, muchas gracias");
    }
}
