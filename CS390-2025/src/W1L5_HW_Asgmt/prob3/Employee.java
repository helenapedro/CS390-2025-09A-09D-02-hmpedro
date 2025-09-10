package W1L5_HW_Asgmt.prob3;

abstract public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Employee(){}
    abstract public double getPayment();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee: [ First name = " + firstName +
                ", Last Name = " + lastName +
                ", SSN = " + socialSecurityNumber;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob instanceof Employee emp) {
            return this.socialSecurityNumber.equals(emp.socialSecurityNumber);
        }
        return false;
    }
}
