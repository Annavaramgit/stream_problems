package streams.practice.series1.highestsalary;

import java.util.*;

public class EmpMain {

    public static void main(String[] args) {
        List<Emp> emp = new ArrayList<>();

        emp.add(new Emp("mahi", 10200));
        emp.add(new Emp("phani", 11200));
        emp.add(new Emp("raj", 13250));


        //hihest salry of employe
/*
        Optional<Emp> max = emp.stream().max(Comparator.comparing(Emp::getSalary));
        System.out.println(max);

        //name only who taken highest salary
        Optional<String> s = emp.stream().max(Comparator.comparing(Emp::getSalary)).map(i -> i.getName());
        System.out.println(s.get());
*/
        //lowest salry of employee
        /*
        Optional<Emp> min = emp.stream().min(Comparator.comparing(Emp::getSalary));
        System.out.println(min);
         */

        /*
        //another way to find hishest salry employe name only print
        Optional<String> first = emp.stream().sorted((i1,i2)->Double.compare(i2.getSalary(),i1.getSalary())).map(each -> each.getName()).findFirst();
        System.out.println(first.get());
         */

        //applying streams on arrays
        /*
        int[] arr = {1, 2, 3, 1, 2, 4, 5,5};
        Arrays.stream(arr).distinct().forEach(System.out::println);
         */

    }
}
