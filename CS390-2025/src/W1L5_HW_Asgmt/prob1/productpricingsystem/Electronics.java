package W1L5_HW_Asgmt.prob1.productpricingsystem;

public class Electronics extends Product {
    private int warrantyMonths;
    private double warrantyCost;

    public Electronics(String productName, double price) {
        super(productName, price);
    }

    @Override
    public double getPrice() {
        return warrantyCost + super.getPrice();
    }

    @Override
    public String toString() {
        return String.format(
                "Electronic { name = '%s', price = %.2f, warranty months = %d,warranty cost = %.2f, final price = %.2f }",
                getProductName(), super.getPrice(), warrantyMonths, warrantyCost, getPrice()
        );
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    public void setWarrantyCost(double warrantyCost) {
        this.warrantyCost = warrantyCost;
    }
}
