package streams.practice.series1;

import java.util.Arrays;
import java.util.List;

public class MakeFirstLetterInNameCapital {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("mahi","raina","jaddu");

        names.stream().map(i->i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()).forEach(i->System.out.println(i));



    }

}
