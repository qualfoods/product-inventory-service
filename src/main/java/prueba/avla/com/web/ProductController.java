package prueba.avla.com.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.avla.com.domain.Product;
import prueba.avla.com.repositories.ProductRepository;
import prueba.avla.com.services.IproductService;
import prueba.avla.com.web.model.ProductPojo;

@RestController
@RequestMapping("/api/product/")
public class ProductController {

	private final IproductService productService;
	
	@Autowired
	public ProductController(IproductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/{productId}/inventory")
	public void/*List<ProductInventoryDto>*/ listProductById(@PathVariable Long productId){
		
		productService.getProductsById(productId);
		
	}
	@GetMapping()
	public List<ProductPojo> products(){
		return productService.getAllProducts();
	}
	

	
}
