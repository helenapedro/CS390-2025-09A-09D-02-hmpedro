package W1L5_HW_Asgmt.prob2.smarthomesensors.models;

import W1L5_HW_Asgmt.prob2.smarthomesensors.interfaces.Sensor;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private String location;
    double temperature;
    LocalDateTime lastUpdated;

    public TemperatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
        lastUpdated = LocalDateTime.now();
    }

    @Override
    public String getSensorType() {

        return getClass().getSimpleName().replace("Sensor", "");
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm, a");
        return lastUpdated.format(formatter);
    }

    @Override
    public String performAction() {
        if (temperature > 30) {
            return "an alert to turn on the AC";
        } else if (temperature < 18) {
            return "an alert to turn the Heater";
        } else {
            return "Temperature is in normal range";
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
