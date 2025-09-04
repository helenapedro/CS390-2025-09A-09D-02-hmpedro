package W1L3_HW_Asgmt.problem3;

public record FlightBooking(String origin, String destination, int distanceKm) {
    public FlightBooking {
        if(origin == null || origin.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        } if (destination == null || destination.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        } if (distanceKm < 1) {
            throw new IllegalArgumentException("distance must be >= 1.0");
        }
    }
    public double computeFlightTime(double avgSpeed) {
        return  distanceKm / avgSpeed;
    }

//    public static void main(String[] args) {
//        FlightBooking fb1 = new FlightBooking("Chicago", "Bangalore", 6000);
//        int avgSpeed = 450;
//        System.out.printf("Estimated Flight Time: %.2f%n",fb1.computeFlightTime(avgSpeed));
//    }
}
