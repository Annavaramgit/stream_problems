package streams.practice.series1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringRepeatedWordsOccurance {
    public static void main(String[] args) {
        String s1="hello";

        Map<String, Long> collect = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(collect);
    }
}
