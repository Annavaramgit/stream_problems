package parctice.problemsOnNumbers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersProblemSolution {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 11, 2, 22, 51, 73);
        int[] arr = new int[]{15, 48, 71, 53};


        //get only even numbers
        /* numbers.stream().filter(num->num%2==0).forEach(System.out::println);

         */

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
         the below method directly won't work (Comparator.reverseOrder() will not work) ,bcz that is expecting Object
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

        //find min and max in list of numbers and arrays of numbers
        /*
        //Integer maxNumber = numbers.stream().max(Comparator.comparing(i -> i)).get();
        Integer maxNumber = numbers.stream().reduce((num1, num2) -> num1 < num2 ? num2 : num1).get();
        Integer minNumber = numbers.stream().min(Comparator.comparing(i->i)).get();
        System.out.println("max : "+maxNumber);
        System.out.println("min : "+minNumber);

        OptionalInt min = Arrays.stream(arr).min();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("min in arr num : "+min.getAsInt());
        System.out.println("max in arr num :"+max);
        */

        //remove duplicates in list of numbers and arrays of numbers
        /*
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println();
        Arrays.stream(arr).distinct().forEach(System.out::println);
        */

        //find second hhest and second lowest number in list of num's and array of num's
        /*
        Integer secondLargeNumber = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second highest number : " + secondLargeNumber);
        Integer secondLowestNumber = numbers.stream().sorted().skip(1).findFirst().get();
        System.out.println("second lowest number : " + secondLowestNumber);

        Integer secondHighestInArrNums = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        Integer secondLowestInArrNums = Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
        System.out.println("2nd high num is : " + secondHighestInArrNums + " , 2nd lowest num is : " + secondLowestInArrNums);
        */

        //product of nmbers using reduce method
        /*
        Integer pr = numbers.stream().reduce((n1, n2) -> n1 * n2).get();
        System.out.println(pr);
        */

        //separate event and odd numbers
        /*
        Map<Boolean, List<Integer>> evenOddNumbers = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("event Numbers are : "+evenOddNumbers.get(true));
        System.out.println("odd Numbers are : "+evenOddNumbers.get(false));
        */


        //FLATMAP USING
        //sum of all numbers in two-d array,sum the list of list of numbers
        /*
        int[][] twodarr = new int[][]{{1, 2}, {5, 7}, {3, 9}};
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 5, 3), Arrays.asList(10, 5, 85)
        );

        //two-d array sum
        int sum = Arrays.stream(twodarr).flatMapToInt(one -> Arrays.stream(one)).sum();
        System.out.println(sum);

        //difference using flatmap and without using flatmap
        System.out.println();
        nestedList.stream().flatMap(one -> one.stream()).forEach(System.out::print); //all numbers print in same steam
        System.out.println();
        nestedList.stream().forEach(System.out::println);      //two diff streams it will print

        //multi-list num's sum
        int sumTheNumbersOfListOFListOfNumbers = nestedList.stream().flatMap(one -> one.stream()).mapToInt(i -> i).sum();
        System.out.println(sumTheNumbersOfListOFListOfNumbers);
        */

        //convert list of numbers int map(each num is map ,and key is that num and value is square of that num)
        /*
        Map<Integer, Integer> convertedMap = numbers.stream().collect(Collectors.toMap(key -> key, val -> val * val));
        System.out.println(convertedMap);
        */
    }
}
