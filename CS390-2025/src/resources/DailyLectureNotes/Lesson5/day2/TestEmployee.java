package lesson5.day2;

public class TestEmployee {
    public static void main(String[] args) {
     Employee e1 = new Employee("Anne",5600);
        Employee e2 = new Employee("Anne",5600);
// Status of object - The values currently hold by the instances
        System.out.println(e1.toString());
        System.out.println(e1) ; // Automatically invoke toString()
  // Check the equality
        boolean b = e1.equals(e2);
        System.out.println(b);
        b = e1.equals(e1);
        System.out.println(b);
        System.out.println(e1.equals(null));

    }
}
