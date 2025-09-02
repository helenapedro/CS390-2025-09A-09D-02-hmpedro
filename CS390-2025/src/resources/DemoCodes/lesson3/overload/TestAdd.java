package lesson3.overload;

public class TestAdd {
	// Method Overloading - determine at compile time - Static binding / Early binding
	// Same method name and different signature inside the same class
	
	
      TestAdd(){
    	  
      }
      TestAdd(int x,int y){
    	  
      }
      
      TestAdd(int a, float b){
    	  
      }
	public int add(int x,int y) {
		return x+y;
	}
	public float add(float f1, float f2) {
		return f1+f2;
	}
	public double add(int a, int b, double d) {
		return a+b+d;
	}
	public void add(int x,float y) {
		System.out.println(x+y);
	}
 
	public static void main(String[] args) {
		TestAdd ob = new TestAdd();
		System.out.println(ob.add(34.56f, 45.78f));
	}

}
