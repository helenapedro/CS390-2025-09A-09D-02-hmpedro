package lesson3.dateapi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Return today's date
       
        LocalDate tomorrow = today.plusDays(1);
        LocalDate oneDecadeAgo = today.minus(1, 
                ChronoUnit.DECADES); // Standard set of date period units - 1 Decade = 10 years
        LocalTime timeOnly = LocalTime.now(); // Time is represented to nanosecond precision
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
        		
        System.out.println(STR."Day of month: \{today.getDayOfMonth()}");
        System.out.println(STR."Today is \{today}");
        System.out.println(STR."Tomorrow is \{tomorrow}");
        System.out.println(STR."A decade ago was \{oneDecadeAgo}");
        System.out.println(STR."Year : \{today.get(ChronoField.YEAR)}");
        System.out.println(STR."Day of year:\{today.getDayOfYear()}");
        System.out.println(STR."Current Time : \{timeOnly}");
        System.out.println(STR."Current Date and Time : \{dateTime}");
        System.out.println(STR."Current Date and Time with Zone: \{dateTimeWithZone}");
        System.out.println(STR."Is Leap Year : \{today.isLeapYear()}");
    }
}