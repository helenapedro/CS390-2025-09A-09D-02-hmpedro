package lesson8.genericiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GnericRestriction {

	public static void main(String[] args) {
		// Restriction 1
	//	List<String>[] arrayOfLists = new ArrayList<String>[10]; 
		List<List<String>> lists = new ArrayList<>();
		List<String> l1 = new ArrayList<>(Arrays.asList("Java","C++"));
		List<String> l2 = new ArrayList<>(Arrays.asList("FPP","MPP"));

		lists.add(l1);
		lists.add(l2);
		System.out.println(lists);
		List<String> fl = lists.get(0);
		System.out.println(fl);
		// int is primitive but int[] is an array object
		List<int[]> nums = new ArrayList<>();
		nums.add(new int[]{1,2,3,4,5});
		nums.add(new int[]{11,22,33,44,55});
		System.out.println("List of Array Collection");
		for(int[] arr: nums){
			System.out.println(Arrays.toString(arr));
		}

		// Java 10 var 
		var ob = new ArrayList<Integer>();
		ob.add(10);
		ob.add(20);
		var x = 10; // automatically take type from the input
		

	}

}
