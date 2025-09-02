package lesson6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;

public class TestMyClass {
    int x = 50;
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.omethod(15);
        // Create an object of Inner class - Way 1
        MyClass.MyInner iob = ob.new MyInner();
        iob.display();
        // Way 2
        MyClass.MyInner iob1 = new MyClass().new MyInner();
       // System.out.println(x);

        // Object of Static Inner class
        MyClass.MyStatic sob = new MyClass.MyStatic();


    }
}
