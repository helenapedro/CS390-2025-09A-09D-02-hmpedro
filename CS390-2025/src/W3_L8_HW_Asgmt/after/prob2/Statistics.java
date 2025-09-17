package W3_L8_HW_Asgmt.after.prob2;

import W3L8_HW_Asgmt.after.prob2.EmployeeData;

import java.util.List;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        //implement
        //compute sum of all salaries of people in aList and return
        if (aList == null) return 0.0;

        double sumOfSalaries = 0.0;
        for (EmployeeData employeeData : aList) {
            if (employeeData != null) {
                sumOfSalaries += employeeData.getSalary();
            }
        }
        return sumOfSalaries;
    }
}
