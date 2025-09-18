package W3L9_HW_Asgmt.prob1;

public class ArrayQueueImpl {
    private final CircularArray array;

    public ArrayQueueImpl() {
        this.array = new CircularArray();
    }

    public ArrayQueueImpl(int capacity) {
        this.array = new CircularArray(capacity);
    }

    public void enqueue(int item) {
        array.addLast(item);
    }

    public int dequeue() {
        return array.removeFirst();
    }

    public int peek() {
        return array.getFirst();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int size() {
        return array.size();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}