package W1L4_HW_Asgmt;

import java.util.Arrays;

public class ReverseElements {
    /*
        Write a recursive solution for reversing the given n elements of an array.
        Do not use auxiliary array to store the results.
        Work only with the given array to reverse.
        Think about the method signature and the arguments.
        Inputs are not necessarily in sorted order.
    */
    public static int[] reverseNElements(int[] arr) {
        return reverseNElements(arr, 0, arr.length - 1);
    }

    private static int[] reverseNElements(int[] arr, int i, int j) {
        if (i >= j) return arr;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return reverseNElements(arr, i + 1, j - 1);
    }
}
