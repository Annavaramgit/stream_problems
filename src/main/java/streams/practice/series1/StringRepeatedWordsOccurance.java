package streams.practice.series1;


import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.stream.Collectors;

public class StringRepeatedWordsOccurance {
    public static void main(String[] args) {


        //string words count
        /*
        String s1="hellooohhohho";
        Map<String, Long> collect = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(collect);
        */


        //print the word which repeats more time
        /*
        String s1= "indianii";
        Map<String, Long> collect1 = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry = collect1.entrySet().stream().max(Map.Entry.comparingByValue())
                .get();
        System.out.println(stringLongEntry.getKey()+" : : "+stringLongEntry.getValue());
         */


        //in the list of string string count / repeated string
        /*
        List<String> stringList = Arrays.asList("hello","india","hello","mania","india");
        Map<String, Long> collect = stringList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        collect.entrySet().stream().filter(i->i.getValue()>1).forEach(i->System.out.println(i));
         */

        //which string repeats more time in the list of strings

        /*
        List<String> stringList = Arrays.asList("hello","inDia","hello","mania","indIa","India");
        Map<String, Long> collect = stringList.stream().collect(Collectors.groupingBy(i -> i.toLowerCase(), Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry.getKey()+"::"+stringLongEntry.getValue());
        */

        //reverse the strings prsent in the list
        /*
        List<String> stringList = Arrays.asList("hello","inDia","hello","mania","indIa","India");
        List<StringBuilder> collect = stringList.stream().map(i -> new StringBuilder(i).reverse()).collect(Collectors.toList());
        System.out.println(collect);
        */

        //reverse string variable
        String s ="hello";
        Arrays.stream(s.split("")).map(i->new StringBuilder(i).reverse()).forEach(System.out::print);



        String s1="hello";

        Map<String, Long> collect = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(collect);

    }



    }

