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

        System.out.print("Enter units consumed: ");
        unitsConsumed = sc.nextInt();

        System.out.println("\n=== Electricity Bill ===");
        System.out.println("User Type: " + userType);
        System.out.println("Units: " + unitsConsumed);

        // 2. Use a single switch expression to compute the bill
        double bill = switch (userType) {
            case "R" -> 0.12 * unitsConsumed;
            case "C" -> 0.20 * unitsConsumed;
            case "I" -> 0.35 * unitsConsumed;
            default -> 0.00;
        };

        // 3. Display the bill details neatly formatted.
        System.out.printf("Bill Amount: $%.2f \n", bill);

        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
        sc.close();
    }
}
