package W1L4_HW_Asgmt;

import java.util.Scanner;

public class FindMinChar {
    /* Using recursion to find the minimum character in the given string input.*/
    public static char findMinChar(String input) {
        int min = Integer.MAX_VALUE;

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Please provide a valid input");
        }
        return findMinChar(input, 0, min, '\u0000');
    }

    private static char findMinChar(String str, int i, int min, char minChar) {
        if (i >= str.length()) return minChar;

        if (str.charAt(i) < min) {
            min = str.charAt(i);
            minChar = (char) min;
        }
        return findMinChar(str, i + 1, min, minChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter a string: ");
            String str = sc.nextLine();
            try {
                char minCharacter = findMinChar(str);
                System.out.printf("The minimum character in \"%s\" is '%s'%n", str, minCharacter);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("Do you want to try another string? (yes/no):");
            choice = sc.nextLine();
        } while(choice.equalsIgnoreCase("yes"));
        System.out.println("Goodbye!");
        sc.close();
    }
}
