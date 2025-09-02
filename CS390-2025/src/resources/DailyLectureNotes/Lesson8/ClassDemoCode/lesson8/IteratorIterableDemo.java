package lesson8;

import java.util.*;

public class IteratorIterableDemo {
    public static void main(String[] args) {
        List<Apple> alist = new ArrayList<>();
        alist.add(new Apple());
        alist.add(new Apple("Green",2,1.5));
        alist.add(new Apple("Yellow",2.5,1.2));
        alist.add(new Apple("Gold",1.5,2.2));
        alist.add(new Apple("Gold",1.5,2.7));

        // 1. Processing collection using regular loop
        for(int i =0; i< alist.size(); i++){
            Apple a = alist.get(i);
            if(a.getColor().equals("Gold"))
                System.out.println("1. Regular loop " + a);
        }
        // 2. Using for each
        for(Apple a: alist){
            if(a.getColor().equals("Gold"))
                System.out.println("2.For each " + a);
        }
        // 3. Iterator
       Iterator<Apple> it =  alist.iterator();
        while (it.hasNext()){ // Check you have the items return boolean
            // Read the data item through Iterator
            Apple a = it.next();
            if(a.getColor().equals("Gold"))
                System.out.println("3.Iterator " + a);
        }
        // 4. Lambda
        alist.forEach(a->{
            if(a.getColor().equals("Gold"))
                System.out.println("4.Lambda  " + a);
        });

        ArrayList<String> stringArray = new ArrayList<String>(
                Arrays.asList("Hello", "Welcome", "Java","Object",
                        "Array", "String", "Inheritance","Swing"));

        Iterator<String> it1 = stringArray.iterator();
        while (it1.hasNext()){
            String s = it1.next();
            if(s.length()>5){
                System.out.println(s);
            }
        }

        // Linked List can traverse on both direction
        // If you want only forward direction get Iterator()
        // For both direction ListIterator
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.addFirst(23);
        nums.addLast(30);
        System.out.println(nums.contains(10));
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println("Linked List");
        System.out.println(nums);
        ListIterator<Integer> it2 = nums.listIterator(nums.size());
        // Print Reversed Order
        while (it2.hasPrevious()){
            System.out.println(it2.previous());
        }
    }
}
