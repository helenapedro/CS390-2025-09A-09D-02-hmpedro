package lesson2.loops;

import java.util.Arrays;
import java.util.Collections;

public class InclassDemo {

	public static void main(String[] args) {
		// Arrays are fixed size. How to change the size
		String[] favoriteTeams = new String[2];
		//favoriteTeams  = { "Blue", "Yellow"}; // Wrong to initialize
		favoriteTeams = new String[] {"Blue", "Yellow","Purple"};
		favoriteTeams[0] = "Blue";
		favoriteTeams[0] = "Yellow";
		
		String[] favoriteTeams1 = {"Blue","yello"};
	//	new int[] { 17, 19, 23, 29 };

			int[] odds = {1,3,5,7,9};
			printArray(odds);
			// Anonnymous array
			printArray(new int[] { 17, 19, 23, 29 });

			for(int i=0,j=0;i<10;i++,j--){

			}
	}
	public static void printArray(int[] col) {
		System.out.println(Arrays.toString(col));
	}
}
