package store_sales.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
//@Builder
public class StoreSalesInfoDto {

    private String productName;
    private int saleQuantity;
    private double mrp;
    private double amount;
}
