package prueba.avla.com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.avla.com.repositories.ProductInventoryRepository;
import prueba.avla.com.web.model.ProductInventoryDto;

@RestController
@RequestMapping("/api/product/")
public class ProductInventoryController {

	@Autowired
	private final ProductInventoryRepository productInventoryRepository;
	
	@GetMapping("/{productId}/inventory")
	public void/*List<ProductInventoryDto>*/ listProductById(@PathVariable Long productId){
		
		productInventoryRepository.findAllByProductId(productId);
		
	}
	
}
