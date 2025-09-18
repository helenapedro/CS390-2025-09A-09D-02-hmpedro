package W3L9_HW_Asgmt.prob1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueueImpl {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    public ArrayQueueImpl() {
        this.size = 0;
        this.arr = new Integer[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = 0;
    }

    public ArrayQueueImpl(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("capacity must be >= 1");
        this.size = 0;
        this.arr = new Integer[capacity];
        this.front = 0;
        this.rear = 0;
    }

    public Integer peek() {
        if (isEmpty()) throw new IllegalStateException();
        return arr[front];
    }

    public void enqueue(int item) {
        if (isFull()) resize();

        arr[rear] = item;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");

        var itemToDelete = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;

        return itemToDelete;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        System.out.println("resizing...");
        Integer[] newArr = new Integer[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size;
    }

    // HELPER METHODS
    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % arr.length;
            sb.append(arr[index]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
