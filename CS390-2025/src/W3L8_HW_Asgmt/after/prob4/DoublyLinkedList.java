package W3L8_HW_Asgmt.after.prob4;

public class DoublyLinkedList {
    Node header;
    Node tail;
    DoublyLinkedList(){
        header = new Node(null);
        tail = new Node(null);
        header.next = tail;
        tail.previous = header;
    }

    //1. adds to the end of the list
    public void addLast(String item){
        //implement
        if (item == null) throw new NullPointerException();

        Node nn = new Node(item);

        tail.previous.next = nn;
        nn.previous = tail.previous;
        nn.next = tail;
        tail.previous = nn;
    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        if (item == null) return false;

        for (Node curr = header.next; curr != tail; curr = curr.next) {
            if (item.equals(curr.value)) {
                curr.previous.next = curr.next;
                curr.next.previous = curr.previous;
                return true;
            }
        }
        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        // Implement
        if (header.next == tail) return false;
        Node curr = header.next;
        curr.previous.next = curr.next;
        curr.next.previous = curr.previous;
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        StringBuilder sb = new StringBuilder();
        for (Node p = tail.previous; p != header; p = p.previous) {
            sb.append(" ").append(p.value);
        }
        System.out.println(sb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();
    }
    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        System.out.println("Actual elements in list: " + list);

        // Call all your implemented Methods
        boolean rem = list.remove("Bob");
        System.out.println("An element was removed: " + rem);
        System.out.println("Actual elements in list: " + list);

        String name = "Jane";
        list.addLast(name);
        System.out.println(name + ", was added at the end of the list.");
        System.out.println("Actual elements in list: " + list);

        list.removeFirst();
        System.out.println("The first element was removed from the list.");
        System.out.println("Actual elements in list: " + list);
        System.out.println("List in reverse order");
        list.printReverse();
    }
}

