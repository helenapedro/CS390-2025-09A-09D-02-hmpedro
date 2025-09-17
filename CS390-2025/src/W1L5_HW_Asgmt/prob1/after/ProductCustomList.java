package W1L5_HW_Asgmt.prob1.after;

import W1L5_HW_Asgmt.prob1.productpricingsystem.model.Product;

import java.util.Arrays;

public class ProductCustomList {
    private Product[] prodArray;
    private int size;
    private final int CAPACITY = 5;

    public ProductCustomList() {
        prodArray = new Product[CAPACITY];
        size = 0;
    }

    public ProductCustomList(int capacity) {
        prodArray = new Product[capacity];
        size = 0;
    }


    public void add(Product p) {

    }

    public void resize() {
        int newLen = prodArray.length * 2;
        prodArray = Arrays.copyOf(prodArray, newLen);
    }

//    public Product get(Product p) {
//
//    }

    public boolean find(Product p) { // search with size(how many items in the list)
        if (p == null) throw new NullPointerException("Product is null");

        for (int i = 0; i < size; i++) {
            if(p.equals(prodArray[i])) {
                return true;
            }
        }
        return false;
    }

    public void insert(Product p, int pos) {
        if (pos < 0 || pos > size) throw new IndexOutOfBoundsException("Position: " + pos);

        if (p == null) throw new NullPointerException("Product is null.");

        if (size == prodArray.length) resize();

        for (int i = size; i > pos; i-- ) {
            prodArray[i] = prodArray[i - 1];
        }
        prodArray[pos] = p;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
