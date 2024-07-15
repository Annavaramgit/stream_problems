package streams.practice.sorting_practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee_Main {
    public static void main(String[] args) {
        List<Employee> empData = Employee_Data.data();

        /*
        //sort based on name (without using comparator implementations
        List<Employee> collect = empData.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(collect);
         */

        //sort based on the salary with comparator implementation
        /*
        Employee emp =new Employee();
        List<Employee> collect = empData.stream().sorted(emp::compare).collect(Collectors.toList());
        System.out.println(collect);
    }
    */
        //print lowest salry employee objcet
        Employee employee = empData.stream()
                .reduce((emp1, emp2) -> emp1.getSalry() < emp2.getSalry() ? emp1 : emp2)
                .get();
        System.out.println(employee);

    }
}
