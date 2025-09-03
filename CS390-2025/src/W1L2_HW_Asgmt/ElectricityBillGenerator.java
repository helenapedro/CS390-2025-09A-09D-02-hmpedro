package W1L2_HW_Asgmt;

import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        // 1. Ask the user for:
        String userType;
        int unitsConsumed;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user type (R/C/I): ");
        userType = sc.next();
        System.out.println("Your user type is: " + userType);

        System.out.print("Enter units consumed:");
        unitsConsumed = sc.nextInt();
        System.out.println("The units consumed is: " + unitsConsumed);
        sc.close();

        // 2. Use a single switch expression to compute the bill
        double bill = switch (userType) {
            case "R" -> 0.12 * unitsConsumed;
            case "C" -> 0.20 * unitsConsumed;
            case "I" -> 0.35 * unitsConsumed;
            default -> 0.00;
        };
        System.out.printf("Bill Amount: $%.2f \n", bill);
    }
}
