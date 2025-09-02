package lesson3.classexamples;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;
	private GregorianCalendar gc;

	// constructor
	Employee(String name, String nickName, double salary, int aYear,
			int aMonth, int aDay) {
		this.name = name;
		this.nickName = nickName;
		this.salary = salary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
		gc = cal;
	}

	public GregorianCalendar getGc() {
		return (GregorianCalendar) gc.clone();
	//	return gc;
	}
	
	// instance methods
	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	}

	// Date is a mutable object
	public Date getHireDay() {
		//return hireDay; // Mutable
		return (Date)hireDay.clone(); // Clone copy, original cannot be modified
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

}
