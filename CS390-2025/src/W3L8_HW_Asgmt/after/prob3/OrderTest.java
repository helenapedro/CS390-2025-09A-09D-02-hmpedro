package W3L8_HW_Asgmt.after.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)
        List<Order> orders = new ArrayList<>();
        Collections.addAll(
                orders,
                new Order("01", "Jane", 58.00),
                new Order("02", "Samantha", 34.00),
                new Order("03", "Edward", 55.00),
                new Order("04", "Phil", 18.00),
                new Order("05", "Kevin", 50.00)
        );
        System.out.println("The list of size " + orders.size() + " is: " + orders);

        List<Order> list2 = new ArrayList<>();
        list2.add(new Order("01", "Mariah", 60.00));

        orders.remove(1);
        System.out.println("The list of size " + orders.size() + " after removal is: " + orders);

        System.out.println("Size of the list: " + orders.size() + "\n");

        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Order at position " + i + " is: " + orders.get(i));
        }

        System.out.println("\nTotal amount before updating the order at position 2: " + orders.get(2).getTotalAmount());
        orders.set(2, new Order("06", "Phil", 40.00));
        System.out.println("Total amount after updating the order at position 2: " + orders.get(2).getTotalAmount() + "\n");

        System.out.println(orders.get(0).equals(list2.get(0))); // true - same orderId
        System.out.println(orders.get(0).equals(orders.get(3))); // false - diff orderId

        orders.sort(Comparator.comparing(Order::getTotalAmount));
        //Collections.sort(orders, Comparator.comparing(Order::getTotalAmount));
        System.out.println("\nOrders sorted by totalAmount (ascending) ");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + ", " + order.getCustomerName() + ", " + order.getTotalAmount());
        }

        List<Order> list3 = listMoreThan50(orders);
        list3.sort(Comparator.comparing(Order::getCustomerName));
        //Collections.sort(list3, Comparator.comparing(Order::getCustomerName));
        System.out.println("\nOrders with totalAmount > 50.0, sorted by customerName (A-Z)");
        for (Order order : list3) {
            System.out.println(order.getOrderId() + ", " + order.getCustomerName() + ", " + order.getTotalAmount());
        }
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> moreThan50 = new ArrayList<>();
        for (Order order : list) {
            if (order != null && order.getTotalAmount() > 50.0) {
                moreThan50.add(order);
            }
        }
        return moreThan50;
    }
}
