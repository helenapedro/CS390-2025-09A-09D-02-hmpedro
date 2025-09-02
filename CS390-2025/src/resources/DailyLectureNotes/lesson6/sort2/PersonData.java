package lesson6.sort2;

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
		// Outside Name Comparator
		PersonData pd = new PersonData();
		MyComparator com = pd.getComparator();
		System.out.println("Before Sorting: " + Arrays.toString(persons));
		Arrays.sort(persons,com);
		System.out.println("After Sorting: " + Arrays.toString(persons));

	}
	// Member Inner Class to implements Comparator
	private class MyComparator implements Comparator<Person>{
		// To sort by Last name
		@Override
		public int compare(Person o1, Person o2) {
			return o1.getLname().compareTo(o2.getLname());
		}
	}
	// Write a getter to return the object of MyComparator
	private MyComparator getComparator(){
		return new MyComparator();
	}

}
