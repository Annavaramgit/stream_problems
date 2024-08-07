package streams.practice.sorting_practice.map_sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NormalMapSort {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(21,"bye");
        map.put(11,"hello");
        map.put(1,"raj");
        map.put(65,"allo");

        //sort the this normal map(key is primitive,value also primtive type)

        //based on key (ascending)
        /*
        List<Map.Entry<Integer, String>> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        System.out.println(collect);
         */

        //based on key (descending)
        /*
        List<Map.Entry<Integer, String>> collect1 = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .collect(Collectors.toList());
        System.out.println(collect1);
         */

        //based on value
        //asceding
        /*
        List<Map.Entry<Integer, String>> collect2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println(collect2);

         */
        //descending based on value
        List<Map.Entry<Integer, String>> collect3 = map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().reversed()).collect(Collectors.toList());
        System.out.println(collect3);
    }
}
