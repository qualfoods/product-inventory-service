package prueba.avla.com.services;

import java.util.List;

import prueba.avla.com.domain.Product;
import prueba.avla.com.web.model.ProductPojo;

public interface IproductService {
	
	List<ProductPojo> getAllProducts();
	List<Product> getProductsById(Long productId);
	
}
