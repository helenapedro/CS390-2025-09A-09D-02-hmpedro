package lesson2.arrays;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String args[]) {
		// Demo for for each and split function
		int [] arr = {4, 5, 12, 25};
		for(int x: arr) {
			System.out.println(x);
		}
		String t = "Hello,strings can be fun.They have many uses.";
				String[] result = t.split(",|\\.| ") ;
				for(String x1: result) {
					System.out.println(x1);
				}
				System.out.println("Splitted Strings : " + Arrays.toString(result));
		String[] favoriteTeams = new String[2];
		favoriteTeams = new String[]{"Sonics", "Mets", "Bulls"}; 
		System.out.println("Splitted Strings : " + Arrays.toString(favoriteTeams));
		  String[] favoriteTeams1 = new String[2];
			favoriteTeams1 = new String[]{"Sonics", "Mets","Bats"};  //compiler error
			System.out.println(Arrays.toString(favoriteTeams1));
	} 
}
