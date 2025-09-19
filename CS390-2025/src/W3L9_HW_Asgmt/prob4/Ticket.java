package W3L9_HW_Asgmt.prob4;

public class Ticket {
    private final String id;
    private final String description;

    public Ticket(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket{id='" + id + "', description='" + description + "'}";
    }
}
