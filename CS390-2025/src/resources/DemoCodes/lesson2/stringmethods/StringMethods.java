package lesson2.stringmethods;

import java.util.StringJoiner;

public class StringMethods {
	public static void main(String args[]){
		System.out.println("Hello".charAt(1));
		String expr = "\ud835\udd6b is the set of integers";
		System.out.println(expr);
		System.out.println("𝕫_𝕫".length());
		System.out.println("𝕫_𝕫".charAt(1));
		String name = "Maharishi";
		String nickname = name.substring(0,3); 
		System.out.println(nickname);
		String whole = name.substring(0,name.length());  
		String empty = name.substring(0,0); 
		System.out.println(whole);
		System.out.println(empty);
		System.out.println(empty.length());
		
		String name1 = "Robertt";
		int posOfT = name1.indexOf('x'); 
		System.out.println(posOfT);
		int posOfSubstr = name1.indexOf("bert"); 
		System.out.println(posOfSubstr);
		
		String first = "Renuka";
		String space = " ";
		String last = "Mohanraj";
		String fullname = first + space + last;
		System.out.println(fullname);
		
		String nam = "Robert";
		boolean result = nam.startsWith("Rob");//true
		System.out.println(result);
		boolean result2 = nam.startsWith("R"); //true
		System.out.println(result2);
		boolean result3 = nam.startsWith("bert"); //false 
		System.out.println(result3);
		
		StringJoiner sj = new StringJoiner(",", "{", "}"); 	
		sj.add("George").add("Sally").add("Fred"); 
		String desiredString = sj.toString();
		System.out.println(desiredString);
		
		// CompareTo method
		String s1 = "Java";
		String s2 = "java";
		System.out.println(s2.compareToIgnoreCase(s1));

		
	}

}
