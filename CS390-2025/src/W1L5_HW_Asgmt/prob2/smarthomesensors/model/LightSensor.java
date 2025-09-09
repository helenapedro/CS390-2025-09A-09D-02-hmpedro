package W1L5_HW_Asgmt.prob2.smarthomesensors.model;

import W1L5_HW_Asgmt.prob2.smarthomesensors.interfaces.Sensor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    // Instance fields
    private String location;
    private double lightLevel;
    private LocalDateTime lastUpdated;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
        this.lastUpdated = LocalDateTime.now();
    }

    @Override
    public String getSensorType() {
        return getClass().getSimpleName();
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        if (lightLevel < 100) {
            return "an alert to turn on the light";
        } else {
            return " Light is sufficient";
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
