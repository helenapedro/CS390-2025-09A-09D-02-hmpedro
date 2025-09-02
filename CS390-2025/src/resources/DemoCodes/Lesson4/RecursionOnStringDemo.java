package lesson4;

public class RecursionOnStringDemo {
	
	public static void main(String args[]){
		int res = length("Java");
		//String x = "Java";
		System.out.println("Length of Java " + res );
		
	//	System.out.println(x.substring(1));
		System.out.println("Length of a String is :" + length(null));
		System.out.print("Reversed String is :"); 
		printCharsReverse("Java");

	} 
	// Recursive Method to find the length of a String
	public static int length(String str) {
        if (str == null || str.equals("")) {
            return 0;
        } else {
            return 1 + length(str.substring(1)); // ava, va, a, ""
        }
    }
	// Recursive method to print the string in reverse order
	public static void printCharsReverse(String str) {
        if (str == null || str.equals("")) {
            return;
        } else {
        	//System.out.print(str.charAt(0));
        	printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
      }
  }

