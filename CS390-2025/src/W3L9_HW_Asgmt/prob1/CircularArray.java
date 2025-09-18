package W3L9_HW_Asgmt.prob1;

import java.util.NoSuchElementException;

public class CircularArray {
    private Integer[] arr;
    private int front;
    private int rear;
    private int size;

    public CircularArray(int capacity) {
        if (capacity < 1) throw new IllegalArgumentException("capacity must be >= 1");
        arr = new Integer[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public CircularArray() {
        this(10);
    }

    public void addLast(int item) {
        if (isFull()) resize();

        arr[rear] = item;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public Integer removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("Array is empty");

        var itemToDelete = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return itemToDelete;
    }

    public Integer getFirst() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty.");
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == arr.length;
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
