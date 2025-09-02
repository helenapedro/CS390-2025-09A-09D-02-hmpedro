package lesson8;

import java.util.*;

public class AppleSort {
    public static void main(String[] args) {

        ArrayList<String> coll = new ArrayList<>(Arrays.asList(
                "C++","JavaFX","Kotlin","Pyhton","HTML"
        ));
        // Sort by nature order
     /*   System.out.println("Before Sort: " + coll);
        Collections.sort(coll);
        System.out.println("After Sort: " + coll);
        Collections.sort(coll,Collections.reverseOrder());
        System.out.println("Reversd Order: "+ coll);*/

        Apple a1 = new Apple(); // "Red",0.450,1.2
        Apple a2 = new Apple("Yello",1.2,1.5);
        Apple a3 = new Apple("Green",1.23,1.54);
        Apple a4 = new Apple("Gold",1.5,1.88);

        List<Apple> apples = new ArrayList<Apple>(Arrays.asList(a1,a2,a3,a4));
    /*    System.out.println("Before Sort by color:" +apples);
        Collections.sort(apples,(o1,o2)->o1.getColor().compareTo(o2.getColor()));
        System.out.println("After Sort by color:" +apples);*/
        // Comparator consist with equlas
        System.out.println("a1 object \n " + a1);
        Apple a5 = new Apple();
        apples.add(a5);
       // System.out.println(apples);
        // Call equals()
        System.out.println("a1 Equals a5 = " + a1.equals(a5)); //
        Apple a6 = new Apple("Red",0.450,2.2);
        System.out.println("a1 Equals a6 = " + a1.equals(a6)); // False
        System.out.println("a6 object \n " + a6);
        // Apple Comparator

        AppleComparator ob = new AppleComparator();
        System.out.println("Comparator of a1 and a6 :" + ob.compare(a1,a6)); // -ve,+ve,0
        ConsistComparator cob = new ConsistComparator();
        System.out.println("Consist Comparator of a1 and a6 :" + cob.compare(a1,a6));

        // Idea behind Consistenct - Whenever equals say true, your comparator return 0
        // If equals() say false, your comparator return +ve, -ve
        // Inside comparator compare all the fields
    }
}
