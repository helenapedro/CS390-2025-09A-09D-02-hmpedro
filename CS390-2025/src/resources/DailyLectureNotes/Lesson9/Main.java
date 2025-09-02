package lesson9.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
       // Queue<String> list = new Queue<String>();// Wrong Queue is an Interface
        Queue<String> list = new LinkedList<>();
        list.offer("Apple"); // add
        list.add("Orange"); // insert
        System.out.println(list);
        System.out.println(list.poll());//Delete
        System.out.println(list.remove()); // delete
        System.out.println(list.poll());//Delete list is empty return null
      //  System.out.println(list.remove()); // Empty, throw NoSuchElementException
        list.offer("Pine Apple");
        System.out.println(list.peek()); // Peek the front data
        System.out.println(list.element()); // Peek the front data
        list.clear();
        System.out.println(list);
        System.out.println(list.peek()); // Peek the front data empty -> null
      //  System.out.println(list.element()); // Peek the front data empty ->NoSuchElementException
        // Regular Queue - remove from the front, and add at rear
        Queue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(25);
        pq.add(15);
        pq.add(35);
        pq.add(30);
        pq.add(11);
        //   System.out.println("Priority Queue Elements : " + pq);
        Iterator p = pq.iterator();
        System.out.println("Elements removed according to the priority : ");
        while(p.hasNext()){
            System.out.print(pq.remove() + "  ");
        }
    }
}
