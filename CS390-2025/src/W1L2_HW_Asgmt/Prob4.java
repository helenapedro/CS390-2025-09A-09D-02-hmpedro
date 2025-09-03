package W1L2_HW_Asgmt;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;

        do {
            System.out.print("Digit the number of terms (N): ");
            int num = sc.nextInt();

            System.out.print("Which one you want to calculate? (a/b): ");
            String choice = sc.next();

            double sum = switch (choice.toLowerCase()) {
                case "a" -> {
                    double x = 0.0;
                    // Série (a): 1 - 1/3 + 1/5 - 1/7 + ...
                    for (int i = 1; i <= num; i++) {
                        double term = Math.pow(-1, i + 1) / (2.0 * i - 1);
                        x += term;
                    }
                    yield x;
                }
                case "b" -> {
                    double y = 0.0;
                    // Série (b): 1/2 - 2/4 + 3/8 - 4/16 + ...

                    for (int i = 1; i <= num; i++) {
                        double term = Math.pow(-1, i + 1) * i / Math.pow(2, i);
                        y += term;
                    }
                    yield y;
                }
                default -> 0.0;
            };

            System.out.printf("Sum = %.3f%n", sum);

            System.out.print("Do you want to calculate another series? (y/n): ");
            repeat = sc.next();

        } while (repeat.equalsIgnoreCase("y"));

        sc.close();
        System.out.println("Goodbye and thank you!");
    }
}
