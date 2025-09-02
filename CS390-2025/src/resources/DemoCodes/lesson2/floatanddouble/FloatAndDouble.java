package lesson2.floatanddouble;

public class FloatAndDouble {
	
	public static void main(String[] args){
		float x = 0.0F + 1.0F/17;
		double y = x;
		System.out.println(x==y);
		
		System.out.println("float value of x: " + x);
		System.out.println("double value of x: " + y);
		
		System.out.println("float value of x*x: " + x*x);
		System.out.println("double value of x*x: " + y*y);
		System.out.println(x*x==y*y);
	}

}
