package lesson5.day2.newinterfaces;

import java.util.ArrayList;
import java.util.List;

public class TestDefaultInterface {
    public static void main(String[] args) {
        Calculator cal = new MyCalculator();
        MyCalculator ob = new MyCalculator();

        List ob3 = new ArrayList<Integer>();
        cal.test("World"); // Overriding behaviour
        System.out.println(cal.add(12,12));// Default behaviour
        System.out.println(cal.sub(100,35)); // Default behaviour
    }
}
