package streams.practice.sorting_practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparator<Employee> {
    private String name;
    private long salry;

    @Override
    public int compare(Employee o1, Employee o2) {

        return (int) (o2.getSalry()-o1.getSalry());

    }
}
