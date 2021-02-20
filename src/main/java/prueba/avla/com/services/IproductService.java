package prueba.avla.com.services;

import java.util.List;
import java.util.Map;

import prueba.avla.com.domain.Product;
import prueba.avla.com.web.model.ProductPojo;

public interface IproductService {
	

	List<Product> getProductsById(Long productId);
	Map<String, Object> getAllProductsInPage(int pageNo, int pageSize, String sortBy, Product prod);	
	ProductPojo getProductsById(Long productId, Boolean showStockOnHand);
    ProductPojo saveNewProduct(ProductPojo productDto);
    ProductPojo updateProduct(Long productId, ProductPojo productDto);
    ProductPojo getByUpc(String upc);
	
}
