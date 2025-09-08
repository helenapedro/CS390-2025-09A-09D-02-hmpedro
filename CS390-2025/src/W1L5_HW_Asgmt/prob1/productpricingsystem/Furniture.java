package W1L5_HW_Asgmt.prob1.productpricingsystem;

public class Furniture extends Product {
    private String material;
    private double shippingCost;

    public Furniture(String material, double shippingCost) {
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return shippingCost + super.getPrice();
    }
    public String getMaterial() {
        return material;
    }
    public double getShipping() {
        return shippingCost;
    }
}
