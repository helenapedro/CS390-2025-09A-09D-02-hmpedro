package lesson6;

public class LocalClass {// Outer class
    private int x = 10;
    private String s = "Hello";

    //Pre JDK 8, the variable z must declare final, if you access z inside Local class
    // From JDK 8, not necessary to declare final, by default, it is effectively final
    public void myMethod( int z){
        int a=10; // Local variable
        z = z + 10;
        /* Local Class inside a method,
         It cannot access outside method
         Even a clas declared as public, default, protected
         Provide strong encaptulation
         */
        a = a + 20;
       class Local{
            private int a1 = 20;
            private String s1 = "Welcome";
            Local(){
            }
            public void localMethod(int a, int b){
                a = a + 20;
              //  z = z + 50;
                System.out.println("Outer x = " + x);
                System.out.println("Local Var : " + a);
                System.out.println("Sum = " + (a + b));
            }
        }
        // Inside the method can create an instance of Local class to access
        Local ob = new Local();
       ob.localMethod(23,23);
    }
}
