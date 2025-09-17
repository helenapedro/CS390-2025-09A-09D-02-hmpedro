package W1L5_HW_Asgmt.prob3.after;

import W1L5_HW_Asgmt.prob3.before.Employee;

public interface EmployeeADTList {
    /*CRUD → Create, Read, Update, Delete:*/
    // CREATE : add / addAll / insert
    void add(Employee e);

    void insert(Employee e, int srcPos);
    void addAll(Employee[] employees);

    // Read : get / contains / indexOf / size / isEmpty
    Employee get(int i);
    int size();

    boolean contains(Employee e);

    // Update: set

    // Delete: remove / clear / removeIf / removeAll / retainAll
    boolean remove(int index);
    boolean remove(Employee e);
}
