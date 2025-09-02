package lesson3.day1;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2024,05,29);
        LocalDate d2 = LocalDate.of(2000,02,20);
        Period diff = Period.between(d2,d1);
       // System.out.println(diff);
        System.out.println(diff.getYears());
        System.out.println(diff.getMonths());
        System.out.println(diff.getDays());
        System.out.println(d1);
    }
}
