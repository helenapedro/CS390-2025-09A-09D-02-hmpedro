package W3L9_HW_Asgmt.prob2;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    public void addFirst(Integer item) {
        Node node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public Integer removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty.");

        int removedValue = first.value;

        if (first == last)
            first = last = null;
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
        return removedValue;
    }

    public Integer getFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");
        return first.value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node curr = first;
        while (curr != null) {
            sb.append(curr.value);
            curr = curr.next;
            if (curr != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    static final class Node {
        final Integer value;
        Node next;
        public Node(Integer value) {
            this.value = value;
        }
    }
}
