package lesson6;

public class TestClass {
    public static void main(String[] args) {
        Outer ob1 = new Outer();
        // Without Object, directly call Outer.Static class name
        Outer.InnerStatic ob2 = new Outer.InnerStatic();
        ob2.test2();
        // Direct
        Outer.InnerStatic.test1();

    }
}
