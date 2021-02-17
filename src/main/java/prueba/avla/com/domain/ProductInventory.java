package prueba.avla.com.domain;

import javax.persistence.Entity;

@Entity
public class ProductInventory extends BaseEntity{

	public ProductInventory() { }
	
	private String upc;
	private Integer quantityOnHand = 0;
	
}
