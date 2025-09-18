package W3L9_HW_Asgmt.prob2;

import java.util.NoSuchElementException;

public class LinkedList {
    private final Node dummy;
    private Node last;
    private int size;

    public LinkedList() {
        dummy = new Node(null);
        last = dummy;
        size = 0;
    }

    public void addFirst(Integer item) {
        var nn = new Node(item);
        nn.next = dummy.next;
        dummy.next = nn;

        if (last == dummy)
            last = nn;
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("List is empty.");

        var firstRealNode = dummy.next;
        dummy.next = firstRealNode.next;

        if (firstRealNode == last) {
            last = dummy;
        }
        size--;
    }

    public Integer getFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");
        return dummy.next.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node curr = dummy.next;
        while (curr != null) {
            sb.append(curr.value);
            curr = curr.next;
            if (curr != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    static class Node {
        final Integer value;
        Node next;
        Node(Integer value) { this.value = value; }
    }
}
