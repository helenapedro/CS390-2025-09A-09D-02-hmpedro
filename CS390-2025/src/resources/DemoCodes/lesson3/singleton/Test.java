package lesson3.singleton;

import java.util.ArrayList;
import java.util.List; 
import static java.lang.Math.*;


public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	 SingletonClass  ob = new  SingletonClass();
		 SingletonClass o1 = SingletonClass.getSingletonObject();
		SingletonClass obj1 = SingletonClass.getSingletonObject();
		SingletonClass obj2 = SingletonClass.getSingletonObject();
	
	}

}
