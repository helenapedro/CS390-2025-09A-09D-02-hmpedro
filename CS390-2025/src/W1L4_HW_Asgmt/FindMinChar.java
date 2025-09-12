package W1L4_HW_Asgmt;

import java.util.Scanner;

public class FindMinChar {
    /* Using recursion to find the minimum character in the given string input.*/
    public static char findMinChar(String str) {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException("String cannot be empty.");

        if (str.length() == 1) {
            return str.charAt(0);
        }

        char min = str.charAt(0);
        char rest = findMinChar(str.substring(1));

        return (min < rest) ? min : rest;
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
