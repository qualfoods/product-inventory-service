package prueba.avla.com.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import prueba.avla.com.domain.Product;
import prueba.avla.com.repositories.ProductRepository;
import prueba.avla.com.web.model.ProductPojo;

@Service
public class ProductService implements IproductService{

	ProductRepository productRepository;

	@Override
	public List<ProductPojo> getAllProducts() {
		return productRepository.findAll()
				.stream()
				.map(this::toDto)
				.collect(Collectors.toList());				
	}

	@Override
	public List<Product> getProductsById(Long productId) {		
		return productRepository.findAllByProductId(productId);
				
	}


	private ProductPojo toDto(Product product) {
		return ProductPojo.builder()
				.name(product.getName())
				.description(product.getDescription())
				.minimunStock(product.getMinimunStock())
				.price(product.getPrice())
				.build();
	}
	
}
