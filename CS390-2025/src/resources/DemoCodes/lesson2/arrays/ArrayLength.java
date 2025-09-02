package lesson2.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLength {

	public static void main(String[] args) {
		// demo code to find the length of single and multi dimensional arrays
		int nums[] = {99, -10, 100123, 18, -978,
				5623, 463, -9, 287, 49};
		System.out.println("Length of the Array : " + nums.length);
		System.out.println("Array Values are : " + Arrays.toString(nums));
		int x[] = new int[8];
		x[0] = 10;
		x[1] = 12;
		System.out.println("Length of the Array : " + x.length);

		int y1[] = null;
		//	System.out.println("Length of the Array : " + y1.length);*/ // Run time error
		// Ragged Array - Each row has different length in an array
		String[][] teams = {
				{"Joe", "Bob", "Frank", "Steve"}, // 4
				{"Jon", "Tom", "David"},//3
				{"Tim", "Bev"},//2
		};
		System.out.println("Teams.length =" + teams.length);
		int len = 0;
		int y = teams.length; // provide number of rows
		System.out.println("Number of Rows : " + y);
		for (int i = 0; i < y; i++) {
			len = len + teams[i].length;
			System.out.println(Arrays.toString(teams[i]));
		}
		//	len = len + teams[i].length;
		System.out.println("Length of team Array : " + len);
	}
}
