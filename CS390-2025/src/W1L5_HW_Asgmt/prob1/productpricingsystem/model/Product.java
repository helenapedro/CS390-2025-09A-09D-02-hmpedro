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

    @Override
    public boolean equals(Object ob) {
        if (ob instanceof Product p) {
            return this.productName.equals(p.getProductName()) && this.price == p.price;
        }
        return false;
    }

//    @Override
//    public boolean equals(Object ob) {
//        if (ob == null || this.getClass() != ob.getClass()) return false;
//        Product p = (Product) ob;
//        return this.productName.equals(p.productName)
//                && this.price == p.price;
//    }
}
