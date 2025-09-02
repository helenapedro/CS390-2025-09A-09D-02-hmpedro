package lesson5.day2.interfaces;
// Class implement multiple interfaces not extends multiple class
public class MyTestClass implements MyInterface,Calculator {
    public static void main(String[] args) {
        // You cannot create object for the interface;
        //MyInterface ob1 = new  MyInterface();
        // You can declare as Interface type
        MyInterface ob = new MyTestClass();
        System.out.println(ob.add(5,10));
        System.out.println(ob.sub(5,10));
        // To Call the constants use Interface.field
        int val = MyInterface.x;
       //  MyInterface.x = 30; // Cannot change the data due to final
        System.out.println("Interest = " + MyInterface.INT_RATE);


    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public String concat(String a, String b) {
        return "";
    }
}
