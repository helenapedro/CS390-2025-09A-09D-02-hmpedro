package W1L3_HW_Asgmt.problem4;

public class Pizza {
    private PizzaSize size;
    private PizzaType type;
    private int quantity;
    private double price;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice() {
        double sizePrice = switch (size) {
            case SMALL ->  8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };

        double typeprice = switch (type) {
            case VEGGIE -> 1;
            case PEPPERONI, BBQ_CHICKEN -> 2;
            case CHEEZE -> 1.5;
        };

        price = (sizePrice + typeprice) * quantity;
        System.out.printf("Price: %.2f", price);
    }
    public void printOrderSumary() {
        double tax = price * 0.03; // 3%
        double totalPrice = price + tax;
        System.out.println("Pizza Order: \n");
        System.out.printf("Size: %s%n", size);
        System.out.printf("Type: %s%n", type);
        System.out.printf("Qty: %d%n", quantity);
        System.out.printf("Price: $%.2f%n", price);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }
}
