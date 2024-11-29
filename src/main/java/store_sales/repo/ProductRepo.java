package store_sales.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store_sales.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
