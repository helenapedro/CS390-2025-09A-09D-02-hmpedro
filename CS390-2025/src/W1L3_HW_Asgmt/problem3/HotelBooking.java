package W1L3_HW_Asgmt.problem3;

public record HotelBooking(String hotelName, int nights, double pricePerNight) {
    public HotelBooking {
        if(hotelName == null || hotelName.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        } if (nights < 1) {
            throw new IllegalArgumentException("Time to stay must be >= 1");
        }
    }
    public double totalCost() {
        return nights * pricePerNight;
    }

//    public static void main(String[] args) {
//        HotelBooking hb1 = new HotelBooking("Marina Bay", 3, 100.00);
//        System.out.printf("Total cost per night: %.2f%n", hb1.totalCost());
//    }
}
