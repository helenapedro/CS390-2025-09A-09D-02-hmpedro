package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnderstandListSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                Arrays.asList("Renuka", "Asmaa", "Moe", "Alex",
                        "Magdy", "Hua", "Bishnu")
        );
        // It is Collection is an Interface List is Collection
        // To Sort can use Utility class Collections
        System.out.println("Before Sorting" + names);
        Collections.sort(names);
        System.out.println("After Sorting" + names);
        // To get Reversed
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverded Sorting" + names);

        Apple a2 = new Apple("Green",3.3,2.5);
        Apple a1 = new Apple("Green",2.3,1.5);
        Apple look = new Apple("Green",2.3,1.5);
        List<Apple> apples = new ArrayList<>(
                Arrays.asList(a1,a2)
        );
        // Sort the apple collection by price

        Collections.sort(apples,(o1,o2) -> Double.compare(o1.getPrice(),o2.getPrice()));
        System.out.println("After sort by price list " + apples);
        // Efficiently perform Binary Search if the list is sorted

        List<String> names1 = new ArrayList<>(
                Arrays.asList("Mohanraj", "Asmaa", "Taing", "Alex",
                        "Magdy", "Nan", "Bishnu")
        );
        Collections.sort(names1);
        System.out.println("Sorted names 1 = " + names1);
        // Do Binary Search
       int index =  Collections.binarySearch(names1,"Nan");
        System.out.println("Index of Nan for BSearch = " + index); // Positive index
        index =  Collections.binarySearch(names1,"CRIS");
        System.out.println("Index of CRIS for BSearch = " + index); // Negative index
    }
}
