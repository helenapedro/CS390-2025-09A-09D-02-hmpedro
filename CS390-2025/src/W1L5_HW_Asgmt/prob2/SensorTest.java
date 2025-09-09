package W1L5_HW_Asgmt.prob2;

import W1L5_HW_Asgmt.prob2.smarthomesensors.interfaces.Sensor;
import W1L5_HW_Asgmt.prob2.smarthomesensors.model.LightSensor;
import W1L5_HW_Asgmt.prob2.smarthomesensors.model.SoundSensor;
import W1L5_HW_Asgmt.prob2.smarthomesensors.model.TemparatureSensor;

public class SensorTest {
    public static void main(String[] args) {
        SoundSensor s1 = new SoundSensor("Bedroom", 65.5);
        SoundSensor s2 = new SoundSensor("Living Room",70.5 );
        LightSensor l1 = new LightSensor("Garden", 80.0);
        TemparatureSensor t1 = new TemparatureSensor("Living Room", 23.5);
        TemparatureSensor t2 = new TemparatureSensor("Bedroom", 20.5);

        Sensor[] sensors = {s1, s2, l1, t1, t2};
        for (Sensor s : sensors) {
            System.out.println(s);
        }
    }
}
