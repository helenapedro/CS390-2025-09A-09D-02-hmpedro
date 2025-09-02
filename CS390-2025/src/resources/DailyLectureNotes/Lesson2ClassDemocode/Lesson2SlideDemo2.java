package lesson2;

import java.util.Arrays;
import java.util.Date;

public class Lesson2SlideDemo2 {
    public static void main(String[] args) {
      // compareTo
        String s1 = "Java";
        String s2 = "Android";
        int com = "Java".compareTo(s1); // > Pos, < negative == 0
        System.out.println(com);
        double d1 = 234.5678900;
        System.out.println(d1);
        // Formating your output , printf(),String.format()
        System.out.printf("You owe me $%f \n", 195.50f);
        System.out.printf("You owe me $%.2f \n", 195.5076);
        System.out.printf("You owe me $%7.2f \n", 195.50);
        String name = "Bob";
        int age = 30;
        // If any mismatch on the convertion throw runtime error
        System.out.printf("Happy birthday %s. I can't believe you're %d\n",name,age);
        //Retrieve the result as String use format()
        String date = String.format("Today's date: %tF", new Date()); // Only Date
        System.out.println(date);
        String date1 = String.format("Today's date: %tc", new Date()); // Print Date and time
        System.out.println(date1);
        System.out.println(String.format("Today's date: %tF", new Date()));
        //Text Block - Print the text in multiple lines the way you input.
        System.out.println("Object Oriented \nFunctional Programming\nInterrupted programming");
        // New way from JDK 15 """
        String jf = """
                    Object Oriented
                    Functional Programming
                    Interrupted programming
                """;
        System.out.println(jf);
        int a = 10;
        int b = 20;
        var sum = a + b;
        // System.out.println(STR."\{x} + \{y} = \{x + y}");
        // Old way of printing
        System.out.println("Sum of " + a + " and " + b + " = " + sum);
        // New way using String Template(STR), include variable inside "{a}"
        System.out.println(STR."Sum of \{a} and \{b} = \{a+b}");
        System.out.println(STR."Length of \{jf.length()}");
        // Arrays - Collection of values of same type with consecutive memory location
        int x = 20; // Hold single value
        int[] col; // Declared
        col = new int[10];// Allocate a memory for 10 values with default value of 0
        // assign value [index]
        col[0] = 20;
        col[1] = 10;
        col[3] = 30;
        col[5] = 50;
        col[7] = 70;
        col[9] = 90;

        // process all the elements without index
        for (int y: col){
            System.out.println(y);
        }
        // odd index values, specific index use regular foreach - summ odd index
        int s = 0;
        for(int i = 1; i< col.length; i =i+2){
            s += col[i];
        }
        System.out.println(STR."The sum = \{s}");
        // Declare and initialize at one step
        // String lang[]; also correct
        // Recommended
        String[] lang = {"Java", "Python","C++","C#"};
        System.out.println(lang.length);
        // To print the collection without a loop
        System.out.println(Arrays.toString(lang));

        String inp = "Object Oriented,Functional Programming,Interrupted programming,Platform Independent";
            String[] arr =     inp.split(",");
        System.out.println(Arrays.toString(arr));
        System.out.println("Length = " + arr.length);
        arr =     inp.split(" |,");
        System.out.println(Arrays.toString(arr));
        System.out.println("Length = " + arr.length);
        String t = "Hello,strings can be fun. They have many uses.";
        String[] result = t.split(",| |\\. |\\.");
        System.out.println(Arrays.toString(result));
        // Wrong declaration
        String[] favoriteTeams = new String[2]; // Store index 0,1
       // favoriteTeams = {"Player1", "Player2"}; // Wrong
        favoriteTeams[0] = "Player1"; // Fine
        favoriteTeams[1] = "Player2";// Fine
        // Fix it
        favoriteTeams = new String[]{"Player1", "Player2", "Player3", "Player4"};
        // Run time error - out of range index
        System.out.println(favoriteTeams[3]); // 4 - exception
        // Calling myPrint()
        myPrint(favoriteTeams);
        // Pass anonymous array passing
        myPrint(new String[]{"Tom","Bruce","Anne"});
        // System.ArrayCopy()
        int[] smallPrimes = { 2, 3, 5, 7, 11};
        int[] copy = new int[3];
        // Copy first 3 numbers from smallPrimes to copy
        System.arraycopy(smallPrimes,0,copy,0,3);
        myPrint1(smallPrimes);
        myPrint1(copy);
        // I want to resize with length 8the smallPrimes, also copy the original data
        smallPrimes = Arrays.copyOf(smallPrimes,8);
        myPrint1(smallPrimes);
    }
    public  static void myPrint(String[] names){
        System.out.println(names); // Print the reference
        System.out.println(Arrays.toString(names)); // Print in formatted output
    }
    public  static void myPrint1(int[] names){
        System.out.println(Arrays.toString(names)); // Print in formatted output
    }
}
