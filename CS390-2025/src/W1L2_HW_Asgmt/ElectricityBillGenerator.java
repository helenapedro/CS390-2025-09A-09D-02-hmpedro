package W1L2_HW_Asgmt;

import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userType;
        int unitsConsumed;
        String userAnswer;

        do {
            // 1. Ask the user for:
            System.out.print("Enter user type (R/C/I): ");
            userType = sc.next();

            System.out.print("Enter units consumed: ");
            unitsConsumed = sc.nextInt();

            // 2. Use a single switch expression to compute the bill
            double bill = switch (userType) {
                case "R" -> 0.12 * unitsConsumed;
                case "C" -> 0.20 * unitsConsumed;
                case "I" -> 0.35 * unitsConsumed;
                default -> 0.00;
            };

            // 3. Display the bill details neatly formatted.
            System.out.println("\n=== Electricity Bill ===");
            System.out.println("User Type: " + userType);
            System.out.println("Units: " + unitsConsumed);

            System.out.printf("Bill Amount: $%.2f \n", bill);

            // 4. After each bill, ask:
            System.out.print("\nDo you want to calculate another bill? (y/n): ");
            userAnswer = sc.next();
        } while (userAnswer.equals("y") || userAnswer.equals("Y"));

        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");
        sc.close();
    }
}
