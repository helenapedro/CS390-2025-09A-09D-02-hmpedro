package lesson8;

import java.util.Comparator;

// Make it Consist with equals Comparator
public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getFname().compareTo(o2.getFname())!=0)
            return o1.getFname().compareTo(o2.getFname());
            if(o1.getLname().compareTo(o2.getLname())!=0)
                return o1.getLname().compareTo(o2.getLname());
            else
                return o1.getHireDay().compareTo(o2.getHireDay());
    }
}
