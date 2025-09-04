package W1L3_HW_Asgmt.problem2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class EventDateCalculator {
    private static final DateTimeFormatter INPUT = DateTimeFormatter.ofPattern("yyyy-M-d H:mm"); // parse
    private static final DateTimeFormatter NICE_FORMAT = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy 'at' HH:mm VV", Locale.ENGLISH); // output

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
            System.out.print("Enter event date & time (yyyy-M-d H:mm), e.g. 2025-10-22 14:21: ");
            String input = sc.nextLine().trim();
            try {
                return LocalDateTime.parse(input, INPUT);
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public String formatEventDetails(ZonedDateTime target) {
        ZonedDateTime now = ZonedDateTime.now(target.getZone());
        long totalMinutes = ChronoUnit.MINUTES.between(now, target);
        long abs = Math.abs(totalMinutes);
        long days = abs / (24 * 60);
        long hours = (abs / 60) % 24;
        long minutes = abs % 60;

        return (totalMinutes >= 0)
                ? String.format("Time until event: %d days, %d hours, %d minutes", days, hours, minutes)
                : String.format("Event was %d days, %d hours, %d minutes ago", days, hours, minutes);
    }

    public static void main(String[] args) {
        EventDateCalculator eventCalculator = new EventDateCalculator();

        String eventName = eventCalculator.readEventName();
        LocalDateTime eventLdt = eventCalculator.readEventDateTime();
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime eventZdt = eventLdt.atZone(zone);

        System.out.printf("Event name: %s%n", eventName);
        System.out.println("Your event is scheduled for: " + eventZdt.format(NICE_FORMAT));
        System.out.println(eventCalculator.formatEventDetails(eventZdt));
    }
}
