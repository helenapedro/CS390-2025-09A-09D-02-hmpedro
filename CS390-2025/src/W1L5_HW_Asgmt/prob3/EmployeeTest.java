package W1L5_HW_Asgmt.prob3;

import W1L3_HW_Asgmt.problem1.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee ob;
        Employee e1 = new CommissionEmployee("Jane", "Doe", "332-221-4444", 100.00, 5.0);
        Employee e2 = new BasePlusCommissionEmployee("Joe", "Smith", "987-654-3848", 100.00, 5.0, 50000.00);
        Employee e3 = new SalariedEmployee("Janeth", "Smith", "345-987-6996", 300.00);
        Employee e4 = new HourlyEmployee("Miguel", "Santino", "235-789-4444", 60000, 3.0);

        Employee[] employees = {e1, e2, e3, e4};

        Employee[] emps = findSalaryList(employees, 70000);
        System.out.println(Arrays.toString(emps));
    }

    public static Employee[] findSalaryList (Employee[] col, double salary) {
        if (col == null) return new Employee[0];

        List<Employee> emp = new ArrayList<>();

        for(Employee e : col) {
            if (e != null && e.getPayment() < salary) {
                emp.add(e);
            }
        }
        return emp.toArray(new Employee[0]);
    }
}
