package W1L3_HW_Asgmt.problem1;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String socSecurityNum;
    private Address shippingAddress;
    private Address billingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    @Override
    public String toString() {
        return "[" +
                firstName + ", " +
                lastName + ", " +
                "ssn: " + socSecurityNum +
                ']';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
