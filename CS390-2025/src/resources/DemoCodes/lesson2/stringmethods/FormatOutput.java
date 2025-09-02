package lesson2.stringmethods;

import java.text.MessageFormat;
import java.util.Date;

public class FormatOutput {
	public static void main(String args[]) {
		System.out.printf("%4.3f",1234.6789f);
		System.out.println();
		System.out.printf("You owe me $%f \n", 195.50);		
		System.out.printf("You owe me $%.2f \n", 195.5076);
		System.out.printf("You owe me $%7.2f \n", 195.50);
		String name = "Bob";
		int age = 30;
		System.out.printf("Happy birthday %s. I can't believe you're %d\n",name,age);
		String oweMe = String.format("You owe me %.2f dollars", 196f);
		String oweMe2 = String.format("You owe me %d dollars", 196);
		System.out.println(oweMe);
		System.out.println(oweMe2);
		System.out.println("Todays date : " + new Date());
		String date = String.format("Today's date: %tD", new Date()); // Only Date
		System.out.println(date);
		String date1 = String.format("Today's date: %tc", new Date()); // Print Date and time
		System.out.println(date1);
		int x = 'K';
		int x1 = 123;
		System.out.printf("Hexa Decimal Value of x: %x\n",x);
		System.out.printf("Hexa Decimal Value of x1: %x",x1);
		System.out.printf("\n%-6d #%4s#%7.2f\n", 1234, "Java", 51.6653);
		
	/*	Object [] params = {"animal", "dog"};
		String stringWithParameter = 
		    "Look at that {0} -- it looks like a {1}.";
		System.out.println("original string: " + stringWithParameter);
		System.out.println("formatted string: " + MessageFormat.format(stringWithParameter,params));
	*/
	}
}
