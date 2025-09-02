package lesson3.dateapi;

import java.util.*; // for GregorianCalendar
import java.text.*; // for DateFormat Class

public class CalenderExample {
	public static void main(String[] args) {
		// Creates a GregorianCalendar object for the quizDay, outputs
		// information about the day, and modifies the day using class
		// methods
		// Creates the quiz day object to store the day of the quiz

		GregorianCalendar quizDay = new GregorianCalendar(2023, Calendar.JUNE, 2);
		//System.out.println("Quiz Date :" + quizDay);
		int month, day; // store date attributes
		// Get integer value for the characteristics
		day = quizDay.get(Calendar.DAY_OF_MONTH);
		System.out.println("Day: " + day);
		
		month = quizDay.get(Calendar.MONTH) +1;
		System.out.println("Month: " + month);
		int weekday = quizDay.get(Calendar.DAY_OF_WEEK);  //1 - 7
		System.out.println("Day of the Week :" + weekday);
		// Make the quiz 2 days earlier
		// Get the new date
		quizDay.add(Calendar.DAY_OF_MONTH, 2);
		day = quizDay.get(Calendar.DAY_OF_MONTH);
		System.out.println("Day of the quiz: " + day);
		month = quizDay.get(Calendar.MONTH)+1;
		System.out.println("Month of the quiz: " + month);
		System.out.println("Year of the quiz: " + quizDay.get(Calendar.YEAR));
	}
}
