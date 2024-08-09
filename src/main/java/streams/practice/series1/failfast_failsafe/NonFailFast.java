package streams.practice.series1.failfast_failsafe;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class NonFailFast {
    public static void main(String[] args) {
        Map map = new ConcurrentHashMap();

        map.put("one", "one");
        map.put("two", "two");
        map.put("three", "three");

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry n = (Map.Entry) itr.next();
            System.out.println(n.getKey() + "::" + n.getValue());

            /*here changing structure of collection while iteration but error will not come
             and this change will not reflect on original*/

            map.put("four", "four");

        }

        /* CopyOnWriteArrayList*/

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("hello");
        list.add("bye");

        Iterator it = list.iterator();
        while(it.hasNext()){
            String s =(String) it.next();
            System.out.println(s);
            list.add("india");
        }


    }
}
