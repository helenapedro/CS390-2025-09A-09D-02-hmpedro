package W1L5_HW_Asgmt.prob3.before;

import java.util.Comparator;

public class NameComparator implements Comparator <Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
