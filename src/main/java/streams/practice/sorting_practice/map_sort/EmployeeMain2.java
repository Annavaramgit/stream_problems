package streams.practice.sorting_practice.map_sort;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain2 {
    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();

        list.add(new Employe("jaddu",2100,"java"));
        list.add(new Employe("mani",1100,"python"));
        list.add(new Employe("manas",2100,"java"));
        list.add(new Employe("jaddu",1100,"java"));
        list.add(new Employe("harish",2100,"python"));
/*
        Map<String, Optional<Employe>> collect = list.stream().collect(
                Collectors.groupingBy(Employe::getDepartment
                        , Collectors.minBy(Comparator.comparing(Employe::getSalary)))

        );

        collect.entrySet().stream()
                .forEach(System.out::println);

 */
        Scanner sc = new Scanner(System.in);
        System.out.println("emter dept:");
        String dept = sc.nextLine();

;        Optional<Employe> deoartment = list.stream().filter(i -> i.getDepartment().equalsIgnoreCase(dept))
                .max(Comparator.comparing(Employe::getSalary));
        System.out.println(deoartment);

    }
}
