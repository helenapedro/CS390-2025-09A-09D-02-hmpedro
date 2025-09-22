package W3L12_HW_Asgmt.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity;

        while (true) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                quantity = sc.nextInt();

                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Quantity must be between 1 and 50");
                }
                System.out.println("Successfully added " + quantity + " items to your cart!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number between 1 and 50.");
                sc.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println("Out of range: " + e.getMessage());
            }
        }
        sc.close();
    }
}
