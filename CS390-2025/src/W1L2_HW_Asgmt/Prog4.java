package W1L2_HW_Asgmt;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String[] input = {"horse", "dog", "cat", "horse", "dog"};
        String[] unique = new String[input.length];
        int collected = 0;

        for (String str : input) {
            boolean seen = false;

            for (int i = 0; i < collected; i++) {
                if (unique[i].equals(str)) {
                    seen = true;
                    break;
                }
            }

            if (!seen) {
                unique[collected++] = str;
            }
        }

        String[] res = new String[collected];
        System.arraycopy(unique, 0, res, 0, collected);
        System.out.println(Arrays.toString(res));
    }
}
