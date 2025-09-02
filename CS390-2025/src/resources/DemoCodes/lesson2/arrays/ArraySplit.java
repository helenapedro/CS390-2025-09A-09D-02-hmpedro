package lesson2.arrays;

import java.util.Arrays;

public class ArraySplit {

	
	public static void main(String[] args) {
		String s = "hello,how,are,you,today";
		//String s = "hello how,are,you,today";
		//String[] parsedVals =s.split(",| ");
		String[] parsedVals =s.split(",");
		for(String x: parsedVals) {
			System.out.println(x);
	}
		System.out.println(Arrays.toString(parsedVals));
		// Split for delimeters , space, dot or dot space
		String t = "Hello,strings can be fun. They have many uses.";
				String[] result = t.split(",| |\\. |\\.");
				System.out.println(Arrays.toString(result));

	}
}
