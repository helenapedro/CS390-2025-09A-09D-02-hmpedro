package W1L3_HW_Asgmt.problem3;

final public class CarRental {
    private String carModel;
    private int days;
    private double ratePerDay;
    private double milesPerDay;

    public CarRental(String carModel, int days, double ratePerDay, double milesPerDay) {
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost() {
        return days * ratePerDay;
    }

    public double totalMilesAllowed() {
        return days * milesPerDay;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getDays() {
        return days;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public double getMilesPerDay() {
        return milesPerDay;
    }

//    public static void main(String[] args) {
//        CarRental cr1 = new CarRental("Mazda", 6, 2.22, 122.22);
//        System.out.printf("Total rental cost: %.2f%n", cr1.totalRentalCost());
//        System.out.printf("Total miles allowed: %.2f%n", cr1.totalMilesAllowed());
//
//    }
}
