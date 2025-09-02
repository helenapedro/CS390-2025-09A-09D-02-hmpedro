package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayConversionList {
    public static void main(String[] args) {
        // Original array
        String[] array = {"A", "B", "C"};

        // Using Arrays.asList() and creating a new ArrayList and resizable
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        // Using Collections.addAll()
        List<String> list3 = new ArrayList<>();
        list3.add("BB");
        list3.add("CC");
        Collections.addAll(list3, array);
        System.out.println("List3 = " + list3);

        // Using a loop to convert an array to ArrayList
        List<String> list4 = new ArrayList<>();
        for (String s : array) {
            list4.add(s);
        }
        // Convert List to Array
        List<Integer> nlist = new ArrayList<>();
        nlist.add(10);
        nlist.add(20);
        Integer[] listArr =
                nlist.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listArr));



        /* Using Arrays.asList(), fixed array
        make changes on the original affects list too.
        Cannot add elements
        */
        List<String> list1 = Arrays.asList(array);

        System.out.println(" List1 = " + list1);
        array[0] = "AA";
        System.out.println(" List1 = " + list1);
        // list1.add("D"); // Cause runtime error
    }
}
