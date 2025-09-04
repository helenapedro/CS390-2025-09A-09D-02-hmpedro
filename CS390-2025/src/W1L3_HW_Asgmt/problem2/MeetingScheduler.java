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
    private static final Scanner SC = new Scanner(System.in);
    public String readEventName() {
        String name;
        do {
            name = prompt("Please type the event name: ");
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Try again.");
            }
        } while (name.isEmpty());
        return name;
    }

    public LocalDateTime readEventDateTime() {
        while (true) {
            String input = prompt("Enter event date & time (yyyy-M-d H:mm), e.g. 2025-10-22 14:21: ");
            try {
                return LocalDateTime.parse(input, INPUT);
            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public static ZoneId readTargetZone() {
        while (true) {
            String input = prompt("Enter target time zone (e.g., Africa/Luanda): ");
            try {
                return ZoneId.of(input);
            } catch (java.time.DateTimeException e) {
                System.out.println("Invalid time zone. Try again.");
            }
        }
    }

    public String formatEventDetails(ZonedDateTime target) {
        ZonedDateTime now = ZonedDateTime.now(target.getZone());
        long totalMinutes = ChronoUnit.MINUTES.between(now, target); // > 0 => future; < 0 => past; == 0 => exactly now
        long abs = Math.abs(totalMinutes); // for splitting into components
        long days = abs / (24 * 60); // whole days
        long hours = (abs / 60) % 24; // remaining hours after days
        long minutes = abs % 60;  // remaining minutes after hours

        return (totalMinutes >= 0) // Choose message based on the sign of the difference
                ? String.format("Time until event: %d days, %d hours, %d minutes", days, hours, minutes)
                : String.format("Event was %d days, %d hours, %d minutes ago", days, hours, minutes);
    }

    private static String prompt(String message) {
        System.out.print(message);
        return SC.nextLine().trim();
    }

    /**
     * getter to avoid making the NICE_FORMAT field public.
     * accessible inside W1L3_HW_Asgmt.problem2
     */
    static DateTimeFormatter getNiceFormat() {
        return NICE_FORMAT;
    }
}
