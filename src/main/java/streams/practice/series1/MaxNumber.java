package streams.practice.series1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 12, 52, 85, 1, 10, 12);


        //max number
        /*
        int max=numbers.stream().mapToInt(i->i).max().getAsInt();
        System.out.println("max value: "+max);
         */

        //min number
        /*
       int min= numbers.stream().mapToInt(i->i).min().getAsInt();
        System.out.println("min value: "+min);
         */

        //sort the numbers(ascending)
        //  numbers.stream().sorted().distinct().forEach(System.out::println);

        //sort the numbers (descending oreder)
        //numbers.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);

        //get second largest number
        int first = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(first);


        //limit (print fisrt few numbers)

        //  numbers.stream().limit(2).forEach(System.out::println);

        //sum of first 3 numbers
        /*
        int sum = numbers.stream().limit(3).mapToInt(i -> i).sum();
        System.out.println(sum);
        */

    }
}
