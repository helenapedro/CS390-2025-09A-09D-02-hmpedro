package lesson6.sort4;

// Sort1-Outside Comparator

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
		PersonData ob = new PersonData();
		ob.myLocalSort(persons);
	}
	// Local Inner class
	private void myLocalSort(Person[] arr) {
		class LocalSort implements Comparator<Person>{
			// Salary wise sorting
			@Override
			public int compare(Person o1, Person o2) {
				/*if(o1.getSalary()>o2.getSalary())
					return 1;
				if(o1.getSalary()<o2.getSalary())
					return -1;
				else
					return 0;*/
				// To get reversed change argument order
				return Double.compare(o1.getSalary(),o2.getSalary());
			}
		}
		LocalSort ob = new LocalSort();
		System.out.println("Before Sorting by Salary: " + Arrays.toString(arr));
		Arrays.sort(arr,ob);
		System.out.println("After Sorting by Salary: " + Arrays.toString(arr));

	}
}
