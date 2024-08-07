package streams.practice.series1;

import lombok.*;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Data
@Setter
@Getter
@NoArgsConstructor
public class Orders {
    String orderId;
    double amount;
    String status;

    public Orders(String number, double v, String completed) {
        this.orderId = number;
        this.amount = v;
        this.status = completed;
    }


    public static void main(String[] args) {
        List<Orders> orders = Arrays.asList(
                new Orders("1", 250.0, "COMPLETED"),
                new Orders("2", 150.0, "PENDING"),
                new Orders("3", 450.0, "COMPLETED"),
                new Orders("4", 75.0, "PENDING"),
                new Orders("5", 300.0, "COMPLETED")
        );

        /* the status should completed and which is max price  */
        Optional<Orders> coMpLETED = orders.stream().filter(i -> i.getStatus().equalsIgnoreCase("COMpLETED")).max(Comparator.comparing(i -> i.getAmount()));
        System.out.println(coMpLETED);

        /*sum of the price which oreder status is completed */
        double res = orders.stream().filter(i -> i.getStatus().equalsIgnoreCase("completed")).mapToDouble(i -> i.getAmount()).sum();
        System.out.println("total amount for complted task:" + res);
    }

}
