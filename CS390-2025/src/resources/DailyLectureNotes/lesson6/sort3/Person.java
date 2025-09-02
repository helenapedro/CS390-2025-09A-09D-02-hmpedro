package lesson6.sort3;

import java.util.Comparator;

public class Person {
	private String fname;
	private String lname;
	private double salary;
	
	public Person(String n, String l, double salary) {
		fname = n;
		lname = l;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLname() {
		return lname;
	}
	@Override
	public String toString() {
		return fname + " " + lname;
	}
	// Static Inner class
	static public class StaticComparator implements Comparator<Person> {
		// Last name reversed
		@Override
		public int compare(Person o1, Person o2) {
			// To get reversed, change the argument comparision order
			return o2.getLname().compareTo(o1.getLname());
		}
	}

}
