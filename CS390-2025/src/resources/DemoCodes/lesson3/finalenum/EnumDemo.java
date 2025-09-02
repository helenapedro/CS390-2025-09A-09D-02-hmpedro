package lesson3.finalenum;

enum Currency {
    US, INDIA, UK
}
class sample1 {
	void display(Currency cy) {
        switch (cy) {
            case US -> System.out.println("Dollar");
            case INDIA -> System.out.println("Rupee");
            case UK -> System.out.println("Pounds");
        }
	}
}
 public class EnumDemo {
	 public static void main(String[] args){
		sample1 s = new sample1();
		s.display(Currency.US);
		s.display(Currency.INDIA);
		s.display(Currency.US);
		// Convert String to Enum
		String x = "uk";
		x = x.toUpperCase();
		Currency input = Currency.valueOf("UK");  // Converting String Input into Enum Type
		s.display(input);
		
	 }
	 
	 
}