package W1L2_HW_Asgmt;

public class Prog6 {
    public static void secondMin(int[] arraysOfInts) {
        int firstMin = Integer.MAX_VALUE; // firstMin: ∞
        int secondMin = Integer.MAX_VALUE; // secondMin: ∞

        for (int num : arraysOfInts) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            }
            else if (num > firstMin && num < secondMin) {
                secondMin = num;
            }
        }
        System.out.println("The second minimum is: " + secondMin);
    }

    public static void main(String[] args) {
        int[] arraysOfInts = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        Prog6.secondMin(arraysOfInts);
    }
}