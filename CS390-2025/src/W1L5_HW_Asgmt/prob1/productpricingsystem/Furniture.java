package W1L5_HW_Asgmt.prob1.productpricingsystem;

public class Furniture extends Product {
    private String material;
    private double shippingCost;

    public Furniture(String productName, double price) {
        super(productName, price);
    }

    @Override
    public double getPrice() {
        return shippingCost + super.getPrice();
    }

    @Override
    public String toString() {
        return String.format(
                "Furniture { name: %s, price = %.2f, material: %s, shipping cost = %.2f, final price = %.2f }",
                getProductName(), super.getPrice(), material, shippingCost, getPrice()
        );
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
