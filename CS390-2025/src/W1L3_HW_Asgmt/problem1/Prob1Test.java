package W1L3_HW_Asgmt.problem1;

public class Prob1Test {
    public static void main(String[] args) {
        // Instances of Customer
        Customer c1 = new Customer("Jane", "Doe", "332-221-4444");
        Customer c2 = new Customer("Joe", "Smith", "987-654-3848");
        Customer c3 = new Customer("Janeth", "Smith", "345-987-6996");
        System.out.println(c1);

        // Address
        Address a1 = new Address("1000 N Webber ST", "Fairfield", "IA", "52556");
        Address a2 = new Address("233 S Wacker Dr", "Chicago", "IL", "60606");
        Address a3 = new Address("111 S Michigan Ave", "Chicago", "IL", "60603");
        Address a4 = new Address("456 Oak Ave", "Skokie", "IL", "60077");
        Address a5 = new Address("789 Pine Rd", "Buffalo Grove", "IL", "60089");
        Address a6 = new Address("123 Main St", "Evanston", "IL", "60201");

        c1.setBillingAddress(a1);
        c1.setShippingAddress(a4);
        c2.setBillingAddress(a2);
        c2.setShippingAddress(a5);
        c3.setBillingAddress(a3);
        c3.setShippingAddress(a6);

        // Array of Customer
        Customer[] customers = new Customer[3];
        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;

        System.out.println("\nCustomers whose billingAddress is located in the city of Chicago:");
        for (Customer c : customers) {
            Address address = c.getBillingAddress();
            if (address.getCity().equalsIgnoreCase("Chicago")) {
                System.out.println(c);
            }
        }

    }
}
