package streams.practice.series1;

import java.util.Arrays;
import java.util.List;

public class FindLargestString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("gello","india","rajini","ok");
        List<Integer> numbers = Arrays.asList(10,12,52,85,1,10,12);
/*
        int s1=0;
        for (int h:numbers)
        {
            s1+=h;
        }
        System.out.println(s1);

 */
        //largest string
        String s = list.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(s);

        //sum of all num's
        Integer reduce = numbers.stream().reduce(1, (a, b) -> a *b);
        System.out.println(reduce);

    }
}
