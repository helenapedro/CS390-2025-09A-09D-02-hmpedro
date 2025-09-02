package lesson3.staticdemo;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportDemo {
	public static void main(String[] args) {
		double radius = 2.8;
		double area = PI * radius * radius;
		double max = max(10.45, 56.78);
		out.println("Value of PI is : " + PI);
		out.println("Radius of Circle : " + radius);
		out.println("Area of Circle : " + area);
		out.println("Square root of 25.0 : " + sqrt(25.0));
	}
}
