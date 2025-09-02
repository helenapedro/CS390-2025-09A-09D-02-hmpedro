package lesson3.callbyvaluereference;

class Test {
	/*
	 * This method causes no change to the arguments used in the call.
	 */
	void noChange(int a, int b) { // Formal arguments
		a = a + b; // 35
		b = -b; // -20
	}
}
public class CallByValue {
	public static void main(String[] args) {
		Test ob = new Test();
		int a = 15, b = 20;
		System.out.println("a and b before call: " + a + " " + b);// 15 20
		ob.noChange(a, b); // Actual Arguments
	    System.out.println("a and b after call: " + a + " " + b); // 35 -20, 15 20, 
	}
}
