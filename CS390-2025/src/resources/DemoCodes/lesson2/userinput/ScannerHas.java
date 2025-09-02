package lesson2.userinput;

import java.util.Scanner;

public class ScannerHas {
	public static void main(String[] args) {

	      String s = "Hello World!\n50\nProgramming Language";
	   //   Scanner in= new Scanner(System.in);
	      
	      // create a new scanner with the specified String Object
	      Scanner scanner = new Scanner(s);
	        
	    
	      // check if the scanner has a token
	      System.out.println("" + scanner.hasNext());

	      // print the rest of the string
	      System.out.println("" + scanner.nextLine());

	      // check if the scanner has an Integer  
	        System.out.println("" + scanner.hasNextInt());
	         System.out.println("" + scanner.nextInt());
	         
	     //     check if the scanner has a token
	           System.out.println("" + scanner.nextLine()); // Which helps to pickup a newline
	           System.out.println("" + scanner.hasNextLine());
	           System.out.println("" + scanner.nextLine());
	     
	         System.out.println("" + scanner.hasNextLine());
	         
	      // close the scanner
	      scanner.close();
	   }
}
