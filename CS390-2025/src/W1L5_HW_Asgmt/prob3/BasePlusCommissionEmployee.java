package W1L5_HW_Asgmt.prob3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;

    }

    @Override
    public double getPayment() {
        return baseSalary + (grossSales * commissionRate);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        // BasePlusCommissionEmployee extends from CommissionEmployee, so these fields
        // name comes from CommissionEmployee, not Employee.
        String fieldsNameFromSuper = super.toString();
        return fieldsNameFromSuper + ", Base Salary= " + baseSalary + "\n";
    }

}
