package W1L3_HW_Asgmt.problem2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventDateCalculator {
    private static final DateTimeFormatter INPUT = DateTimeFormatter.ofPattern("yyyy-M-d HH:mm"); // parse
    private static final DateTimeFormatter NICE_FORMAT = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy 'at' HH:mm"); // output

    public long daysUntilEvent(LocalDate eventDay) {
        LocalDate today = LocalDate.now();
        return ChronoUnit.DAYS.between(today, eventDay);
    }

    public String readEventName() {
        Scanner sc = new Scanner(System.in);
        String eventName;

        System.out.print("Please type the event name: ");
        eventName = sc.nextLine();
        return eventName;
    }

    public LocalDateTime readEventDateTime() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter event date & time (yyyy-M-d HH:mm), e.g. 2025-10-22 14:21: ");
            String input = sc.nextLine().trim();
            try {
                return LocalDateTime.parse(input, INPUT);
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public LocalDate readEventDate() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter event day: " +
                    "in yyyy-M-d (e.g. 2025-9-22): ");
            String input = sc.nextLine();
            try {
                return LocalDate.parse(input, INPUT);
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public String formatEventDetails(LocalTime target) {
        LocalDate now = LocalDate.now();
        long totalMinutes = ChronoUnit.MINUTES.between(now, target);
        long abs = Math.abs(totalMinutes);

        long days = abs / (24 * 60);
        long hours = (abs / 60) % 24;
        long minutes = abs % 60;

        if (totalMinutes >= 0) {
            return String.format("Time until event: %d days, %d hours, %d minutes", days, hours, minutes);
        } else {
            return String.format("Event was %d days, %d hours, %d minutes ago", days, hours, minutes);
        }
    }

    public static void main(String[] args) {
        EventDateCalculator eventCalculator = new EventDateCalculator();

        String eventName = eventCalculator.readEventName();
        LocalTime eventTime = eventCalculator.readEventDateTime();

        System.out.printf("Event name: %s%n", eventName);
        System.out.println("Your event is scheduled for: " + eventTime.format(NICE_FORMAT));
        System.out.println(eventCalculator.formatEventDetails(eventTime));
    }
}
