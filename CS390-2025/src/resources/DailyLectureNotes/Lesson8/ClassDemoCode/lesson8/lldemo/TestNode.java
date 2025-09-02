package lesson8.lldemo;

import java.util.LinkedList;
import java.util.List;

public class TestNode {
    public static void main(String[] args) {
        MyLL ob = new MyLL();
        System.out.println(ob);
        ob.addFirst(10);
        ob.addFirst(20);
        ob.addFirst(30);
        ob.addFirst(40);
        ob.addFirst(50);
        System.out.println(ob);
        ob.removeLast();
        System.out.println(ob);
        System.out.println(ob.contains(30));
        System.out.println(ob.contains(10));

        // USe Linked List API
        List<String> list = new LinkedList<>();
        list.add("Apple");
        list.add(0,"Pear");
        list.addLast("Pineapple");
        System.out.println(list);
    }
}
