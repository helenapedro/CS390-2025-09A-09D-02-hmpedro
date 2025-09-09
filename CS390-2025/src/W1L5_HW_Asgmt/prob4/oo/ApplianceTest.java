package W1L5_HW_Asgmt.prob4.oo;

import W1L5_HW_Asgmt.prob4.oo.interfaces.Appliance;
import W1L5_HW_Asgmt.prob4.oo.models.Microwave;
import W1L5_HW_Asgmt.prob4.oo.models.Refrigerator;
import W1L5_HW_Asgmt.prob4.oo.models.WashingMachine;

public class ApplianceTest {
    //Appliance ob = new Appliance(); // 'Appliance' is abstract; cannot be instantiated
    public static void main(String[] args) {
        Appliance[] appliances = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };

        for (Appliance appliance : appliances) {
            String appliancesName = appliance.getClass().getSimpleName();
            System.out.println(appliancesName + ":");
            appliance.performFunction();
        }
    }

}
