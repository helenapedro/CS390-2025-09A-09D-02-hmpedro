package lesson2.random;

import java.util.Random;

public class TestMathAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		double res = Math.pow(5, 2);
		// 1. To get a random number from Math
		double rv = Math.random(); // range of 0 to 1
		System.out.println(res);
		System.out.println("Math Random = " + rv);
		// To covert > 1,  digit multiply by 10, 100, 1000 etc.,
		System.out.println("Math Random Multiplied = " + (rv*100));
		//2. Random class - API 
		Random ob = new Random();
		int r1 = ob.nextInt(10);
		System.out.println("r1 = " + r1);
		// 3. You have user defined class RandomNumbers - generate in the range
		int rn = RandomNumbers.getRandomInt(15, 30);
		System.out.println(rn);
		
		// Explicit conversion / Casting
		double  a = 9.997;
		int a1 = (int) Math.round(a);
	System.out.println("Double to int value :" + a1);
		
	// Automatic promotion - Perform Arithmetic operations on byte will give result on int
	byte b1 = 10;
	byte b2 = 11;
	byte b3 = (byte) (b1+b2);
	}
}
