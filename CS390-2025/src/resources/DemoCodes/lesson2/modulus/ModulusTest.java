package lesson2.modulus;

public class ModulusTest {

	public static void main(String[] args) {
		///////////////old way
		System.out.println("5 mod 2 = "+ (5%2));
		
		//gives negative answer (which is crazy)
		System.out.println("-5 mod 2 = " + (-5%2) + ", which is negative!"); 
		
		//////////////java 8 way
		System.out.println("-5 mod 2 using Math.floormod= " + Math.floorMod(-5,2));
		
		//gives correct answer
	//	System.out.println("-17 mod 12 = " + Math.floorMod(-17,12) + ", which is >= 0, as it should be");
		//System.out.println(5/0);     //  Run time error – divide by zero
		System.out.println(5.5/0.0); //  Infinity
		System.out.println(5.5f/-0.0f); //  -Infinity
		System.out.println(10.0 % 0); // NaN
	}
}
