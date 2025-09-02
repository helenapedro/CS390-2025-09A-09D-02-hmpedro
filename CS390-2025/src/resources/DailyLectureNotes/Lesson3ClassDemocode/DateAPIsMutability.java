package lesson3.day1;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAPIsMutability {
    Date d1;
    GregorianCalendar d2;
    LocalDate d3;

    public DateAPIsMutability(){
        d1 = new Date();
        d2 = new GregorianCalendar();
        d3 = LocalDate.now();
    }
    public GregorianCalendar getD2() {
        return d2;
    }
    public LocalDate getD3() {
        return d3;
    }
    public Date getD1() {
        return d1;
    }
}
