package W1L4_HW_Asgmt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        // assertTrue(condition) - Passes if the condition is true.
        assertTrue(Palindrome.isPalindrome(0));
        assertTrue(Palindrome.isPalindrome(121));

        // assertFalse(condition) - Passes if the condition is false.
        //assertFalse(Palindrome.isPalindrome(121)); // AssertionFailedError
        assertFalse(Palindrome.isPalindrome(-121));
        assertFalse(Palindrome.isPalindrome(-102));
    }

}