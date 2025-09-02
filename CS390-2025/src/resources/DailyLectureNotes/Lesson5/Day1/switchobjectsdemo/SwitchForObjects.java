package lesson5.switchobjectsdemo;

public class SwitchForObjects {
	public static void main(String[] args) {
		Employee emp = new Executive("Joe Smith", 100000.00, 
				2014, 9, 1, 5, 2000);
		new SwitchForObjects(emp);
		new SwitchForObjects(new Employee("Tommy",5600.67,2010,10,10));
	}
	public SwitchForObjects(Employee emp) {
		switch(emp) {
			/* Apply the pattern matching, Each case specifies a pattern
		     case Executive ex -> checks if the object is of type Executive,
		     and if so, assigns it to a variable ex.
		     This eliminates the need for manual type casting
		     (instanceof checks + casting).*/
		  case Executive ex -> System.out.println("This executive has "
		    + ex.getNumCompanyShares() + " company shares");
		  case Manager m -> System.out.println("This one is a Manager");
		  case null -> System.out.println("Illegal input");
		  default -> System.out.println("Just an ordinary Employee");
		}
	}
}


