package prueba.avla.com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import prueba.avla.com.domain.Product;
import prueba.avla.com.domain.ProductInventory;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByProductId(Long id);
	
}
