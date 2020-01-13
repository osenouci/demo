package lu.luxairtours.ibe.controllers.payload;

import lombok.Getter;
import lombok.Setter;
import lu.luxairtours.ibe.validators.LanguageConstraint;

public class HotelInfoPayload {

	@Getter
	@Setter
	@LanguageConstraint
	private String lang = "fr";
	
}
