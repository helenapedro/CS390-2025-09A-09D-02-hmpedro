package W3L9_HW_Asgmt.prob4;

import java.util.ArrayDeque;
import java.util.Queue;

public class TicketingSystem {
    private final Queue<Ticket> ticketQueue = new ArrayDeque<>();
    private int nextId = 1;

    public TicketingSystem() { }

    public void addTicket(String description) {
        String id = "T-" + nextId++;
        ticketQueue.add(new Ticket(id, description));
    }

    public Ticket processTicket() {
        if (isQueueEmpty()) return null;
        return ticketQueue.poll();
    }

    public Ticket viewNextTicket() {
        if (isQueueEmpty()) return null;

        return ticketQueue.peek();
    }

    private boolean isQueueEmpty() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in queue.");
            return true;
        }
        return false;
    }
}
