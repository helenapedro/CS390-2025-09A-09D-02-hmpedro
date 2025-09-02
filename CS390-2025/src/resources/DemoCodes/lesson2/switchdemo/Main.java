package lesson2.switchdemo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		intSample();
		stringSample();
		double val = 123.56;
	}
	//Fall through Behaviour
	public static void intSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick an integer in the range 1..9 ");
		int val = sc.nextInt();
		System.out.println();
		switch(val) {
			case 2:
			case 4:
			case 6:
			case 8: 
				System.out.println("You chose an even number.");
				break;
			default:
				System.out.println("You chose an odd number.");
		}
	}
	
	public static void stringSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a fruit ");
		String val = sc.next().toLowerCase();
		switch(val) {
			case "apple","apricot":
				System.out.println("Fruit starts with 'A'.");
				break;
			case "cherry":
				System.out.println("'Cherry' starts with 'C'");
				break;
			case "papaya","pine apple": System.out.println("Fruits starts with 'P'");
				break;
			default:
				System.out.println("Bad selection.");
		}	
	}

}
