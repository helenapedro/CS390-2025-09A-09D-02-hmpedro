package W1L5_HW_Asgmt.prob3.before;

import java.util.Arrays;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] empData = EmpSalaryManagementData.getEmployeeData();

        Arrays.sort(empData, new NameComparator());

        Employee[] salaryList = findSalaryList(empData, 5000);

        System.out.println(Arrays.toString(salaryList));
    }

    public static Employee[] findSalaryList(Employee[] col, double salary) {
        // Return an array of Employees whose getPayment() < salary
        if (col == null) {
            throw new IllegalArgumentException("Arrays is null.");
        }
        int count = 0;
        for (Employee e : col) {
            if (e != null && e.getPayment() < salary) {
                count++;
            }
        }
        Employee[] empArray = new Employee[count];
        int index = 0;
        for (Employee e : col) {
            if (e != null && e.getPayment() < salary) {
                empArray[index++] = e;
            }
        }
        return empArray;
    }
}
