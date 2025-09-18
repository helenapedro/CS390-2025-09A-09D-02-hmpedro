package W3L9_HW_Asgmt.prob2;

public class LinkedListStack {
    private final LinkedList list;

    public LinkedListStack() {
        this.list = new LinkedList();
    }

    public void push(Integer item) {
        list.addFirst(item);
    }

    public Integer pop() {
        return list.removeFirst();
    }

    public Integer peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
