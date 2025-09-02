package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonthvalue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int firstFibNum;
	  	  int secondFibNum;
	  	  int nth;
	  	BufferedReader keyboard = new
	            BufferedReader(new InputStreamReader(System.in));

	  	  System.out.print("Enter the first Fibonacci number: ");
	       firstFibNum = Integer.parseInt(keyboard.readLine());
	 	  System.out.println();

	       System.out.print("Enter the second Fibonacci number: ");
	       secondFibNum = Integer.parseInt(keyboard.readLine());
	       System.out.println();

	    	  System.out.print("Enter the desired Fibonacci number: ");
	   	  nth = Integer.parseInt(keyboard.readLine());
	 	  System.out.println();

	 	  int res = fib(nth); // 1  1  2  3  5 8
	      System.out.println(res);

	}
	public static int fib(int n) { 
		if(n == 0 || n == 1) 
	      {   return n;  
	      }  
		return fib(n-1) + fib(n-2); 
		}   

}
