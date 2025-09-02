package lesson3.staticdemo;
      // Utility class - which consists of Static fields and Static method 
public class StaticExample {
  // static int count = 0; // belongs to the class and common to all instances
	int count = 0; // instance variable
	StaticExample() {
		++count;
	}
	
	public int getCount() {
		return count;
	}

	public static void display() {
		System.out.println("Static display");
	}
	public static void main(String[] args) {
		// Demo code for static member
		StaticExample instance = null;
		for (int i = 0; i < 10; ++i) {
			instance = new StaticExample();
		}
		System.out.println("Number of instances so far =" + instance.getCount());
		//System.out.println(StaticExample.count);

	}

}
