package streams.practice.series1.student_percentage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private String name;
    private Subjects subjects;
}
