package lesson6.sort3;

// Sort1-Outside Comparator

import java.util.Arrays;

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
		// Static inner class with Comparator
		System.out.println("Before Sorting: " + Arrays.toString(persons));
		Arrays.sort(persons,new Person.StaticComparator());
		System.out.println("After Sorting by Last name reversed: " + Arrays.toString(persons));

	}
}
