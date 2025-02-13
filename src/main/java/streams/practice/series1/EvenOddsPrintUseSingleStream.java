package streams.practice.series1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddsPrintUseSingleStream {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("even: "+ collect.get(true));
        System.out.println("even: "+ collect.get(false));

    }

}
