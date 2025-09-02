package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistAPIDemo {
    public static void main(String[] args) {
     // How to make use ArrayList API from Java collection framework library
        ArrayList<String> prglist = new ArrayList<>();//Default Constructor
        prglist.add("C++"); // pos 0
        prglist.add("HTML"); // pos 1
        System.out.println("Size = " + prglist.size());
        prglist.add(1,"Java");
        System.out.println(prglist);
      //  prglist.add(4,"Java 22"); // Cause IndexOutofBounds(0 to size)

        // Raw Type - Object

        ArrayList pl = new ArrayList<>(5);
        pl.add(10);
        pl.add("Hello");

       // int p0 = pl.get(0); // You have to downcast

        // Always prefer to go with Generic Type<Type of data> on left side, specify it on left type
        // You can mention type on right side too, but not necessary
        //   ArrayList<String> pl1 = new ArrayList<String>(5);
        ArrayList<String> pl1 = new ArrayList<>(5);
        pl1.add("Python");
        pl1.add("Go");
        // Use addAll()
        prglist.addAll(pl1);
        System.out.println(prglist);
        System.out.println("Size = " + prglist.size());


        // Search - contains()
        boolean res = prglist.contains("Go");
        System.out.println("Contains Go = " + res);

        // Indexof

        prglist.add(1,"Go");
        System.out.println(prglist);
        // Left to Right
        System.out.println(prglist.indexOf("Go"));
        // Right to Left
        System.out.println(prglist.lastIndexOf("Go"));
        System.out.println(prglist.get(2));// Index 0 to Size-1
       String old =  prglist.set(1,"Scala");
        System.out.println("Old = " + old + "\n New data ="+prglist.get(1));
        old = prglist.remove(1);
        System.out.println("Removed = " + old);

        // Initialize and declare it

        List<Integer> num = new ArrayList<>(Arrays.asList(12,45,67,89,23,56));
        System.out.println(num);
        // var decalration
        var applist = new ArrayList<Apple>();
            applist.add(new Apple());
            applist.add(new Apple("Green",2.3,1.99));
            Apple a1 = new Apple("Green",2.3,1.99);

        System.out.println(applist); // Must override toString()
        System.out.println(applist.contains(a1));

        // Converting ArrayList to Array
      //  String[] arr = prglist.toArray(); // Cause error
        // List to Array
        String[] arr = prglist.toArray(new String[0]);
        System.out.println(prglist.size());
        System.out.println("Length" + arr.length);

    }
}
