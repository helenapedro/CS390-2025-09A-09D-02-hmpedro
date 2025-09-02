package lesson3.callbyvaluereference;

public class CallByValuePrimitives {
	public static void main(String[] args) {
		CallByValuePrimitives c = new CallByValuePrimitives();
		int num = 50;
		c.triple(num);
		//value of num is still 50
		System.out.println(num);
		
	}
	public void triple(int x) {
		x = 3 * x;
	}
}
