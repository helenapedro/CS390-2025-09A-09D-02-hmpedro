package lesson3.localfieldinit;

public class Fieldinitialization {
	// Instance Fields - automatically initialized with default values 
	int x; // Default - 0
	float f; // Default - 0.0
	char c; // // Default - \u0000
	String s; // Default - null
	double d; // Default - 0.0
	boolean b; // // Default - false
	public void test() {
		int k=10; // Local variable 
		k+=x;
	}
}
