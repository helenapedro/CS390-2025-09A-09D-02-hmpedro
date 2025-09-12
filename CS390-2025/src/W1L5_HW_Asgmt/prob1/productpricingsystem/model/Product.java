package W1L5_HW_Asgmt.prob1.productpricingsystem.model;

public class Product {
    // Instance variables
    private String productName;
    private double price;

    public Product(){}

    // Parameter constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Instance methods
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "Product name: '%s', Price: $%.2f",
                productName, price
        );
    }
}
