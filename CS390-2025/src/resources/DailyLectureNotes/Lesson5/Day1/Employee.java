package lesson5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// Super class/ Parent class
public class Employee {
	// instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;

// Default Constructor
	public Employee(){
		name = null;
		salary = 0.0;
		hireDay = null;
	}

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear,aMonth,aDay);
	}
	// instance methods
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getHireDay() {
		final String DATE_PATTERN = "MM/dd/yyyy";
		return hireDay.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
