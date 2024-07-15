package streams.practice.series1;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import java.util.stream.IntStream;


@Data
public class SumOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,2,5,85,10,8,13);

        //way-1 of sum
        /*
       Optional<Integer> sum=numbers.stream().reduce((i1, i2)->i1+i2);
        System.out.println(sum);
         */

        //way-2 of sum
        /*
       int sum1 = numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);
         */


        //way of average
        /*
       OptionalDouble avg = numbers.stream().mapToDouble(i->i).average();
        System.out.println(avg);
        */

        //avg for sqaures only greater than 10
       /*
        double avg2 =numbers.stream().map(i->i*i).filter(i->i>10).mapToDouble(i->i).average().getAsDouble();
        System.out.println(avg2);
        */

        /*
        //even numbers
        numbers.stream().filter(i->i%2==0).forEach(System.out::println);
        //odd numbers
        numbers.stream().filter(i->i%2!=0).forEach(System.out::println);
         */


       // numbers.stream().distinct().forEach(System.out::println);


    }






}
