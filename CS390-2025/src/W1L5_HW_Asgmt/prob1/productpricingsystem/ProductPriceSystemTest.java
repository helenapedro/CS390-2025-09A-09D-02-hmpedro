package W1L5_HW_Asgmt.prob1.productpricingsystem;

public class ProductPriceSystemTest {
    public static void main(String[] args) {
        Product p1 = new Clothing("Blouse", 15.22);
        Product p2 = new Electronics("TV", 100.00);
        Product p3 = new Furniture("wood", 22.15);

        Clothing c1 = new Clothing("Blouse", 15.22);

        // p1.setDiscount(15); // compile error, need to do downcasting
        
        c1.setDiscount(20);

    }
}
