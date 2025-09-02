package lesson8;

import java.time.LocalDate;
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom","Bruce", LocalDate.of(2014,12,12));
        Employee e2 = new Employee("Renuka","Mohanraj", LocalDate.of(2014,5,1));
        Employee e3 = new Employee("Tom","Daniel", LocalDate.of(2020,11,11));
        Employee e4 = new Employee("Tom","Bruce", LocalDate.of(2016,10,10));
        Employee e5 = new Employee("Anne","Dow", LocalDate.of(2014,12,12));

        // Employee Array List
        List<Employee> elist = new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
        // Sort by Firstname - Familiar this step
        Collections.sort(elist,new EmployeeFirstnameCom());
        elist.forEach(x-> System.out.println(x.getFname()));

        // How to make Comparator which consist with equals()
        Employee e11 = new Employee("Tom","Bruce",
                LocalDate.of(2014,12,12));
        Employee e12 = new Employee("Tom","Lester",
                LocalDate.of(2018,10,3));

        Employee e13 = new Employee("Tom","Bruce",
                LocalDate.of(2014,12,12));
        boolean res = e11.equals(e12); // false
        System.out.println("e11.equals(e12) = " + res);
        // Call Firstname Comparator to test e11 and e12 equality
        EmployeeFirstnameCom ob = new EmployeeFirstnameCom();
        int com = ob.compare(e11,e12);
        // EmployeeFirstnameCom is not consist with equal, equals says false,
        // but EmployeeFirstnameCom Comparator says equal by returning 0
        System.out.println("e11.FirstnameComparator.compare(e12) = " + com); // 0

        // Check Consistency
        EmployeeComparator ec = new EmployeeComparator();
        res = e11.equals(e12); // False
        System.out.println("e11.equals(e12) = " + res);
        com = ec.compare(e11,e12);
        System.out.println("e11.ConsistComparator.compare(e12) = " + com); // 0

        res = e11.equals(e13); // False
        System.out.println("e11.equals(e13) = " + res);
        com = ec.compare(e11,e13);
        System.out.println("e11.ConsistComparator.compare(e13) = " + com);

        // New way of using consist comparator
        Collections.sort(elist, Comparator.comparing(Employee::getFname)
                .thenComparing(Employee::getLname).thenComparing(Employee::getHireDay));
        System.out.println("After Consist Sorting new way : " + elist);

        Collections.sort(elist,new EmployeeComparator());
        System.out.println("After Consist Sorting old way: " + elist);
    }
}
