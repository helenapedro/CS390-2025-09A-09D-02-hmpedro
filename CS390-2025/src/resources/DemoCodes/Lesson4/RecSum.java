package lesson4;

import java.util.Scanner;

public class RecSum {
	public static void main(String[] args) {
		// if your input is 5 ==> 1+2+3+4+5
		Scanner in = new Scanner(System.in);
		System.out.print("Type a Number: ");
		int n = in.nextInt();
		RecSum r1 = new RecSum();
		
        
		System.out.println("Sum = " + r1.Sum(n));
	}
	public int Sum(int n)
	{
		if (n == 1)            //base case
			return 1;
		else
			return Sum(n-1) + n; //general case
		
	} 
	public int Sum1(int n)
	{
		 int tot = 0;
		if (n == 1)            //base case
			return 1;
		else{
			tot +=n;
			return tot +Sum(n-1); //general case
		}
	//	return tot;
	} 
}
