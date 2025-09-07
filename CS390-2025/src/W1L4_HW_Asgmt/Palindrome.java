package W1L4_HW_Asgmt;

public class Palindrome {
    /*
        Write a recursive solution to check whether the given number is Palindrome or not.
        You can have public utility method and private a recursive method.
        Return a boolean value.
        Do not convert your input to String. Solve it as only using int type to check a Palindrome number.
    */
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        return isPalindrome(n, n, 0);
    }

    public static boolean isPalindrome(int num, int temp, int reversed) {
        if (temp == 0) {
            return reversed == num;
        }

        int digit = temp % 10;
        reversed = reversed * 10 + digit;

        return isPalindrome(num, temp / 10, reversed);
    }
}
