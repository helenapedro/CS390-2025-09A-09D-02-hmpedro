package lesson2.stringmethods;


import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.StringJoiner;

public class TestString {

	public static void main(String[] args) {
		String s1 = "Java"; // String Literal
		String s2 = "Java";
		// Compare equality for Literal can use ==, check references are same
		boolean res = s1==s2;
		System.out.println("== : " + res);
		
		// String using new
		String s3 = new String("Java");
		String s4 = new String("Java");
		//res = s3==s4; // not recommneded to use ==, recommended is equals method
		// equals compare contents are same
		res = s3.equals(s4);
		System.out.println("new String : " + res);
		
		// Assigning the object
		
		String c = "FPP";
		String c1 = new String("MPP");
		String c3 = c; // both c and c3 are same reference/object
		res = c.equals(c3);
		System.out.println("Assign reference  : " + res);
		
	}
		
	

}
