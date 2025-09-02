package lesson3.day1;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
public class TestDates {
    public static void main(String[] args) {
        DateAPIsMutability ob = new DateAPIsMutability();
        // Date objects are Immutable
        Date dt1 = ob.getD1();
        System.out.println("Before Date Update dt1 = " + dt1);
        dt1.setTime(1234567l);
        System.out.println("After update dt1 through Instance - Original d1 = " +ob.d1);
        //  GregorianCalendar objects are Immutable
        GregorianCalendar dt2 = ob.getD2();
        System.out.println("Before GC Update dt2 = " + dt2.getTime());
        dt2.add(GregorianCalendar.DAY_OF_MONTH, 10);
        System.out.println("After GC update through Instance - Original d2 = " +ob.d2.getTime());

        // LocalDate is Immutable
        LocalDate dt3 = ob.getD3();
        System.out.println("Before LocalDate Update dt3 = " + dt3);
        dt3.plusDays(20);
        System.out.println("After LocalDate update through Instance - Original d3 = " +ob.d3);


    }
}
