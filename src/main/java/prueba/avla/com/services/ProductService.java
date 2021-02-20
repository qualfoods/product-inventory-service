package prueba.avla.com.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import prueba.avla.com.domain.Product;
import prueba.avla.com.repositories.ProductRepository;
import prueba.avla.com.web.model.ProductPojo;

@Service
public class ProductService implements IproductService{

	ProductRepository productRepository;

	
	public Map<String, Object> getAllProductsInPage(int pageNo, int pageSize, String sortBy, Product prod){
		Example<Product> example = Example.of(prod);
		Map<String , Object> response = new HashMap<>();
		
        Sort sort = Sort.by(sortBy);
        Pageable page = PageRequest.of(pageNo, pageSize, sort);
        Page<Product> prodPage = productRepository.findAll(example, page);
        
        response.put("data", prodPage.getContent());
        response.put("tatalPages", prodPage.getTotalPages());
        response.put("total", prodPage.getTotalElements());
        response.put("page", prodPage.getNumber());
        System.out.println(prodPage.getContent());
        return response;
        
	}
	


	@Override
	public List<Product> getProductsById(Long productId) {		
		return productRepository.findAllByProductId(productId);
				
	}

	@Override
	public ProductPojo getProductsById(Long productId, Boolean showStockOnHand) {
		
			return null; //productRepository.findById(productId).orElseThrow(NotFoundException::new);		
	}

	@Override
	public ProductPojo saveNewProduct(ProductPojo productDto) {			
		return toDto(productRepository.save(toProductDomain(productDto)));
	}

	@Override
	public ProductPojo updateProduct(Long productId, ProductPojo productDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductPojo getByUpc(String upc) {
		// TODO Auto-generated method stub
		return null;
	}
	

	private ProductPojo toDto(Product product) {
		return ProductPojo.builder()
				.name(product.getName())
				.description(product.getDescription())
				.minimunStock(product.getMinimunStock())
				.price(product.getPrice())
				.build();
	}
	
	private Product toProductDomain(ProductPojo productDto) {
		return Product.builder()
				.name(productDto.getName())
				.description(productDto.getDescription())
				.minimunStock(productDto.getMinimunStock())
				.price(productDto.getPrice())
				.build();
	}
	
}
