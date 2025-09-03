package W1L3_HW_Asgmt.problem2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EventDateCalculator {
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-M-d");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public Period daysUntilEvent(LocalDate eventDay) {
        LocalDate today = LocalDate.now();
        return Period.between(today, eventDay);
    }

    public String readEventName() {
        Scanner sc = new Scanner(System.in);
        String eventName;

        System.out.print("Please type the event name: ");
        eventName = sc.nextLine();
        return eventName;
    }

    public LocalTime readEventTime() {
        Scanner sc = new Scanner(System.in);
        LocalTime eventTime;

        while (true) {
            System.out.print("Please enter event time: " +
                    "in hh:mm AM/PM format (e.g 14:21): ");
            String input = sc.nextLine();
            try {
                eventTime = LocalTime.parse(input, timeFormatter);
                return eventTime;
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public LocalDate readEventDate() {
        Scanner sc = new Scanner(System.in);
        LocalDate eventDay;

        while (true) {
            System.out.print("Please enter event day: " +
                    "in yyyy-M-d (e.g. 2025-9-22): ");
            String input = sc.nextLine();
            try {
                eventDay = LocalDate.parse(input, dateFormatter);
                return eventDay;
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public static void main(String[] args) {
        EventDateCalculator eventCalculator = new EventDateCalculator();

        String eventName = eventCalculator.readEventName();
        LocalDate eventDate = eventCalculator.readEventDate();
        LocalTime eventTime = eventCalculator.readEventTime();

        Period periodUntilEvent = eventCalculator.daysUntilEvent(eventDate);
        LocalDateTime eventDateTime = LocalDateTime.of(eventDate, eventTime);

        System.out.printf("Event name: %s%n ", eventName);
        System.out.println("Your event is scheduled for: " + eventDateTime);
        System.out.printf("Time until event is %d years, %d month(s)" + " and %d days%n",
                periodUntilEvent.getYears(),
                periodUntilEvent.getMonths(),
                periodUntilEvent.getDays());
    }
}
