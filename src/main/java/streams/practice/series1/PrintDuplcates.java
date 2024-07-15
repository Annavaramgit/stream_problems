package streams.practice.series1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PrintDuplcates {
    private int age;
    private String name;

    public static void main(String[] args) {

        //print duplicate only


        List<Integer> numbers = Arrays.asList(10, 12, 52, 85, 1, 10, 12);
/*
     //way-1 of print duplicates only
      Set<Integer>s= numbers.stream().filter(e-> Collections.frequency(numbers,e)>1).collect(Collectors.toSet());
      System.out.println(s);


        //way-2 of print duplicates only
        Set<Integer> set = new HashSet<>();
        Set<Integer>set1= numbers.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
        System.out.println(set1);

          //non duplicates(remove duplicates
        numbers.stream().distinct().forEach(System.out::println);
 */



        PrintDuplcates s1 = new PrintDuplcates(19, "raj");
        PrintDuplcates s2 = new PrintDuplcates(23, "kumar");
        PrintDuplcates s3 = new PrintDuplcates(24, "rani");
        PrintDuplcates s4 = new PrintDuplcates(24, "raj kumar");

        List<PrintDuplcates> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
/*
        //print same age group people
   Map<Integer,List<PrintDuplcates>>  res= list.stream().collect(Collectors.groupingBy(PrintDuplcates::getAge));


//        res.forEach((age, names) -> {
//            System.out.println("Age " + age + ": " + names);
//        });

                    res.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)  // Filter out groups with more than one person
                .forEach(entry -> {
                    System.out.println("Age " + entry.getKey() + ": " + entry.getValue());
                });


        //print age greater than 20
        /*
        list.stream().filter( a-> a.getAge()>20)
                .collect(Collectors.mapping(PrintDuplcates::getName,Collectors.toList())).forEach(System.out::println);

         */

        /*
        //print count of duplicates

        Map<Integer, Long> collect = numbers.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        collect.entrySet().stream().filter(a->a.getValue()>1).
        forEach(System.out::println);

         */



//count same age group people
/*
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(PrintDuplcates::getAge, Collectors.counting()));
        collect.entrySet().stream()
                .filter(a -> a.getValue() > 1)
                .forEach(i->System.out.println(i.getKey()+"::"+i.getValue()));

 */




        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(PrintDuplcates::getAge, Collectors.counting()));
        collect.entrySet().stream()
                .filter(a->a.getValue()>1)
                .forEach(System.out::println);

    }
}
