package lesson4;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a Number: ");
		long n = in.nextInt();
		    	
        
		System.out.println("Factorial = " + fact(n));
	//	System.out.println("Factorial of 10 = " + fact(10));
	}
	static long fact(long num) {
	   	if(num == 0 || num == 1) // base case
	 		return 1;
	   	else
	 		return num * fact(num - 1); // Recursive
	}

}
