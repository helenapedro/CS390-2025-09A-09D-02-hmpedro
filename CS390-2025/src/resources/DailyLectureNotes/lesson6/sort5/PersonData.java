package lesson6.sort5;

// Sort1-Outside Comparator

import lesson6.sort1.FirstNameComParator;

import java.util.Arrays;
import java.util.Comparator;

/** Processes person data. Makes use of an external NameComparator class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons =
			{new Person("Joe","Brown",4566.56),
					new Person("Bob","Roth",3455.23),
			 new Person("Anne","Mary",6788.90),
					new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}
	public static void main(String[] args) {
		
		Person[] persons = prepareData();
		// Anonymous Inner class
		System.out.println("Before Sorting: " + Arrays.toString(persons));
		Arrays.sort(persons, new Comparator<Person>() {
			// Reversed Salary
			@Override
			public int compare(Person o1, Person o2) {
				//return o2.getSalary() - o1.getSalary();
				return Double.compare(o2.getSalary(),o1.getSalary());
			}
		});
		System.out.println("After Sorting: " + Arrays.toString(persons));

		// Lambdas (args) -> {Body}
		System.out.println("Before Sorting using Lambdas : " + Arrays.toString(persons));
		Arrays.sort(persons,(p1,p2)->Double.compare(p1.getSalary(),p2.getSalary()));
		System.out.println("After Sorting using Lambdas : " + Arrays.toString(persons));
	}
}
