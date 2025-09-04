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
        double pricePerNight;
        // Car Rental
        String carModel;
        int days;
        double ratePerDay;
        double milesPerDay;

        do {
            System.out.println("Enter F for Flight Booking");
            System.out.println("Enter H for Hotel Booking");
            System.out.println("Enter C for Car Rental");

            input = sc.next();

            switch (input.toLowerCase()) {
                case "f" -> {
                    System.out.print("Enter origin: ");
                    origin = sc.next();
                    System.out.print("Enter destination: ");
                    destination = sc.next();
                    System.out.print("Enter distance in km: ");
                    distanceKm = sc.nextInt();
                    System.out.print("Enter average speed (km/h): ");
                    avgSpeed = sc.nextDouble();

                    FlightBooking fb1 = new FlightBooking(origin, destination, distanceKm);
                    System.out.printf("Estimated Flight Time: %.2f%n",fb1.computeFlightTime(avgSpeed));
                }
                case "h" -> {
                    System.out.print("Enter hotel name: ");
                    hotelName = sc.next();
                    System.out.print("Enter nights (e.g. 3): ");
                    nights = sc.nextInt();
                    System.out.print("Enter price per night: ");
                    pricePerNight = sc.nextDouble();

                    HotelBooking hb1 = new HotelBooking(hotelName, nights, pricePerNight);
                    System.out.printf("Total cost per night: %.2f%n", hb1.totalCost());
                }
                case "c" -> {
                    System.out.print("Enter car model: ");
                    carModel = sc.next();
                    System.out.print("Enter days: ");
                    days = sc.nextInt();
                    System.out.print("Enter rate per day: ");
                    ratePerDay = sc.nextDouble();
                    System.out.print("Enter miles per day: ");
                    milesPerDay = sc.nextDouble();

                    CarRental cr1 = new CarRental(carModel, days, ratePerDay, milesPerDay);
                    System.out.printf("Total rental cost: %.2f%n", cr1.totalRentalCost());
                    System.out.printf("Total miles allowed: %.2f%n", cr1.totalMilesAllowed());
                }
                default -> System.out.println("Illegal input");
            }
            System.out.println("Do you want to continue(y/n)?");
            answer = sc.next();
        } while (answer.equalsIgnoreCase("y"));
    }
}
