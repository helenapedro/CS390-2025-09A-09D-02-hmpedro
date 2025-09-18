package W3L9_HW_Asgmt.prob2;

import java.util.NoSuchElementException;

public class LinkedListStack {
    private final Node header;
    private final Node tail;
    private int size;

    LinkedListStack() {
        header = new Node(null);
        tail = new Node(null);
        header.next = tail;
        tail.previous = header;
    }

    private class Node {
        Integer item;
        Node next;
        Node previous;

        public Node(Integer x) {
            this.item = x;
        }

        public String toString() {
            return item == -1 ? "<empty>" : item.toString();
        }
    }

    public void push(Integer x) {
        if (x == null) throw new NullPointerException("x cannot be null");

        Node nn = new Node(x);
        tail.previous.next = nn;
        nn.previous = tail.previous;
        nn.next = tail;
        tail.previous = nn;
        size++;
    }

    public Integer peek() {
        if (size == 0)
            throw new NoSuchElementException("Stack is empty");

        Node nodeToPeek = tail.previous;
        return nodeToPeek.item;
    }

    public Integer pop() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is empty, cannot pop.");

        var nodeToBeRemoved = tail.previous;
        Integer x = nodeToBeRemoved.item;
        tail.previous = nodeToBeRemoved.previous;
        tail.previous.next = tail;
        size--;

        return x;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        header.next = tail;
        tail.previous = header;
        size = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "<empty>";
        StringBuilder sb = new StringBuilder();
        Node cur = header.next;
        while (cur != tail) {
            if (!sb.isEmpty()) sb.append(' ');
            sb.append(cur.item);
            cur = cur.next;
        }
        return sb.toString();
    }

}

