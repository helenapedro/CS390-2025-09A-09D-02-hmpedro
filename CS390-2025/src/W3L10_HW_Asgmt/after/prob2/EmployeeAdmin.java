package W3L10_HW_Asgmt.after.prob2;

import java.util.*;

public class EmployeeAdmin {
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> result = new ArrayList<>();
        table.forEach((key, value) -> {
            for (String s : socSecNums) {
                if (s != null && s.equals(key) && value.getSalary() > 80000)
                    result.add(value);
            }
        });
        result.sort(Comparator.comparing(Employee::getSsn));
        return result;
    }
}
