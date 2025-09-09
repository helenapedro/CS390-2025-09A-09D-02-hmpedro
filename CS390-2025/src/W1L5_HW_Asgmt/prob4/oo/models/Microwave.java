package W1L5_HW_Asgmt.prob4.oo.models;

import W1L5_HW_Asgmt.prob4.oo.interfaces.Appliance;

public class Microwave  implements Appliance {
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ".");
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }
}
