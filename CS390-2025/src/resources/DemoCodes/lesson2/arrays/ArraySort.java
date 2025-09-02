package lesson2.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Sort
				int[] luckyNums = {350, 400, 150, 200, 250};
				Arrays.sort(luckyNums);
				System.out.println("Sorted List : "+Arrays.toString(luckyNums));
				String names[] = {"Java","Android","Kotlin","C++","SQLite"};
				Arrays.sort(names);
				System.out.println("Natural order Sorted List : "+Arrays.toString(names));
				Arrays.sort(names,Collections.reverseOrder());
				System.out.println("Reversed Sorted List : "+Arrays.toString(names));
	}

}
