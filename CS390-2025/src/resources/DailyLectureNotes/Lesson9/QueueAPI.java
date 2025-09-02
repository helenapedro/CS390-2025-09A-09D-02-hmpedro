package lesson9;

import java.util.*;

public class QueueAPI {
    public static void main(String[] args) {
        // Queue is an interface
       //  Queue<Integer> q = new Queue<Integer>();

        // Queue Behaviour using LL
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.add(30);
     //   System.out.println(q.peek());
      /* System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.poll());*/

          //System.out.println(q.peek()); // null for empty queue
        // System.out.println(q.element()); // NoSuchElement for Exception
        // Queue Behaviour using Array based
        Queue<String > aq1 = new ArrayDeque<>();

        // Double Ended Queue Behaviour
        Deque dq = new LinkedList<>();
        dq.addFirst(12);
        dq.addLast(10);

        // Priority Queue , Dequeue()
        Queue<Integer> pq = new PriorityQueue<>(); // Pq is an arraybased
        pq.add(10);
        pq.add(50);
        pq.add(100);
        pq.add(5);
        while (!pq.isEmpty()){
            System.out.println(pq.remove());// When you do service applied priority from small to large
        }
       // System.out.println(pq);

        Employee e1 = new Employee("Carl","Jones", 75000,1987, 12,15);
        Employee e2 = new Employee("Harry","Rogers", 50000, 1989, 10, 1);
        Employee e3= new Employee("Tony", "Atkinson", 40000, 1990, 3, 15);
        Queue<Employee> epq = new PriorityQueue<>();
        epq.add(e1);
        epq.add(e2);
        epq.add(e3);
        while (!epq.isEmpty()){
            System.out.println(epq.remove());// When you do service applied priority from small to large
        }

        // Comparator
        Comparator<Employee> com = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        // Pass Comparator through Constructor
        Queue<Employee> epq1 = new PriorityQueue<>(com);
        epq1.add(e1);
        epq1.add(e2);
        epq1.add(e3);
        while (!epq1.isEmpty()){
            System.out.println(epq1.remove());// When you do service applied priority from small to large
        }

    }
}
