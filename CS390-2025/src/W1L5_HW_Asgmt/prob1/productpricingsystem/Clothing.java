package W1L5_HW_Asgmt.prob1.productpricingsystem;

public class Clothing extends Product {
    private String brand;
    private double discount;

    public Clothing(String productName, double price) {
        super(productName, price);

    }

    @Override
    public double getPrice() {
        double discountAsDecimal = discount / 100;
        double valueToDiscount = discountAsDecimal * super.getPrice();
        return super.getPrice() - valueToDiscount;
    }

    @Override
    public String toString() {
        return String.format(
                "Clothing { name = '%s', price = %.2f, brand = '%s', discount = %.1f%%, final price = %.2f }",
                getProductName(), super.getPrice(), brand, discount, getPrice()
        );
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
