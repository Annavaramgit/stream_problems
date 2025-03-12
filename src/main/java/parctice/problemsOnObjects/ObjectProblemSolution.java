package parctice.problemsOnObjects;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ObjectProblemSolution {

    //instead of creating class manually,this will give class along with setters and getters
    record Employee(int id, String name, double salary, String city) {
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee
                        (1, "dhanush", 900, "hyderabad"),
                new Employee(2, "mahesh", 1500, "vizag"),
                new Employee(3, "suresh", 1500, "hyderabad"),
                new Employee(4, "kaira", 1200, "hyderabad"),
                new Employee(5, "mahi", 1200, "vizag"),
                new Employee(6, "naresh", 1300, "hyderabad")
        );


        //find how many employees there belong's to particular city (eg:hyderbad)
        //way-1 using filter
        /*
        long hyderbadEmployeesCount = employees.stream().filter(emp -> emp.city().equalsIgnoreCase("hyderabad")).count();
        System.out.println("how many hyd emp available : "+hyderbadEmployeesCount);

        System.out.println();
        //way-2 using groupinBy method
        Map<Boolean, Long> hyderbad = employees.stream().collect(Collectors.groupingBy(i -> i.city().equalsIgnoreCase("hyderbad"), Collectors.counting()));
        System.out.println(hyderbad.get(true));
        */


        //find all employees whoose getting greater than particular amount (eg : 1000)
        /*
        List<Employee> moreSalaryGettingemployees = employees.stream().filter(emp -> emp.salary() > 1000).collect(Collectors.toList());
        System.out.println(moreSalaryGettingemployees);
        */


        //print employee names in capital letter and in alphabetcal order
        // employees.stream().sorted(Comparator.comparing(Employee::name)).map(emp->emp.name.toUpperCase()).forEach(System.out::println);

        //find emp fist emp belongs to particulat city if no one there handle excpetion.
        /*
        Employee fistEmp = employees.stream().filter(emp -> emp.city()
                        .equalsIgnoreCase("hyderabahd"))
                .findFirst().orElseThrow(() -> new RuntimeException("sorry no emp was found !!"));
        System.out.println(fistEmp);
        */

        //find sum of all employees salaries of sepcific city
        /*
        double totalSalary = employees.stream().filter(emp -> emp.city().equalsIgnoreCase("Vizag")).mapToDouble(emp -> emp.salary()).sum();
        System.out.println("total salary is : "+ totalSalary);
        */

        //sum of all emp salaries and avarage of salary
        /*
        double sumOfAllEmpSalaries  = employees.stream().mapToDouble(emp -> emp.salary()).sum();
        OptionalDouble averageOfEmpSalaries = employees.stream().mapToDouble(emp -> emp.salary()).average();
        System.out.println("sum of all emp salaries is : "+sumOfAllEmpSalaries+", average of emp salaries is : "+averageOfEmpSalaries.getAsDouble());
        */

        //get a MAP of employee nemes and their salaries
        /*
        Map<String, Double> mapEmpNameAndSalary = employees.stream().collect(Collectors.toMap(key -> key.name(), val -> val.salary()));
        mapEmpNameAndSalary.entrySet().stream().forEach((i)->System.out.println(i.getKey()+" : "+i.getValue()));
        */


        //find if all employees salary is specific amount or not
        //allMatch() METHOD USING && KNOW DIFFERENCE B/W allMatch() and anyMatch() metho
        /** anyMatch() -> this return based on the condition if any element or record satisfies contion then true
         * allMatch() -> this return all the elements or records satiesfie then only return true,if any one is not
         *                saties then retyurns false
         */
        /*
        boolean res = employees.stream().allMatch(emp -> emp.salary() > 1000);
        System.out.println("all employees getting greater than specific amount or not : "+res);
        boolean res1=employees.stream().anyMatch(emp->emp.salary()>1000);
        System.out.println("is any one getting more than specific amount salary : "+res1);
        */

        //sort descending order based on the salary
        //employees.stream().sorted(Comparator.comparing(Employee::salary).reversed()).forEach(System.out::println);
        //or
        // employees.stream().sorted((e1, e2) -> ((Double) e2.salary).compareTo(e1.salary)).forEach(System.out::println);


        //find highest salaried employee
        /*
        Employee employee = employees.stream().max(Comparator.comparing(Employee::salary)).get();
        System.out.println("highest salaried emp : "+employee);
        System.out.println();

        // NOTE :- the above only give first person of highest salry when two or more persons have same salary,below is the solution

        //1st getting what is the hihest salary figure then after filter whose getting this salary then solution came
        double maxSalary = employees.stream().mapToDouble(emp -> emp.salary())
                .max().getAsDouble();

        employees.stream().filter(emp->emp.salary==maxSalary).forEach(System.out::println);
        */


        //find second highest salaried employee
        ///*
        Optional<Employee>secHighestSalaryEmp = employees.stream().sorted(Comparator.comparing(Employee::salary).reversed()).skip(1).findFirst();
        if(secHighestSalaryEmp.isPresent()){
            System.out.println("second highest salary emp : "+secHighestSalaryEmp.get().name);
        }
        else{
            System.out.println("no emp !!");
        }

        //if multiple people have same salary that is second highest salary then above will give only first person remaining will be ignore,below is solution

        DoubleStream sorted = employees.stream().mapToDouble(emp -> emp.salary()).boxed()
                .sorted();

        // */

        //find employees whoose taking salary more than average of all emp slaries
        /*
        double avg = employees.stream().mapToDouble(i->i.salary).average().getAsDouble();
        employees.stream().filter(emp->emp.salary()>avg).forEach(System.out::println);
        */

        //find the emp who has long name
        /*
        Employee emploe = employees.stream().reduce((emp1,emp2)->emp1.name().length()>emp2.name().length()?emp1:emp2).get();
        System.out.println(emploe.name);
        */
    }
}
