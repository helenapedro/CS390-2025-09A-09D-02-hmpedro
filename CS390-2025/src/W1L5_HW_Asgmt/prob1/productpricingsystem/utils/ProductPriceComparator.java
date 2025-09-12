package W1L5_HW_Asgmt.prob1.productpricingsystem.utils;

import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Product;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
