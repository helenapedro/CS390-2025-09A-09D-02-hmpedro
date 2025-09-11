package W1L5_HW_Asgmt.prob1;

import W1L5_HW_Asgmt.prob1.productpricingsystem.Clothing;
import W1L5_HW_Asgmt.prob1.productpricingsystem.Electronics;
import W1L5_HW_Asgmt.prob1.productpricingsystem.Furniture;
import W1L5_HW_Asgmt.prob1.productpricingsystem.Product;

public class ProductPriceSystemTest {
    /* Follow LSP & Dynamic Binding:
        - to configure specific behavior/state of an object - create subclass directly
        - then store in collections of type super class (Product[])
        - process it calling the common methods (getPrice(), toString()) - without downcast
    */
    public static void main(String[] args) {
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

        Product[] products = {c1, e1, f1, c2, f2};

        for (Product p : products) {
            if (p instanceof Clothing c) {
                c.setDiscount(10);
            }
        }

        for (Product p : products) {
            if (p instanceof Furniture f) {
                f.setShippingCost(12.00);
            }
        }

        //Sorting with Lambda Expressions - sorting products by Name (A - Z)
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareTo(p2.getProductName()));

        for (Product p : products) {System.out.println(p);}

        double sum = sumProducts(products);
        System.out.println("\nSum of products: " + sum);
    }

    public static double sumProducts(Product[] col) {
        if (col == null) return 0.0;
        double sum = 0.0;
        for (Product product : col) {
            if (product != null)
                sum += product.getPrice(); // Dynamic binding - getPrice() of subclasses is called at run time
        }
        return sum;
    }
}
