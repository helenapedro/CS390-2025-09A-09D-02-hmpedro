package W1L5_HW_Asgmt.prob1;

import W1L5_HW_Asgmt.prob1.productpricingsystem.ProductPricingSystemData;
import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Clothing;
import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Furniture;
import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Product;
import W1L5_HW_Asgmt.prob1.productpricingsystem.utils.ProductNameComparator;
import W1L5_HW_Asgmt.prob1.productpricingsystem.utils.ProductPriceComparator;
import java.util.Arrays;
import java.util.Comparator;

public class ProductPriceSystemTest {
    /* Follow LSP & Dynamic Binding:
        - to configure specific behavior/state of an object - create subclass directly
        - then store in collections of type super class (Product[])
        - process it calling the common methods (getPrice(), toString()) - without downcast
    */
    public static void main(String[] args) {
        Product[] products = ProductPricingSystemData.getProductData();

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

        //Arrays.sort(products, new ProductNameComparator());
        Arrays.sort(products, new ProductPriceComparator());
        System.out.println(Arrays.toString(products));

        //for (Product p : products) {System.out.println(p);} //  print the status of the objects(overriding toString()).

        double sum = sumProducts(products);
        System.out.println("\nSum of products: " + sum);

        Product expensive = mostExpensiveProductPrice(products);
        System.out.println("Most expensive product: ");
        System.out.println(expensive);
    }

    public static double sumProducts(Product[] prod) {
        if (prod == null) return 0.0;
        double sum = 0.0;
        for (Product product : prod) {
            if (product != null)
                sum += product.getPrice(); // Dynamic binding - getPrice() of subclasses is called at run time
        }
        return sum;
    }

    public static Product mostExpensiveProductPrice(Product[] prod) {
        if (prod == null) throw new IllegalArgumentException("Product array is null");

        Product mostExpensiveProduct = prod[0];

        for (Product pd : prod) {
            if (pd != null && pd.getPrice() > mostExpensiveProduct.getPrice()) {
                mostExpensiveProduct = pd;
            }
        }
        return mostExpensiveProduct;
    }
}
