package streams.practice.sorting_practice.map_sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Employe_Main {
    public static void main(String[] args) {

        Map<Employe,Integer> emp = new HashMap<>();

        emp.put(new Employe("mani",100,"java"),10);
        emp.put(new Employe("raju",102,"java"),50);
        emp.put(new Employe("mery",190,"chemist"),20);

        //sort if the sorted is object
        emp.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employe::getName)))
                .forEach(System.out::println);
    }
}
