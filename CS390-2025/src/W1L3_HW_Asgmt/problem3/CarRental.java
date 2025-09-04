package W1L3_HW_Asgmt.problem3;

final public class CarRental {
    private int carModel;
    private int days;
    private int ratePerDay;
    private int milesPerDay;

    public CarRental(int carModel, int days, int ratePerDay, int milesPerDay) {
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

    public int getCarModel() {
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

//   public static void main(String[] args) {
//        CarRental cr1 = new CarRental(2023, 2, 15, 30);
//        System.out.printf("Total rental cost: %.2f%n", cr1.totalRentalCost()); // 30.00
//        System.out.printf("Total miles allowed: %.2f%n", cr1.totalMilesAllowed()); // 60.00
//
//    }
}
