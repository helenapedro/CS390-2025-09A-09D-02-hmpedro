
package lesson2.arrays;

import java.util.Arrays;
public class ArrayCopyTest {
	public static void main(String args[]){
		int[] smallPrimes = { 2, 3, 5, 7, 11};
		int[] copy = new int[4];
		int[] copy1 = new int[4];
		// Approach 1 - Copying position 1 to 3 from smallPrimes to copy
		System.arraycopy(smallPrimes, 1, copy, 0, 3);
		System.out.println(Arrays.toString(copy));		
		int[] luckyNums = {350, 400, 150, 200, 250};
		//int[] luckyNums=null;
		System.arraycopy(smallPrimes, 1, luckyNums,3, 2);
		System.out.println(Arrays.toString(luckyNums));
		// Approach -2
		// Array Copy - Resizing with new length
		 smallPrimes = Arrays.copyOf(smallPrimes, 8); // pass original array and length
		System.out.println(Arrays.toString(smallPrimes));
		// Approach 3
		int[] original = {1, 2, 3, 4, 5};
		int[]  copy3 = Arrays.copyOfRange(original, 0, 3);  // Copies first 3 elements
		System.out.println(Arrays.toString(copy3));
		// Approach 4
		int[] original1 = {1, 2, 3};
		int[] copy4 = original.clone();
		System.out.println(Arrays.toString(copy4));
		// Approach 5
		int[] original2 = {1, 2, 3, 4, 5};
		int[] copy5 = Arrays.stream(original).toArray();
		System.out.println(Arrays.toString(copy5));

	}
}