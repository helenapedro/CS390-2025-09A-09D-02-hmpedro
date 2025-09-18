package W3L8_HW_Asgmt.after.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) Create ArrayList<Order>
        List<Order> orders = new ArrayList<>();

        // b) add() 5 Orders (save references to remove by Instance on the step c)
        Order o1 = new Order("Jane", 58.00);
        Order o2 = new Order("Samantha", 34.00);
        Order o3 = new Order("Edward", 55.00);
        Order o4 = new Order("Phil", 18.00);
        Order o5 = new Order("Kevin", 50.00);
        Collections.addAll(orders, o1, o2, o3, o4, o5);

        // c) Delete by instance (remove the same added ref)
        orders.remove(o2);

        // d) Print size
        System.out.println("Size: " + orders.size());

        // e) get(index) e print
        System.out.println("At index 1: " + orders.get(1));

        // f) set(index, new Order(...))
        System.out.println("Before set: " + orders.get(2));
        orders.set(2, new Order("Phil", 40.00));
        System.out.println("After set: " + orders.get(2));

        // g) equals() subscribed in Order.java (consistent with hashCode)

        // h) Sort by totalAmount (asc) with Comparator CONSISTENT with equals
        //    => in case of equal totalAmount, sort by customerName e orderId
        orders.sort(
                Comparator.comparingDouble(Order::getTotalAmount)
                        .thenComparing(Order::getCustomerName)
                        .thenComparing(Order::getOrderId)
        );
        System.out.println("\nSorted by totalAmount (asc):");
        for (Order o : orders) System.out.println(o);

        // i) Filtrate > 50.0, order by customerName (A→Z)
        List<Order> list3 = listMoreThan50(orders);
        list3.sort(Comparator.comparing(Order::getCustomerName)
                .thenComparing(Order::getOrderId));
        System.out.println("\n> 50.0 by customerName (A→Z):");
        for (Order o : list3) System.out.println(o);
    }

    // i)
    public static List<Order> listMoreThan50(List<Order> list) {
        List<Order> res = new ArrayList<>();
        if (list == null) return res;
        for (Order o : list) {
            if (o != null && o.getTotalAmount() > 50.0) res.add(o);
        }
        return res;
    }
}