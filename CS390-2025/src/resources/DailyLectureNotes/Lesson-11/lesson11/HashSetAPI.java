package lesson11;

import java.util.HashSet;

public class HashSetAPI {
    public static void main(String[] args) {
        HashSet<String> ob = new HashSet();
        ob.add("Apple");
        ob.add("PineApple");
        ob.add("Peach");
        System.out.println(ob);

        HashSet<Course> courses = new HashSet();
        courses.add(new Course("CS390","FPP"));
        courses.add(new Course("CS390","FPP"));
        courses.add(new Course("CS401","MPP"));
        courses.add(new Course("CS421","Algorithms"));
        System.out.println(courses);
    }
}
