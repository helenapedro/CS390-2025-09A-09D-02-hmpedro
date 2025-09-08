package W1L5_HW_Asgmt.prob1.productpricingsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Electronics extends Product {
    private LocalDate warranty;
    private double cost;

    public Electronics(String productName, double price, int year, int month, int day) {
        super(productName, price);
        warranty = LocalDate.of(year, month, day);
    }

    @Override
    public double getPrice() {
        return cost + super.getPrice();
    }

    private String getWarranty () {
        final String DATE_PATTERN = "MM/dd/yyyy";
        return warranty.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    public double getCost() {
        return cost;
    }
}
