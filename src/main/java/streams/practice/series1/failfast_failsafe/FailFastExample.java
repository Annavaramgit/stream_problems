package streams.practice.series1.failfast_failsafe;

import java.util.*;

public class FailFastExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(158);

        Iterator it = list.iterator();
        while(it.hasNext()){
            Integer num = (Integer)it.next();
            System.out.println(num);
            list.remove(1);//while iterating here try to change the structure of collection
        }


    }


}
