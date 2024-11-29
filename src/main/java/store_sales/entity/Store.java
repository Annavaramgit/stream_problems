package store_sales.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "store_table")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long storeId;
    private String name;

}
