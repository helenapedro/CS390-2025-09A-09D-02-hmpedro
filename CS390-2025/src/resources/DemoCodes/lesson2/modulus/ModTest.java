package lesson2.modulus;

public class ModTest {
	// Logic from the API library
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = floorMod(-5,4);
		System.out.println("Mod result: " + res );

	}
	static int floorMod(int x, int y) {
        return x - div(x, y) * y;
    }
	
	public static int div(int x,int y) {
		int r = x / y;
		int s = x^y;
		System.out.println("Shift x^y result : " + s);
		System.out.println("Remainder r : " + r);
        // if the signs are different and modulo not zero, round down
        if ((s < 0) && (r * y != x)) {
            r--;
        }
        System.out.println("The result of Remainder r:" + r);
        return r;
	}
}
	/*
	 Mathematical Definition: n mod m is
the nonnegative number r less than m
for which there is a quotient q satisfying
n = m * q + r
Therefore: -5 mod 2 is the nonnegative
number r less than 2 (i.e. r is 0 or 1)
satisfying
-5 = 2 * q + r (for some q)
It follows
q = -3, r = 1
so
-5 mod 2 = 1
	 */
	 


