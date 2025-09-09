package W1L5_HW_Asgmt.prob4.oo.models;

import W1L5_HW_Asgmt.prob4.oo.interfaces.Appliance;

public class WashingMachine implements Appliance {
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void performFunction() {
        System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
    }
    public int getLoadCapacity() {
        return loadCapacity;
    }
}
