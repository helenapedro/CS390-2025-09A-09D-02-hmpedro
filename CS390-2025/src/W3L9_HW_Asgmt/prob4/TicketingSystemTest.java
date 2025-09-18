package W3L9_HW_Asgmt.prob4;

public class TicketingSystemTest {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();
        system.addTicket("Login issue");
        system.addTicket("Payment not going through");
        system.addTicket("Bug in mobile app");

        System.out.println("Next ticket: " + system.viewNextTicket());
        System.out.println("Processing: " + system.processTicket());
        System.out.println("Processing: " + system.processTicket());
        System.out.println("Next ticket: " + system.viewNextTicket());
        System.out.println("Processing: " + system.processTicket());
        System.out.println("Processing: " + system.processTicket());
    }
}
