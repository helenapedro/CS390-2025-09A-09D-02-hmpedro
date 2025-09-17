package W1L5_HW_Asgmt.prob3.before;

public class HourlyEmployee extends Employee{
    double wage;
    double hours;
    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;

    }

    @Override
    public double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        String fieldsNameFromSuper = super.toString();
        return fieldsNameFromSuper + ", " + getClass().getSimpleName() +
                ", " + "wage=" + wage + ", " + "hours" +  hours + ", " +
                "Payment=" + getPayment() + "\n";
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
