package W1L5_HW_Asgmt.prob2.smarthomesensors.model;

import W1L5_HW_Asgmt.prob2.smarthomesensors.interfaces.Sensor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    // Instance fields
    private String location;
    double soundLevel;
    private LocalDateTime lastUpdated;

    // Parameter constructor
    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
        this.lastUpdated = LocalDateTime.now();
    }

    @Override
    public String getSensorType() {
        return getClass().getSimpleName().replace("Sensor", "");
    }
    @Override
    public double getReading() {
        return soundLevel;
    }
    @Override
    public String getLocation() {
        return location;
    }
    @Override
    public String getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return lastUpdated.format(formatter);
    }
    @Override
    public String performAction() {
        if (soundLevel > 70) {
            return "an alert to turn on noise cancellation";
        } else {
            return "Sound level is within normal range";
        }
    }

    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + getReading() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated() + "\n" +
                "Action: " + performAction() + "\n";
    }
}
