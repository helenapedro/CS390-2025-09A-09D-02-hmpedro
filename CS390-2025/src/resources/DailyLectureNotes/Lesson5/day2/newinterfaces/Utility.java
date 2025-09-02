package lesson5.day2.newinterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Utility {
     String DATE_PATTERN = "MM/dd/yyyy";
    static String convertDatetoString(LocalDate ld){
    return ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    static  void decimalFormatting(double d){
        System.out.printf("d = %.2f",d);
    }
}
