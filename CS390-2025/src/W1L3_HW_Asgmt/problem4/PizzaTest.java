package W1L3_HW_Asgmt.problem4;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(PizzaSize.SMALL, PizzaType.VEGGIE, 2);
        Pizza pizza2 = new Pizza(PizzaSize.MEDIUM, PizzaType.PEPPERONI, 2);
        Pizza pizza3 = new Pizza(PizzaSize.LARGE, PizzaType.BBQ_CHICKEN, 2);

        pizza1.printOrderSumary();
        pizza2.printOrderSumary();
        pizza3.printOrderSumary();
    }
}
