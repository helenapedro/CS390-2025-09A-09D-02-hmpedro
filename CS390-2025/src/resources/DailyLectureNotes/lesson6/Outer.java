package lesson6;

class Outer {
private  int x = 10;
private  String s = "Outer";
private static int ab = 100;
public Outer(){
    System.out.println("Outer Constructor");
    // Directly call StaticClassname.field/method
    InnerStatic.test1();
    System.out.println(InnerStatic.com);
    // To access non-static fields and method, need instance
}
 static class InnerStatic{
    private static int com = 25;
    private  long l = 50l;
    public static void test1(){
        System.out.println(com);
       // System.out.println(x); // Cannot access non static field
      //  System.out.println(l); // Cannot access non static field
        System.out.println(ab);
    }
    public void test2(){
       // System.out.println(x);// instacne field also cannot access outer class non static field
        System.out.println(l); // You can access inner class non-static fields inside instance method
        System.out.println(ab);
    }

 }
}

