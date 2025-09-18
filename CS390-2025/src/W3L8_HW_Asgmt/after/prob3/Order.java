package W3L8_HW_Asgmt.after.prob3;

import java.time.LocalDate;
import java.util.Objects;

public class Order{
    private String orderId;
    private String customerName;
    private double totalAmount;
    private static int counter = 1;

    public Order(String customerName, double totalAmount) {
        //this.orderId = orderId;
        this.orderId = "ORD-" + LocalDate.now() + "_" + counter++;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        // implement: same orderId => equal
        if (this == o) return true;

        if (o instanceof Order order) {
            return Double.compare(order.totalAmount, totalAmount) == this.totalAmount
                    && Objects.equals(orderId, order.orderId)
                    && Objects.equals(customerName, order.customerName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        // consistent with equals
        return Objects.hash(orderId, customerName, totalAmount);
    }

    @Override
    public String toString() {
        return "Order {" + orderId + ", " + customerName + ", " + totalAmount + "}";
    }

    // getters/setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
