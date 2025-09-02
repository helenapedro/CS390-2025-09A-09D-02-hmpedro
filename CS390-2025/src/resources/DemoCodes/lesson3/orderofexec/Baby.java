package lesson3.orderofexec;

import java.util.Random;

public class Baby {
	// First Static block
	static {
		String x = "Baby Class";
		System.out.println("1.Static Fields String x = " + x);
	}
	// Second static block
	static {
		   int rn = getNumber();
		   System.out.println("2. Static Fields Integer rn " + rn);
	   }
	// static method
	public static int getNumber() {
		//	Random r = new Random();
		//	int a = r.nextInt();
			return new Random().nextInt();
		}
	// Instance Fields
		private String name;
		private String gender;
	// Default Constructor
		public Baby() {
			System.out.println("I am exited to see my Baby");
		}
		// Instance block - Anonymous block - will execute for each constructor
		{
			System.out.println("Hearing Baby Crying - Happy");
		}
		public Baby(String name, String gender) {
			this.name = name;
			this.gender = gender;
			System.out.println("I am happy to see " + name + " " + gender + " baby");
		}
}
