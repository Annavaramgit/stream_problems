package store_sales.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import store_sales.entity.Store;
@Repository
public interface StoreRepo extends JpaRepository<Store,Long> {

   Store findByName(String name);

}
