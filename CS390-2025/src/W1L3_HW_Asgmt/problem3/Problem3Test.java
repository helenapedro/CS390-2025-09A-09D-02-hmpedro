package W1L3_HW_Asgmt.problem3;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Problem3Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String answer;
        // Flight Booking
        String origin;
        String destination;
        int distanceKm;
        double avgSpeed;
        // Hotel Booking
        String hotelName;
        int nights;
        int pricePerNight;
        // Car Rental
        int carModel;
        int days;
        int ratePerDay;
        int milesPerDay;

        do {
            System.out.println("Enter F for Flight Booking");
            System.out.println("Enter H for Hotel Booking");
            System.out.print("Enter C for Car Rental: ");

            input = sc.next();

            switch (input.toLowerCase()) {
                case "f" -> {
                    System.out.print("Enter origin (e.g., Chicago): ");
                    origin = sc.next();
                    System.out.print("Enter destination (e.g., Bangalore): ");
                    destination = sc.next();
                    System.out.print("Enter distance in km (e.g., 6000): ");
                    distanceKm = sc.nextInt();
                    System.out.print("Enter average speed (km/h) (e.g., 450): ");
                    avgSpeed = sc.nextDouble();

                    FlightBooking fb1 = new FlightBooking(origin, destination, distanceKm);
                    System.out.printf("Estimated Flight Time: %.2f hours",fb1.computeFlightTime(avgSpeed));
                }
                case "h" -> {
                    System.out.print("Enter hotel name (e.g., Holiday Inn): ");
                    hotelName = sc.next();
                    System.out.print("Enter nights (e.g. 2): ");
                    nights = sc.nextInt();
                    System.out.print("Enter price per night (e.g., 250): ");
                    pricePerNight = sc.nextInt();

                    HotelBooking hb1 = new HotelBooking(hotelName, nights, pricePerNight);
                    System.out.printf("Total hotel cost: %.2f%n", hb1.totalCost());
                }
                case "c" -> {
                    System.out.print("Enter car model (e.g., 2023): ");
                    carModel = sc.nextInt();
                    System.out.print("Enter number of days (e.g., 2): ");
                    days = sc.nextInt();
                    System.out.print("Enter rate per day (e.g.,15): ");
                    ratePerDay = sc.nextInt();
                    System.out.print("Enter miles per day (e.g., 30): ");
                    milesPerDay = sc.nextInt();

                    CarRental cr1 = new CarRental(carModel, days, ratePerDay, milesPerDay);
                    System.out.printf("Total rental cost: %.2f%n", cr1.totalRentalCost());
                    System.out.printf("Total miles allowed: %.2f%n", cr1.totalMilesAllowed());
                }
                default -> System.out.println("Invalid input. Please enter F, H or C.");
            }
            System.out.print("\nDo you want to continue (y/n)?");
            answer = sc.next();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        sc.close();
    }
}
