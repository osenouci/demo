package lu.luxairtours.ibe.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.bewotec.bewotecws.schema.GetAvailableValuesResponse;
import de.bewotec.content.ContentServiceStub.GetContentForAccommodationResponse;
import lu.luxairtours.ibe.controllers.payload.HotelInfoPayload;
import lu.luxairtours.ibe.controllers.payload.HotelListPayload;
import lu.luxairtours.ibe.services.HotelService;
import lu.luxairtours.ibe.services.mapping.HotelDto;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

@RestController
public class HotelController {

	private static final Logger log = LoggerFactory.getLogger(HotelController.class);
	private HotelService hotelService;

	HotelController(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	// APPLICATION_JSON_VALUE
	@RequestMapping(path = "/hotels", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HotelDto> getHotelList(@Valid HotelListPayload payload) throws Exception {
		return hotelService.getHotelList(payload.getLang());
	}

	@RequestMapping(path = "/hotels/{hotelCode}")
	public GetContentForAccommodationResponse getHotelInfo(@PathVariable("hotelCode") String hotelCode,
			@Valid HotelInfoPayload payload) throws Exception {
		return hotelService.getHotelDetails(hotelCode, payload.getLang(), payload.getDepartureAirport(),
				payload.getDateFrom(), payload.getDateTo());
	}

	@RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public String index(@RequestParam(name = "lang", required = false, defaultValue = "fr") String lang) {
//		return client.getValues(lang);
		return "";
	}
}
