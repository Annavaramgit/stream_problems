package streams.practice.series1;

import java.util.Arrays;
import java.util.List;

public class NumberStartWith {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 52, 85, 1, 120);

        numbers.stream().map(i -> String.valueOf(i))
                .filter(i -> i.startsWith("1"))
                .map(i -> Integer.parseInt(i))
                .forEach(System.out::println);
    }
}
