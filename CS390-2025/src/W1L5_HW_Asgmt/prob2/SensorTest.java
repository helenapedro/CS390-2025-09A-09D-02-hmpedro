package W1L5_HW_Asgmt.prob2;

import W1L5_HW_Asgmt.prob2.smarthomesensors.interfaces.Sensor;
import W1L5_HW_Asgmt.prob2.smarthomesensors.models.LightSensor;
import W1L5_HW_Asgmt.prob2.smarthomesensors.models.SoundSensor;
import W1L5_HW_Asgmt.prob2.smarthomesensors.models.TemperatureSensor;

public class SensorTest {
    public static void main(String[] args) {
        SoundSensor s1 = new SoundSensor("Bedroom", 65.5);
        SoundSensor s2 = new SoundSensor("Living Room",70.5 );
        LightSensor l1 = new LightSensor("Garden", 80.0);
        TemperatureSensor t1 = new TemperatureSensor("Living Room", 23.5);
        TemperatureSensor t2 = new TemperatureSensor("Bedroom", 20.5);

        Sensor[] sensors = {s1, s2, l1, t1, t2};
        for (Sensor s : sensors) {
            System.out.println(s);
        }
    }
}
