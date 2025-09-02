package lesson8;

import java.util.Comparator;
// Sort by Employee First name Comparator
public class EmployeeFirstnameCom implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}
