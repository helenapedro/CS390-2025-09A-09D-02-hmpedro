package W1L3_HW_Asgmt.problem2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MeetingSchedulerTest {
    public static void main(String[] args) {
        MeetingScheduler scheduler = new MeetingScheduler();

        String eventName = scheduler.readEventName();
        LocalDateTime eventLdt = scheduler.readEventDateTime();

        ZoneId target = MeetingScheduler.readTargetZone();
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime eventZdt = eventLdt.atZone(zone);
        ZonedDateTime eventInTarget = eventZdt.withZoneSameInstant(target);

        System.out.printf("Event name: %s%n", eventName);
        System.out.printf("Your event is scheduled for: %s%n", eventZdt.format(MeetingScheduler.getNiceFormat()));
        System.out.printf("%s%n", scheduler.formatEventDetails(eventZdt));

        // weekday + leap year
        var eventDate = eventLdt.toLocalDate();
        System.out.printf("Day of week: %s%n", eventDate.getDayOfWeek());
        System.out.printf("Is Leap year? %b%n", eventDate.isLeapYear());
        System.out.printf("In target zone: %s%n", eventInTarget.format(MeetingScheduler.getNiceFormat()));
    }
}
