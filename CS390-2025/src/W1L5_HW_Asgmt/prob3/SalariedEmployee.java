package W1L5_HW_Asgmt.prob3;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double getPayment() {
        return weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        String fieldsNameFromSuper = super.toString();
        return fieldsNameFromSuper + ", " + getClass().getSimpleName() + ", " +
                "weeklySalary=" + weeklySalary + ", " +
                "Payment=" + getPayment() + "\n";
    }
}
