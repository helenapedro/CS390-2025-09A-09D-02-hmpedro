package lesson3.overload;

class Area
{
	Area()
	{
		
	}
	Area (int a)
	{
		this(10,20); // calling constructor
				System.out.println("Area of square =" + a * a);
		
	}
	Area( int a, int b)
	{
		
		System.out.println("Area of Rectangle=" + a * b);
	}
	
	Area(int l, int b, int h)
	{
		System.out.println("Area of Cube =" + l * b * h);
		
	}
}
public class AreaConstructor {

	// Demo code for Constructor overloading and creation of array of objects
	public static void main(String[] args) {
		Area[] obj1 = { new Area(5), new Area(12,8), new Area(5,7,3)};
		Area[] obj = new Area[4];
		obj[0] = new Area(5);
		obj[1]= new Area(12,5);
		obj[2] = new Area(5,7,4);
		obj[3] = new Area(6);
		
	}
}
