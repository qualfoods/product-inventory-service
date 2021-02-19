package prueba.avla.com.web.model;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductPojo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name ,description;
	private Integer minimunStock;
	private BigDecimal price;
}
