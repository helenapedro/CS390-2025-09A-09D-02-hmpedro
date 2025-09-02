package lesson5;

public class TestRuntime {
    public static void main(String[] args) {
        String x = "Hello";
        System.out.println(x instanceof String);
        System.out.println(x instanceof Object); // Default super type for any object is Object
        Manager boss = new Manager("Boss Guy", 80000, 2009, 12, 15);
        boss.setBonus(5000);
       Employee e1 =  new Employee("Jimbo", 50000, 2012, 10, 1);

        System.out.println(e1 instanceof Manager); // false
        System.out.println(boss instanceof Manager);// true
        System.out.println(boss instanceof Employee); // true
        System.out.println(boss instanceof Object); // true



    }
}

