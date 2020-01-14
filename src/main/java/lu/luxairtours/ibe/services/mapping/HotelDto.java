package lu.luxairtours.ibe.services.mapping;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class HotelDto {

	@Getter
	@Setter
	private String code;
	@Getter
	@Setter
	private String name;
}
