package lesson2.stringmethods;

public class StringLiteralObject {

	public static void main(String[] args) {
	
		
		// == always check the references are same.
		
         // String Literal, use =, stores constant pool, primitive 
		String p1 = "Java";
		String p2 = "Java";
		 //Compare the equality
		boolean res = p1==p2;
		System.out.println("p1==p2 --> " + res);
		
		// String Class/Object -> stores on heap memory, reference
		
		String lang = new String("Java");
		 res = p1==lang;
		System.out.println("p1==lang --> " + res);
		
		System.out.println(lang.equals(p1));
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println(s1==s2);
		
	}

}
