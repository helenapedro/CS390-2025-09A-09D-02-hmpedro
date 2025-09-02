package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistAPIDemo {
    public static void main(String[] args) {
        // <> - Parameterized type(Recommended) - Accept Only Object no primitive
        ArrayList<String> prglang = new ArrayList<>(); // Default capacity 10
        // If you know the capacity earlier - Better to with Capacity
        ArrayList<String> stulist = new ArrayList<>(21);

        // Raw Type - Object - No compile verification, need downcasting to retrieve specific type
        ArrayList list = new ArrayList();

        prglang.add("Java"); // Compile verify type of data
       // prglang(10); // String is expected, you are passing int

        // Raw type object
        list.add(10); // pos - 0
        list.add("Hello"); // pos 1
        list.add(new Apple()); // pos 2

        // Problem here on retrieval
        Object s1 = list.get(1);
        String s2 = (String) list.get(1);

        ArrayList<String> coll = new ArrayList<>(Arrays.asList(
                "C++","JavaFX"
        ));
        // AddAll to add collection into the existing
        prglang.addAll(coll);
        System.out.println(prglang);
        System.out.println("Size = " + prglang.size());
        System.out.println(prglang.isEmpty());

        for(String x:prglang){
            if(x.length()>3)
                System.out.println(x);
        }
        prglang.set(1,"Kotlin");
        System.out.println(prglang);

        // Convert list to Array
      //   String[] arr = (String[]) prglang.toArray(); // Cause arror
            String[] arr = prglang.toArray(new String[0]); // Initial with 0 and auto allocate with 3
        System.out.println(Arrays.toString(arr));
        System.out.println("Length = " + arr.length);

        // Create an ArrayList of Type Apple
        // Specify type on Left is enough, not necessary to give on right

        var collection  = new ArrayList<Apple>(); // Follow this too

        Apple a1 = new Apple();
        Apple a2 = new Apple("Green",1.2,1.5);
        Apple a3 = new Apple("Green",1.2,1.5);

        List<Apple> apples = new ArrayList<Apple>(Arrays.asList(a1,a2));
        apples.add(new Apple());
        System.out.println(apples.size());
        System.out.println(apples); // Must override toString()
        // Override equals()- work with contains()
        boolean b = apples.contains(a2); // False, Automaltically use equals()
        System.out.println("Boolean = " + b);
        // Remove by passing object need equals()
        apples.remove(a3);
        System.out.println(apples);
        // Can add duplicates and null allowed in ArrayList
        apples.add(a2);
        apples.add(a3);
        apples.add(null);
        apples.add(null);
        System.out.println(apples);
        System.out.println(apples.size());

    }
}
