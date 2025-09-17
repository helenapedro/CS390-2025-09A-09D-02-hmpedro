package W1L5_HW_Asgmt.prob3.before;

public class CommissionEmployee extends Employee{
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) {
        super(firstName, lastName, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double percent) {
        this.commissionRate = percent / 100.00;
    }

    @Override
    public String toString() {
        String fieldsNameFromSuper = super.toString();
        return fieldsNameFromSuper + ", " + "Type: " + getClass().getSimpleName() +
                ", Gross Sales=" + String.format("%.2f", grossSales) + ", " +
                "Commission Rate=" + String.format("%.2f", commissionRate) + ", " +
                "Payment=" + String.format("%.2f", getPayment());
    }
}
