package lesson3.staticdemo;

public class StaticExample1 {
	// instant variables
	static int count=0;
	int m = 100;
	StaticExample1(){ ++count;}
     public static int getCount(){
    	 int x=50; // Local Variable
    //	int y = m+10; // Cannot access non static member
    	 System.out.println("x = " + x);   
    	     return count;}  
     public void display()
     {
    	 System.out.println("m = " + m);
    	 System.out.println("Count = " + count);
     }
                
	public static void main(String[] args) {
		// demo code for static member and method
		StaticExample1 instance = null;
		for (int i = 0; i < 10; ++i) {
			instance = new StaticExample1();
		}
		System.out.println("Number of instances so far  =" + StaticExample1.getCount());
		instance.display();
	}
}
