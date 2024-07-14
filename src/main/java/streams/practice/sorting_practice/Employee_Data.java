package streams.practice.sorting_practice;

import java.util.ArrayList;
import java.util.List;

public class Employee_Data {

    public static List<Employee> data(){
        List<Employee> data = new ArrayList<>();
        data.add(new Employee("mahi",1200));
        data.add(new Employee("harish",1600));
        data.add(new Employee("rani",1100));
        data.add(new Employee("mani",2000));
        return data;
    }

}
