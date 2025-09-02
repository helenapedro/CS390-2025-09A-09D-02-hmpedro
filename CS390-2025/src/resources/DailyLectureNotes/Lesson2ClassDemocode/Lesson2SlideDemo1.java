package lesson2;

import java.util.Scanner;

public class Lesson2SlideDemo1 {
    public static void main(String[] args) {
        // Both declaration and initialization at one step

      int  a = 20;

        //JDK 10 var is introduced to decalre variable
        var x = 20; // int type is assigned
      //  x = 23.45; // Cannot assign double to int type
        var y = 2.34; // Hold double data
        y = y + 2.2;

        float f1 = 23.44f; // 23.45F;
        long l1 = 12L;
        // Declaration
        int k;
        // Initialization
        k = a + x;
        int a1 = 20;
        boolean res = a==a1; // == comparing the equality return boolean
        System.out.println(res);
      char c = 'y';
      char c1 = 65;
      char c2 = '\u0123';
      System.out.println(c);
      System.out.println(c1);
      System.out.println(c2);
      // Supplementary chars or Surrogates
      // First Time set // IntelliJ - Go to File -> File Properties -> File Encoding to UTF-8
      System.out.println("\ud835\udd6b");
      // Escape Sequence characters
      System.out.println("Hello \t dear, \n Welcome to \"onboard\"");
      String s = "Use \"\\t\" to produce a tab.";
      System.out.println(s);
      // To get Input from the Console, JOptionPane, Scanner, BufferedReader
      Scanner input = new Scanner(System.in);
    //  System.out.println("Enter Temp in whole numbers");
      //int temp = input.nextInt();
     // System.out.println("Todays Temp = " + temp);
      int xy = -5 % 2; // REminder
      System.out.println(xy);
      // Java introduce Math.floolMod to get rid of - reminder
      System.out.println(Math.floorMod(-5,2));
      if(10>15)
        System.out.println(true);
      else System.out.println(false);
      // Ternary operator
      System.out.println(10>15?true:false);
      int b1 = 100, b2=55,b3=19;
      int max = b1 > b2 ? (b1 > b2 ? b1 : b2) : (b2 > b3 ? b2 : b3) ;
      System.out.println(max);

      // Careful with Division by zero with int and decimal
     // System.out.println(5/0);     //  Run time error – divide by zero
      System.out.println(5.5/0.0); //  Infinity
      System.out.println(-5.5f/0.0f); //  -Infinity
      System.out.println(10.0 % 0); // NaN - Not a number

      // To access Math
      double pi = Math.PI;
     double power =  Math.pow(2,3);

     byte b = 5;
     byte d = 7;
     // Automatic type promotion byte to int
     int res1 = b + d; // You perform arithmetric operations on byte will return int
     byte res2 = (byte) (b+d);
     // Preferences (), * , * + -
     int exp = 10 + 12 - 15 * (2 * 4);
     // Working with String - Object type / Reference type
    String s1 = "Java"; // String Literal - Store at 00AB ref
      String s2 = new String("Java Program"); // String object
      // String are Immutable - Values cannot be changed
      s1 = "Java Coding"; // New memory -Store at 00AC
    //String Literal
      String str1 = "Java";
      String str2 = "Java";
      System.out.println(str1==str2);// == Check references same
      System.out.println(str1.equals(str2)); // Contents are same
      // new String
      String str3 = new String("Java");
      String str4 = new String("Java");
      System.out.println(str3==str4);// == Check references same
      System.out.println(str3.equals(str4)); // Contents are same
    String str5 = str2;
     String str6 = str3;
      System.out.println(str5==str2);
      System.out.println(str6.equals(str3));
      // == compare if it is String Literal as well as primitives
      // equals to compare object

      // String methods
      System.out.println("Hello".length());
      System.out.println("Hello".charAt(0));
      System.out.println("Hello".indexOf("z"));
      System.out.println("Hello".substring(1));
      System.out.println("Hello".substring(0, 2));// 0,1 position chars
      System.out.println("𝕫_𝕫".length()); // Return 5 not 3
    String comb = "abc"+"def" +"hij";
      System.out.println(comb);
    }
}
