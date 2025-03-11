package parctice.problemsOnNumbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersProblemSolution {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 100, 65, 9, 90);
        int[] arr = new int[]{15, 48, 71, 53};


        //get only even numbers
        // numbers.stream().filter(num->num%2==0).forEach(System.out::println);

        //get big number
        /*
        Integer bigNumber = numbers.stream().reduce((num1, num2) -> num1 < num2 ? num2 : num1).get();
        System.out.println(bigNumber);
        */

        //apply streams on arrays
        // Arrays.stream(arr).forEach(System.out::println);

        //IntStream is specialized stream,here question print odd num's in 1-10 numbers range
        //IntStream.range(0, 10).filter(i -> i % 2 == 1).forEach(System.out::println);

        //arrange numbers in ascending and descending order
        /*
         List<Integer> ascendingOrderNumbers = numbers.stream().sorted().collect(Collectors.toList());
         System.out.println(ascendingOrderNumbers);
         List<Integer> descendingOrderNumbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         System.out.println(descendingOrderNumbers);
         */

        //arrange primitives numbers array in descending order
        /**
         the below method directly won't work (Comparator.reverseOreder() will not work) ,bcz that is expecting Object
         but we are passing primitive, so we have convert each primitive into object
         for that either use mapToObj method  (logic write convert) or use boxed() method which will automatically convert
         directly sorted() will work ,but Comparator.reverseOreder() not work  **/
        //Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::println);        //not work,
        //Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);  //work
        // Arrays.stream(arr).mapToObj(i->Integer.valueOf(i)).sorted(Comparator.reverseOrder()).forEach(System.out::println); //work

        /* find sum and average for both list of numbers and array of numbers */
        /*
        //finding avg and sum for list of numbers
        double avg = numbers.stream().mapToInt(i -> i).average().getAsDouble();
        //System.out.println(avg);
        //int sum = numbers.stream().mapToInt(i -> i).sum();  //covert into primitive then use sum method
        Integer sum = numbers.stream().reduce((n1, n2) -> n1 + n2).get(); //using reduce method no need convertion
        System.out.println(sum);

        //finding avg and sum for array of numbers
        int sum1 = Arrays.stream(arr).sum();
        //System.out.println(sum1);
        Double avg1 = Arrays.stream(arr).average().getAsDouble();
        // System.out.println(avg1);
        */


    }
}
