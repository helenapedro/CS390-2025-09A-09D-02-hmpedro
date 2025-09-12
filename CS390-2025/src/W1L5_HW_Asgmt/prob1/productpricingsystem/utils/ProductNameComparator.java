package W1L5_HW_Asgmt.prob1.productpricingsystem.utils;

import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Product;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product2.getProductName().compareTo(product1.getProductName());
    }
}
