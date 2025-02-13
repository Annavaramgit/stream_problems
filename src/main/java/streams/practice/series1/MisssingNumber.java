package streams.practice.series1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MisssingNumber {

    public static void main(String[] args) {
        //for n natural numbers then he will give n value
        int[] arr = {1, 2, 4, 5, 6, 7};

        int n = arr.length;

        int sumOfNNumbers = (n + 1) * (n + 2) / 2;
        System.out.println("sum of n natura num: " + sumOfNNumbers);
        int sum = Arrays.stream(arr).map(i -> i).sum();
        System.out.println("sum: " + sum);
        System.out.println("missing :" + (sumOfNNumbers - sum));

        String name = "hello world";

       //Stream.of(name).sorted(Comparator.reverseOrder()).forEach(System.out::println);

       Arrays.stream(name.split(" ")).sorted(Comparator.reverseOrder()).forEach(i-> System.out.print(i+" "));
       // Arrays.stream(name.split("")).sorted(Comparator.reverseOrder()).forEach(i-> System.out.print(i+" "));


    }


}
