package prueba.avla.com.domain;

import java.math.BigDecimal;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {
	
	@Id
	private Long id;
	private String name, description;
	private Integer minimunStock;
	private BigDecimal price;
}
