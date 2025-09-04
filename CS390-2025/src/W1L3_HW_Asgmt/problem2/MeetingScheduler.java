package W1L3_HW_Asgmt.problem2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class MeetingScheduler {
    private static final DateTimeFormatter INPUT = DateTimeFormatter.ofPattern("yyyy-M-d H:mm"); // parse
    private static final DateTimeFormatter NICE_FORMAT =
            DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy ' @ ' HH:mm '['VV']'", Locale.ENGLISH); // output

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

    private static ZoneId readTimeZone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter target time zone (e.g., Africa/Luanda): ");
            String input = sc.nextLine().trim();
            try {
                return ZoneId.of(input);
            } catch (java.time.DateTimeException e) {
                System.out.println("Invalid time zone. Try again.");
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
        MeetingScheduler eventCalculator = new MeetingScheduler();

        String eventName = eventCalculator.readEventName();
        LocalDateTime eventLdt = eventCalculator.readEventDateTime();

        ZoneId target = readTimeZone();
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime eventZdt = eventLdt.atZone(zone);

        var eventInTarget = eventZdt.withZoneSameInstant(target);

        System.out.printf("Event name: %s%n", eventName);
        System.out.println("Your event is scheduled for: " + eventZdt.format(NICE_FORMAT));
        System.out.println(eventCalculator.formatEventDetails(eventZdt));

        // weekday + leap year
        var eventDate = eventLdt.toLocalDate();
        System.out.println("Day of week: " + eventDate.getDayOfWeek());
        System.out.println("Is Leap year? " + eventDate.isLeapYear());
        System.out.println("In target zone: " + eventInTarget.format(NICE_FORMAT));
    }
}
