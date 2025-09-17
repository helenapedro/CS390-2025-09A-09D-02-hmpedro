package W3_L8_HW_Asgmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ml = new ArrayList<>(
                Arrays.asList("A", "B", "C")
        );

        System.out.println(ml);
        ml.clear();
        System.out.println(ml);
    }
}
