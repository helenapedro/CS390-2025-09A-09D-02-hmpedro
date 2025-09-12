package W1L5_HW_Asgmt.prob1.productpricingsystem;

import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Clothing;
import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Electronics;
import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Furniture;
import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Product;

public class ProductPricingSystemData {
    public static Product[] getProductData() {
        Clothing c1 = new Clothing("Blouse", 15.22);
        Clothing c2 = new Clothing("Pants", 120.00);
        c1.setBrand("Adidas");
        c2.setBrand("Nike");

        Electronics e1 = new Electronics("TV", 100.00);
        e1.setWarrantyCost(3000.00);
        e1.setWarrantyMonths(24);

        Furniture f1 = new Furniture("wood", 22.15);
        Furniture f2 = new Furniture("Plastic Chair", 150.00);
        f1.setMaterial("Wood");
        f2.setMaterial("Plastic");

        return new Product[]{c1, c2, e1, f1, f2};
    }
}
