package W1L6_HW_Asgmt.hwsort.taska;

import java.util.Comparator;

public class NameComparator implements Comparator <DeptEmployee> {
    // Inner Sort
    @Override
    public int compare(DeptEmployee de1, DeptEmployee de2) {
        return de1.getName().compareTo(de2.getName());
    }
}
