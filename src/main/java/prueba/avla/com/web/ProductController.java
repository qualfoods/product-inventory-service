package prueba.avla.com.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import prueba.avla.com.domain.Product;
import prueba.avla.com.services.IproductService;

@RestController
@RequestMapping("/product")
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
	public Map<String,Object> getProductsInPage(
            @RequestParam(name = "pageNum", defaultValue = "0") int pageNo,
            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(name = "sortBy", defaultValue = "id") String sortBy,
            @RequestBody Product product){
		
		
		return productService.getAllProductsInPage(pageNo, pageSize, sortBy, product);
	}
	

	
}
