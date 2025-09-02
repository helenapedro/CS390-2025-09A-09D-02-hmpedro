package lesson2.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		float f1 = 195.5678f;
		System.out.printf("You owe me $%f \n", f1);		
		System.out.printf("You owe me $%.2f \n", 195.5076);
		System.out.printf("You owe me $%7.2f \n", 195.50);
		
		String res = String.format("%3.2f", 12.45678);
		System.out.println(res);
		
		String name = "Bob";
		int age = 30;
		System.out.printf("Happy birthday %s. I can't believe you're %d\n",name,age);
		String date = String.format("Today's date: %tF", new Date()); // Only Date
		System.out.println(date);
		String date1 = String.format("Today's date: %tc", new Date()); // Print Date and time
		System.out.println(date1);
	}

}
