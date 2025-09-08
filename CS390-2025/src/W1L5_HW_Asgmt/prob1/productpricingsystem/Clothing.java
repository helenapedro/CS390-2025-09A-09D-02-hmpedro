package W1L5_HW_Asgmt.prob1.productpricingsystem;

public class Clothing extends Product {
    private String brand;
    private double discount;

    public Clothing(String productName, double price, String brand) {
        super(productName, price);
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        double discountAsDecimal = discount / 100;
        double valueToDiscount = discountAsDecimal * super.getPrice();
        return super.getPrice() - valueToDiscount;
    }

    public String getBrand() {
        return brand;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
