package W1L5_HW_Asgmt.prob3.before;

import java.util.Arrays;

public class EmpSalaryManagementData {
    public static void main(String[] args) {
        Employee[] emp = EmpSalaryManagementData.getEmployeeData();

        Arrays.sort(emp, (emp1, emp2) -> {
            int cmp = emp1.getClass().getSimpleName()
                    .compareTo(emp2.getClass().getSimpleName());
            if (cmp == 0) {
                return Double.compare(emp2.getPayment(), emp1.getPayment());
            }
            return cmp;
        });

        System.out.println(Arrays.toString(emp));
    }

    public static Employee[] getEmployeeData() {
        Employee e1 = new CommissionEmployee("Jane", "Doe", "332-221-4444", 100.00, 5.0);
        Employee e2 = new BasePlusCommissionEmployee("Joe", "Smith", "987-654-3848", 100.00, 5.0, 50000.00);
        Employee e3 = new SalariedEmployee("Janeth", "Smith", "345-987-6996", 300.00);
        Employee e4 = new HourlyEmployee("Miguel", "Santino", "235-789-4444", 6000, 3.0);

        return new Employee[]{e1, e2, e3, e4};
    }
}
