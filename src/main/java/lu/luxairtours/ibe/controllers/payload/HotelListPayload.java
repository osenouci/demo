package lu.luxairtours.ibe.controllers.payload;

import lombok.Getter;
import lombok.Setter;
import lu.luxairtours.ibe.validators.LanguageConstraint;

public final class HotelListPayload {
	
	@Getter
	@Setter
	@LanguageConstraint
	private String lang = "fr";
}
