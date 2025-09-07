package W1L4_HW_Asgmt;

public class ReturnMax {
        /*Write a recursive solution to return max value from the given array.*/
    public static void main(String[] args) {
        int[] arr = {5, -3, 6, 1, 9, 4};
        int maxValue = findMax(arr);
        System.out.printf("The maximum value in the array is: %d", maxValue);
    }
    public static int findMax(int[] arr) {
        return findMax(arr, arr[0], arr.length - 1);
    }
    private static int findMax(int[] arr, int max, int index) {
        if (index < 0) return max; // stopping point - there's no more indices to check

        if (arr[index] > max) {
            max = arr[index];
        }

        return findMax(arr, max, index - 1); // recursive call
    }
}
