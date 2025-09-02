package lesson12.inclassexercise;

import java.util.Arrays;
import java.util.Scanner;

public class RuntimeExceptionsScenario {
    public static void main(String[] args)  {
        // 1. Arithmetic Exception
        int x = 0;
        //if(x==0) throw new ArithmeticException();
     //   System.out.println(10/0); // int number/0;

        // 2. NullPointerException
        String s=null;
        System.out.println(s); // No problem ,print null on console
        // Try to invoke some methods or fields cause NPE
       //  System.out.println(s.length());
        Float[] f = new Float[10]; // Float Object
        System.out.println(Arrays.toString(f)); // Print 10 locations with null
      //  System.out.println(f[0].compareTo(20.5f)); // Try to call null.compareTo
       // System.out.println(f[10]); // Access 0 to 9, Cause ArrayIndexOutOfBounds()
        // 3. ClassCastException
        Object o = Integer.valueOf(10);

     //   String s1 = (String)o; // Object to String ClassCastException
        Integer i1 = (Integer) o; // Fine

        //5. NumberFormatException - Paring may face this situation
        String num = "20s";//"20" No issue
      //  int a = Integer.parseInt(num);
        //int a = Integer.valueOf(num);

//6. InputMismatchException - Get the input the from the console
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a int value");
      //  int b = input.nextInt();
        try {
            getAge(-5);
        }
        catch (MyException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void getAge(int age) throws MyException {
        // At the particular point can throw a exception using new Keyword with message
       // if(age<0) throw new IllegalArgumentException(); // Invoking default Constructor
        //Invoke by using Parameter Constructor
        if(age<0) throw new MyException(age);
        if(age>=18)
            System.out.println("Adult");
        else
            System.out.println("Not an adult");
    }
}
