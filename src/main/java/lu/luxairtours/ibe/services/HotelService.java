package lu.luxairtours.ibe.services;

import java.util.Calendar;

import org.springframework.stereotype.Component;
import de.bewotec.service.BewotecHubServiceStub;
import lu.luxairtours.ibe.configuration.AppConfig;
import de.bewotec.bewotecws.schema.GetAvailableValues;
import de.bewotec.bewotecws.schema.ValuesRequestType;
import de.bewotec.content.ContentServiceStub;
import de.bewotec.content.ContentServiceStub.ArrayOfIdentifier;
import de.bewotec.content.ContentServiceStub.ContentForAccommodationRequest;
import de.bewotec.content.ContentServiceStub.DetailLevelEnum;
import de.bewotec.content.ContentServiceStub.GetContentForAccommodationResponse;
import de.bewotec.content.ContentServiceStub.Identifier;
import de.bewotec.bewotecws.schema.GetAvailableValuesResponse;
import de.bewotec.bewotecws.schema.ProductEnum;
import de.bewotec.content.ContentServiceStub.GetContentForAccommodation;

@Component
public class HotelService {

	private AppConfig config;

	public String getHotelInfo() throws Exception {
		return "";
	}
	
	public HotelService(AppConfig config) {
		this.config = config;
	}
	
	public GetContentForAccommodationResponse getHotelDetails(String hotelCode, String lang, Calendar dateFrom, Calendar dateTo) throws Exception {
		
		// Build the request
		ContentForAccommodationRequest hotelContentRequest = new ContentForAccommodationRequest();

		hotelContentRequest.setLanguageCode(lang);
		hotelContentRequest.setAuthKey(this.config.getContentAuthKey());
		hotelContentRequest.setTourOperatorCode("LUX");
		hotelContentRequest.setDetailLevel(DetailLevelEnum.Full);
		
		ArrayOfIdentifier identifiers = new ArrayOfIdentifier();
		Identifier identifier = new Identifier();
		identifier.setProductCode(hotelCode);
		identifier.setTouroperator("LUX");
		
		if(dateFrom != null) {
			identifier.setCheckInDate(dateFrom);			
		}

		if(dateFrom != null) {
			identifier.setCheckOutDate(dateTo);	
		}
		identifiers.addIdentifier(identifier);
		hotelContentRequest.setIdentifiers(identifiers);
		
		// Make the request and get the response
		ContentServiceStub contentService = new ContentServiceStub(this.config.getContentUrl());
		GetContentForAccommodation content = new GetContentForAccommodation();
		content.setRequest(hotelContentRequest);
		return contentService.getContentForAccommodation(content);
	}
	public GetAvailableValuesResponse getHotelList(String language) throws Exception, Exception {
		
		BewotecHubServiceStub service = new BewotecHubServiceStub(this.config.getServiceHubUrl());
		GetAvailableValues requestContainer = new GetAvailableValues();

		ValuesRequestType request = new ValuesRequestType();

		request.setAuthKey(this.config.getServiceHubAuthKey());
		request.setProductType(ProductEnum.PACKAGE);

		requestContainer.setGetAvailableValuesRequest(request);
		return service.getAvailableValues(requestContainer);
	}
}
