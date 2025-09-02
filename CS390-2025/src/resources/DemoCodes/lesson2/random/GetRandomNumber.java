package lesson2.random;

import java.util.Random;

public class GetRandomNumber {

	public static void main(String[] args) {
		// Can use nextFloat(), nextLong(), nextDouble() 
				// To get a Random number between the range
				int min = 10;
				int max = 100;
				Random random = new Random();
				// Make your own logic
				int  number = random.nextInt(max - min + 1) + min; 
				System.out.println("Range Number = " + number);
				
				// To get an int number below the limit
				number = random.nextInt(500);
				System.out.println("Below 500 Number = " + number);
				
				// To get a Random Value from 0 to 1 as a Double Value using Math.Random
				double r = Math.random();
				System.out.println("Math.random() number :" + r);
				
				// RandomNumber.java
				int rnum = RandomNumbers.getRandomInt(98, 999);
				System.out.println("rmum = " + rnum);
	}
}
