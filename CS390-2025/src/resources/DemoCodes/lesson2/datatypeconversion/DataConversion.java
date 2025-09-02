package lesson2.datatypeconversion;

public class DataConversion {

	public static void main(String[] args) {
		//int -> long, int -> double automatic, no loss of info
		int x = 123456789;
		long y = x; // automatic conversion from int to long
		double w = x; // automatic conversion from int to double
		
		System.out.printf("x=%d,y=%d, w=%f\n", x, y, w);
		
		//int -> float, long -> float, long -> double: automatic but may lose info
		int a = 123456789;
		float b = a; // Automatic
		long c = 123456789123456789L;
		float d = c; // Automatic
		double e = c; // Automatic
		System.out.printf("\na=%d, \nb=%f,\nc=%d, \nd=%f, \ne=%f\n", a,b,c,d,e);
		//char -> int - automatic
		char s = 'a';
		int t = s; // Char to int
		System.out.printf("%c, %d", s, t);
		
		// Explicit convertion, doing type casting - data loss
	  float z = 123.567f;
	  int z1 =  Math.round(z);
	  int z2 = (int) z; // Explicit, Compiler enforce
	  System.out.println("\nz1:" + z1);
	   System.out.println("\nz2:" + z2);
	   double sum = 12 + 23.45;
	   // exp = a  * b * c;  a = int; b = long; c = double ;exp = double
	   byte b1 = 5;
	   byte b2 = 3;
	   byte b3 = (byte) (b1 + b2);
	   int sum1 = b1 + b2;

	   int x1;
	   double d1= 123.567;
	   x1 = (int)d1;
	   
	}

}







/*	// int - long automatic, lont to int - not automatic
		long ab = 123L;
		
		int xy =(int) ab;
		
		int k = 10;
		
		double m = k+7.88;
		
		byte b1 = 20;
		byte b2 = 30;
	byte  b3 = ((byte)( b1 + b2));
	
	double exp = (5+10) / (67/5) - 9% 2;*/
