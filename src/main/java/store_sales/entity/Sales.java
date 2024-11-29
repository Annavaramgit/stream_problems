package store_sales.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "sale_table")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Sales {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long saleId;

    @ManyToOne
    @JoinColumn(referencedColumnName = "productId",name="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(referencedColumnName = "storeId",name="store_id")
    private Store store;

    private int saleQuantity;
}
