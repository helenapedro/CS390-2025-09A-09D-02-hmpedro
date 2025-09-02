package lesson3.orderofexec;

import java.util.Arrays;
import java.util.List;

// Demo code for the order of execution
public class ClassE {
	// static initialization
	private static int superInt = superIntMethod(); 
	private int number = 10; // instance field
	// static method
	public static int superIntMethod(){
		System.out.println("1-Initializing static super int");
		return 1;
	}
	// Constructor
	ClassE(){
		System.out.println("4-Running ClassE constructor");
	}
	ClassE(int x){
		System.out.println("Parameter Constructor");
	}
	// Instance Initialization Block - initialized immediately after all static initialization 
	{
			System.out.println("3-Running object initialization block");
			System.out.println("Number = " + number);
	}
	static {
		System.out.println("2-Executing static block");
		System.out.println("superInt = " + superInt);
	}
	public static void main(String[] args) {
	//	ClassE ob =  new ClassE();
		new ClassE();
		new ClassE(10);
	}
}
