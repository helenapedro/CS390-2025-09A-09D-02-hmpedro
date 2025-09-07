package W1L4_HW_Asgmt;

public class FindMinChar {
    /* Using recursion to find the minimum character in the given string input.*/
    public static char findMinChar(String input) {
        int i = 0;
        int min = Integer.MAX_VALUE;
        char c = '\u0000';
        return findMinChar(input, i, min, c);
    }
    private static char findMinChar(String str, int i, int min, char c) {
        if (i >= str.length()) return c;

        if (str.charAt(i) < min) {
            min = str.charAt(i);
            c = (char) min;
        }
        return findMinChar(str, i + 1, min, c);
    }

    public static void main(String[] args) {
        char min1 = findMinChar("akel");
        char min2 = findMinChar("hlensdtsfydfhgjhjmk");

        System.out.println(min1);
        System.out.println(min2);
    }
}
