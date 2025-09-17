package W3L8_HW_Asgmt.after.prob1;

public class MyStringListTest {
    public static void main(String[] args) {
        MyStringList stringList = new MyStringList();
        stringList.add("Bob");
        stringList.add("Steve");
        stringList.add("Susan");
        stringList.add("Mark");
        stringList.insert("Renuka", 4); // Position reached the length
        stringList.insert("Mohanraj", 5); // Position reached the length
        System.out.println(stringList);
        stringList.add("Dave");
        System.out.println("The list of size " + stringList.size() + " is " + stringList);
        stringList.remove("Mark");
        stringList.remove("Bob");
        System.out.println("The list of size " + stringList.size() + " is " + stringList);
        stringList.insert("Richard", 3);
        System.out.println("The list of size " + stringList.size() + " after inserting Richard into pos 3 is " + stringList);
        stringList.insert("Tonya", 0);
        System.out.println("The list of size " + stringList.size() + " after inserting Tonya into pos 0 is " + stringList);
        System.out.println(stringList.find("Susan"));
        // String[] x = (String[]) stringList.clone();
        // System.out.println(Arrays.toString(x));
        System.out.println("-------Return the position (index) of the first occurrence of s in the list.-------");
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            System.out.println(s + " at index " + stringList.indexOf(s));
        }

        System.out.println("\n-------Remove the element at the given position.-------");
        System.out.println("The list of size " + stringList.size() + " before removing an element is: " + stringList);
        String remElement = stringList.removeAt(1);
        System.out.println(remElement + " was removed from the list");
        System.out.println("The list of size " + stringList.size() + " after removing " + remElement + " is " + stringList);
        String old = stringList.set(3, "Peter");
        System.out.println("\nOld element: " + old);
        System.out.println("The list of size " + stringList.size() + " after replacing " + old + " with Peter is " + stringList);
        System.out.println("\nSublist");
        System.out.println(stringList.subList(0,3));
        System.out.println("\nClear the list");
        stringList.clear();
        System.out.println("The list of size " + stringList.size() + " is " + stringList);


    }
}
