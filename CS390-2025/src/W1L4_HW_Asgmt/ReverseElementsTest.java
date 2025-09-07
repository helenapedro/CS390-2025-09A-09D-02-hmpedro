package W1L4_HW_Asgmt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseElementsTest {
    /*assertEquals in arrays compares references, not the content - use assertArrayEquals instead*/
    @Test
    public void reverseEmptyArrayTest() {
        int[] arr = {};
        int[] exp = {};
        int[] res = ReverseElements.reverseNElements(arr);

        assertArrayEquals(exp, res); // compares the content
        assertSame(arr, res); // confirms the same array was returned
    }
    @Test
    public void reverseSingletonArrayTest() {
        int[] arr = {13};
        int[] exp = {13};

        int[] res = ReverseElements.reverseNElements(arr);

        assertArrayEquals(exp, res); // compares the content
        assertSame(arr, res); // confirms the same array was returned
    }

    @Test
    public void reverseEvenLengthArrayTest() {
        int[] arr = {1, 3, 5, 7, 9, 13}; // original output from the code
        int[] exp = {13, 9, 7, 5, 3, 1}; // expected output
        int[] res = ReverseElements.reverseNElements(arr);

        assertArrayEquals(exp, res); // compares the content
        assertArrayEquals(exp, arr); // confirms that the reverse was in place
        assertSame(arr, res); // confirms the same array was returned

    }

    @Test
    public void reverseOddLengthArrayTest() {
        int[] arr = {1, 3, 5, 7, 9}; // original output from the code
        int[] exp = {9, 7, 5, 3, 1}; // expected output
        int[] res = ReverseElements.reverseNElements(arr);

        assertArrayEquals(exp, res); // compares the content
        assertArrayEquals(exp, arr); // confirms that the reverse was in place
        assertSame(arr, res); // confirms the same array was returned

    }
}