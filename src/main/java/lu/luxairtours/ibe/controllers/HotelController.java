package lu.luxairtours.ibe.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

@RestController
public class HotelController {

	private static final Logger log = LoggerFactory.getLogger(HotelController.class);
	
	
	@RequestMapping(path = "/hotels", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getHotelList(@RequestParam(name = "lang", required=false, defaultValue = "fr") String lang) {
//		JSONObject res = client.getHotels(lang);
//		return res.toString();
		
		return "";
	}
	
	@RequestMapping(path="/hotels/{hotelCode}")
	public String getHotelInfo(@PathVariable("hotelCode") String hotelCode, @RequestParam(name = "lang", required=false, defaultValue = "fr") String lang) throws Exception {
//		return client.getHotelInformation(hotelCode, lang);
		return "";
	}
	
	@RequestMapping(path = "/", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public String index(@RequestParam(name = "lang", required=false, defaultValue = "fr") String lang) {
//		return client.getValues(lang);
		return "";
	}
}
