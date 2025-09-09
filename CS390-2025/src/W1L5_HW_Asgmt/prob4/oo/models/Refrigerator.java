package W1L5_HW_Asgmt.prob4.oo.models;

import W1L5_HW_Asgmt.prob4.oo.interfaces.Appliance;

public class Refrigerator  implements Appliance {
    private int temperature;
    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }

    public int getTemperature() {
        return temperature;
    }
}
