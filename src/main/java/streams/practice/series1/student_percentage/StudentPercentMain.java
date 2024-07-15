package streams.practice.series1.student_percentage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentPercentMain {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();

        list.add(new Students("mahi",(new Subjects(100,40,39,75))));
        list.add(new Students("raina",(new Subjects(100,40,39,75))));
        list.add(new Students("mahi",(new Subjects(90,43,90,85))));
        boolean mahi = list.add(new Students("mahi", (new Subjects(100, 48, 69, 75))));

    Students s= new Students();

        int total=400;

       list.stream().filter(i -> (((i.getSubjects().getEnglish() + i.getSubjects().getMaths() + i.getSubjects().getPhysics()
                        + i.getSubjects().getScience()) / (double) total) * 100) > 70.0)
                //.map(i -> i.getName())
                .sorted(Comparator.comparing(Students::getName))
               .forEach(System.out::println);


//        list.stream().map(i -> (i.getSubjects().getEnglish() + i.getSubjects().getMaths() + i.getSubjects().getPhysics()
//                + i.getSubjects().getScience()))
/*
        Map<Integer, List<Students>> collect = list.stream().collect(Collectors.groupingBy(StudentPercentMain::countMarks));
    collect.entrySet().stream().filter(i->i.getValue().size()>1).forEach(System.out::println);

    }
    public static int countMarks(Students s){
        Subjects sub = s.getSubjects();
        return sub.getEnglish()+sub.getMaths()+sub.getScience()+sub.getPhysics();*/
    }
}