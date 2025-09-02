package lesson5.day2;

import java.lang.reflect.InvocationTargetException;

public class Employee {
	//public static  final int ab = 0;
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int sal) {
		this.salary = sal;
	}

	@Override
	public String toString(){
		String res = STR."""
				Name = \{name}
				Salary = \{salary}
				""";
		return res;
	}
	@Override
	// Always argument is Object type only
	public boolean equals(Object ob){
		// Check the input is null or not
		if(ob==null) return false;
		if(this == ob) return true; // Optional
		// Check the type of ob is an Employee instanceof or getClass()
		//if(this.getClass()!=ob.getClass()) return false;
		if(!(ob instanceof Employee)) return false;
		// Convert ob to Employee type, downcasting
		Employee e = (Employee) ob;
		boolean res = this.name.equals(e.name) && this.salary==e.salary;
		return res;
	}

}


