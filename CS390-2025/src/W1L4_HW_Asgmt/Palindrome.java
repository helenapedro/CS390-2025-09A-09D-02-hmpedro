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
        if (temp <= 0) return false;

        int digit = temp % 10;
        reversed = reversed * 10 + digit;

        if (reversed == num) {
            return true;
        }

        return isPalindrome(num, temp / 10, reversed);
    }

    public static void main(String[] args) {
        boolean c1 = isPalindrome(121); // true
        boolean c2 = isPalindrome(102); // false
        boolean c3 = isPalindrome(-121); // false
        boolean c4 = isPalindrome(-102); // false
        //boolean c5 = isPalindrome(0); // true

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        //System.out.println(c5);
    }
}
