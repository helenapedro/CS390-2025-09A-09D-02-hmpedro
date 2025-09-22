package dshandson.queue;

import dshandson.arraylist.StringArrayList;

import java.util.NoSuchElementException;

public class ArrayQueueImpl {
    private final StringArrayList queue;

    public ArrayQueueImpl() {
        queue = new StringArrayList();
    }

    public Object peek(){
        return queue.get(0);
    }

    public void enqueue(Object obj){
        queue.add(obj);
    }

    private boolean isFull() {
       return queue.isFull();
    }

//    public Object dequeue() {
//        Object first = queue.get(0);
//        queue.remove(first);
//        return first;
//    }

    public void dequeue() {
       queue.removeAt(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        try {
            System.out.println("peek -> " + q.peek());
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for(int i = 0; i < 15; i ++)
            q.enqueue(i);
        try {
            for(int i = 0; i < 15; i ++)
                q.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove from an empty queue!");
        }

        System.out.println("size -> " + q.size());
    }
}
