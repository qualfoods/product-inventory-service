package prueba.avla.com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import prueba.avla.com.domain.ProductInventory;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Long>{

	List<ProductInventory> findAllByProductId(Long id);
	
}
