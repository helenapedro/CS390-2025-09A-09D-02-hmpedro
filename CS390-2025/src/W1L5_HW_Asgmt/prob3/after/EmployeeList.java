package W1L5_HW_Asgmt.prob3.after;

import W1L5_HW_Asgmt.prob3.before.BasePlusCommissionEmployee;
import W1L5_HW_Asgmt.prob3.before.CommissionEmployee;
import W1L5_HW_Asgmt.prob3.before.Employee;

import java.util.Arrays;

public class EmployeeList {
    private Employee[] empArray;
    private final int IN_LENGTH = 5;
    private int size;

    public EmployeeList() {
        empArray = new Employee[IN_LENGTH];
        size = 0;
    }

    public void add(Employee e) {
        if (e == null) throw new NullPointerException("Employee data is null");

        if (empArray.length == size) {
            resize();
        }
        empArray[size++] = e;
    }

    // INSERT -> CHECK(edge cases) → ENABLE (resize) → MOVE(System.arraycopy) → PLACE
    public void insert(Employee e, int srcPos) {
        if (e == null) throw new NullPointerException("Employee cannot be null");
        if (srcPos < 0 || srcPos > size) throw new IndexOutOfBoundsException("pos: " + srcPos);

        // resize → arraycopy → set → size++
        if (size == empArray.length) resize();

        int destPos = srcPos + 1;
        int numToMove = size - srcPos;

        System.arraycopy(
                empArray, srcPos,
                empArray, destPos,
                numToMove
        );
        empArray[srcPos] = e;
        size++;
    }
    public void addAll(Employee[] employees) {
        if (employees == null || employees.length == 0) return;

        while (size + employees.length > empArray.length) {
            resize();
        }
        System.arraycopy(employees, 0, empArray, size, employees.length);

        size += employees.length;
    }

    private int getSize() {
        return size;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;

        int numToMove = size - index - 1;
        if (numToMove > 0) {
            System.arraycopy(
                    empArray, index + 1,
                    empArray, index, numToMove
            );
        }
        empArray[--size] = null;
        return true;
    }
    public boolean remove(Employee e) {
        if (e == null || size == 0) return false;

        for (int i = 0; i < size; i++) {
            if (e.equals(empArray[i])) {
                int numToMove = size - i - 1;
                if (numToMove > 0) {
                    System.arraycopy(
                            empArray, i + 1,
                            empArray, i, numToMove
                    );
                }
                empArray[--size] = null;
                return true;
            }
        }
        return false;
    }
    private void resize() {
        int newLen =(empArray.length == 0) ? IN_LENGTH : empArray.length * 2;
        empArray = Arrays.copyOf(empArray, newLen);
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(", \n");
            sb.append(empArray[i]);
        }
        return sb.append("]").toString();
    }
    public static void main(String[] args) {
        Employee e1 = new CommissionEmployee("Jane", "Smith", "000-00-0000", 20000, 0.12);
        Employee e2 = new CommissionEmployee("Alice", "Johnson", "111-22-3333", 10000, 0.10);
        Employee e3 = new BasePlusCommissionEmployee("Bob", "Smith", "222-33-4444", 5000, 0.08, 300);
        Employee e4 = e2;
        Employee e5 = null;

        EmployeeList list = new EmployeeList();


        list.add(e1);
        System.out.println("The array of size " + list.size + ", is: \n" + list);
        list.add(e2);
        System.out.println("The array of size " + list.size + ", is: \n" + list);
        list.insert(e3, 0);
        System.out.println("The array of size " + list.size + ", is: \n" + list);
        //list.insert(e5, 3); // NullPointerException: Employee cannot be null
        list.add(e4);
        System.out.println("The array of size " + list.size + ", is: \n" + list);
    }
}
