package W1L3_HW_Asgmt.problem3;

public record HotelBooking(String hotelName, int nights, int pricePerNight) {
    public HotelBooking {
        if(hotelName == null || hotelName.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        } if (nights < 1) {
            throw new IllegalArgumentException("Time to stay must be >= 1");
        } if (pricePerNight < 0) {
            throw new IllegalArgumentException("Price per night must be >= 0");
        }
    }
    public double totalCost() {
        return nights * pricePerNight;
    }

    public static void show() {
        HotelBooking hb1 = new HotelBooking("Holiday Inn", 2, 250);
        System.out.printf("Total Hotel Cost: %.2f%n", hb1.totalCost()); // 500.00
    }
}
