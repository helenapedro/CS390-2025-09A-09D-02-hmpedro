package lesson5.day2.newinterfaces;

import java.time.LocalDate;

public class TestStaticInterface {
    public static void main(String[] args) {
       String res =  Utility.convertDatetoString(LocalDate.now());
        System.out.println(res);
        Utility.decimalFormatting(345.6789012);

    }
}
