package W1L5_HW_Asgmt.prob2.smarthomesensors.interfaces;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();
    String getLastUpdated();
    String performAction();
}
