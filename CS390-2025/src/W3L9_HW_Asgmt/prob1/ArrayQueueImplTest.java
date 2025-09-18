package W3L9_HW_Asgmt.prob1;

public class ArrayQueueImplTest {
    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("After 4 enqueue: " + q + " | size=" + q.size());

        System.out.println("dequeue -> " + q.dequeue()); // 10
        System.out.println("dequeue -> " + q.dequeue()); // 20
        System.out.println("After 2 dequeue: " + q + " | size=" + q.size());

        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        System.out.println("After 3 enqueue: " + q + " | size=" + q.size());

        System.out.println("peek -> " + q.peek());

        while (!q.isEmpty()) {
            System.out.println("dequeue -> " + q.dequeue() + " | " + q);
        }
        System.out.println("Empty? " + q.isEmpty() + " | size=" + q.size() + " | " + q);
    }
}
