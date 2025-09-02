package lesson2.loops;

import java.util.Arrays;
import java.util.Scanner;

public class WhileBreak {
	public static void main(String[] args) {
		// demo code for while using break to sum the positive inputs.
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number: ");
			int value = sc.nextInt();
			if (value <= 0)
				break;
			sum = sum + value;
		}
		System.out.println("Total sum :" + sum);
		sc.close();
	}
}


