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

    public static void main(String[] args) {
        int[] r2 = reverseNElements(new int[]{}); // After Reverse: []
        int[] r1 = reverseNElements(new int[]{1, 3, 5, 7, 9, 13}); // After Reverse: [13, 9, 7, 5, 3, 1]
        int[] r3 = reverseNElements(new int[]{13}); // After Reverse: [13]
        int[] r4 = reverseNElements(new int[]{0}); // After Reverse: [0]

        System.out.println(Arrays.toString(r1));
        System.out.println(Arrays.toString(r2));
        System.out.println(Arrays.toString(r3));
        System.out.println(Arrays.toString(r4));
    }
}
