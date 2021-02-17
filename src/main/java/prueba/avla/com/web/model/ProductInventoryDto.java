package prueba.avla.com.web.model;

public class ProductInventoryDto {
	private Long id;
	private Integer quantityOnHand;
	
	public ProductInventoryDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	
	

}


