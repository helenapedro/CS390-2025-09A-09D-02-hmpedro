package W1L2_HW_Asgmt;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit the number of terms(N): ");
        int num = sc.nextInt();

        System.out.print("Which one you want to calculate? (a/b): ");
        String choice = sc.next();

        double sum = 0.0;

        if (choice.equals("a") || choice.equals("A")) {
            // Series (a): 1 - 1/3 + 1/5 - 1/7 + ...
            for (int i = 1; i <= num; i++) {
                double term = (Math.pow(-1, i + 1)) / (2.0 * i - 1);
                sum += term;
            }
            System.out.printf("Series (a), sum of %d terms = %.3f%n", num, sum);
        } else if (choice.equals("b") || choice.equals("B")) {
            // Series (b): 1/2 - 2/4 + 3/8 - 4/16 + ...
            for (int i = 1; i <= num; i++) {
                double term = Math.pow(-1, i + 1) * i / Math.pow(2, i);
                sum += term;
            }
            System.out.printf("Series (b), sum of %d terms = %.3f%n", num, sum);
        } else {
            System.out.println("Invalid choice. Please choose 'a' or 'b'.");
        }

        sc.close();
    }
}
