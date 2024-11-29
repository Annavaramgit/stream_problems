package store_sales.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store_sales.entity.Sales;

import java.util.List;

@Repository
public interface SalesRepo extends JpaRepository<Sales,Long> {
    List<Sales> findAllByStore_StoreId(long id);

}
