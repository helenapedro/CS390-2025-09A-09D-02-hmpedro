package lesson8.lldemo;
public class MyLL {
    // Instance field
    Node header;

    public MyLL() {
        header = new Node(null);
    }

    public void addFirst(Integer v) {
        Node n = new Node(v);
        // In general, a list is empty or not
        n.previous = header;
        n.next = header.next;
        // If the list is not empty
        if (header.next != null) {
            header.next.previous = n;
        }
        header.next = n;
    }

   /* public void addFirst(Integer v) {
   // If you know the prev, next use this constructor
        Node n = new Node(header, v, header.next);

        // If the list is not empty
        if (header.next != null) {
            header.next.previous = n;
        }
        header.next = n;
    }*/

    public void removeLast() {
        // List is Empty
        if (header.next == null)
            System.out.println("List is Empty");
        // First thing to reach the last
        Node current = header.next;
        while (current.next != null) {
            current = current.next;
        }
        // current is pointer for the last node
        // Change the connections to null
        current.previous.next = null;
        current.previous = null;
        current = null; // Assist Garbage
    }

    @Override
    public String toString() {
        if (header.next == null) {
            return "[Null]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = header.next;
        while (current.next != null) {
            sb.append(current.value);
            sb.append("-->");
            current = current.next;
        }
        sb.append(current.value);
        sb.append("-->Null]");
        return sb.toString();
    }

    public boolean contains(Integer val){
        if (header.next == null) {
            return false;
        }
        Node current = header.next;
        while (current!=null){
           if( current.value.equals(val))
                    return true;
           current = current.next;
        }
        return false;
    }
    class Node {
       Integer value;
        Node next;
        Node previous;

        Node(Integer value){
            this.value = value;
        }
        Node(Node previous, Integer value, Node next){
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
        public String toString() {
            return value + " ";
        }
    }
}
