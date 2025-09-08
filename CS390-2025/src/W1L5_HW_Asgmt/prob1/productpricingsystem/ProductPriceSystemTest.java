package W1L5_HW_Asgmt.prob1.productpricingsystem;

public class ProductPriceSystemTest {
    /* Follow LSP & Dynamic Binding:
        - to configure specific behavior/state of an object - create subclass directly
        - then store in collections of type super class (Product[])
        - process it calling the common methods (getPrice(), toString()) - without downcast
    */
    public static void main(String[] args) {
        Clothing c1 = new Clothing("Blouse", 15.22);
        Clothing c2 = new Clothing("Pants", 120.00);

        c1.setDiscount(5);
        c1.setBrand("Adidas");
        c2.setBrand("Nike");
        c2.setDiscount(10);

        Electronics e1 = new Electronics("TV", 100.00);
        e1.setWarrantyCost(3000.00);
        e1.setWarrantyMonths(24);

        Furniture f1 = new Furniture("wood", 22.15);
        Furniture f2 = new Furniture("Plastic Chair", 150.00);
        f1.setMaterial("Wood");
        f1.setShippingCost(12.50);
        f2.setMaterial("Plastic");
        f2.setShippingCost(20.00);

        Product[] products = {
                c1, e1, f1, c2, f2,
//                new Clothing("Pants", 33.33),
//                new Clothing("Dress", 25.03)
        };

        for (Product p : products) {
            System.out.println(p);
        }

        double sum = sumProducts(products);
        System.out.println("\nSum of products: " + sum);
    }

    public static double sumProducts(Product[] col) {
        if (col == null) return 0.0;
        double sum = 0.0;
        for (Product p : col) {
            if (p != null)
                sum += p.getPrice(); // Dynamic binding - getPrice() of subclasses is called at run time
        }
        return sum;
    }
}
