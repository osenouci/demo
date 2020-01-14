package lu.luxairtours.ibe.services;

import java.util.Calendar;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import de.bewotec.service.BewotecHubServiceStub;
import lu.luxairtours.ibe.configuration.AppConfig;
import lu.luxairtours.ibe.services.mapping.HotelDto;
import lu.luxairtours.ibe.services.mapping.HotelMapper;
import lu.luxairtours.ibe.services.mapping.ObjectMapperUtils;
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
import de.bewotec.bewotecws.schema.ValuesHotelType;
import de.bewotec.content.ContentServiceStub.GetContentForAccommodation;

@Component
public class HotelService {

	private AppConfig config;
	BewotecHubServiceStub service;
	private final ModelMapper modelMapper = new ModelMapper();

	public HotelService(AppConfig config) throws AxisFault {
		this.config = config;
		service = new BewotecHubServiceStub(this.config.getServiceHubUrl());

		// Map the hotel code correctly
		PropertyMap<ValuesHotelType, HotelDto> hotelMap = new PropertyMap<ValuesHotelType, HotelDto>() {
			protected void configure() {
				map().setCode(source.getProductCode());
				map().setName(source.getName());
			}
		};
		modelMapper.addMappings(hotelMap);
	}

	public String getHotelInfo() throws Exception {
		return "";
	}

	public GetContentForAccommodationResponse getHotelDetails(String hotelCode, String lang, String departureAirport,
			Calendar dateFrom, Calendar dateTo) throws Exception {

		// Build the request
		ContentForAccommodationRequest hotelContentRequest = new ContentForAccommodationRequest();

		hotelContentRequest.setLanguageCode(lang);
		hotelContentRequest.setAuthKey(this.config.getContentAuthKey());
		hotelContentRequest.setTourOperatorCode(departureAirport);
		hotelContentRequest.setDetailLevel(DetailLevelEnum.Full);

		ArrayOfIdentifier identifiers = new ArrayOfIdentifier();
		Identifier identifier = new Identifier();
		identifier.setProductCode(hotelCode);
		identifier.setTouroperator(departureAirport);

		if (dateFrom != null) {
			identifier.setCheckInDate(dateFrom);
		}

		if (dateFrom != null) {
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

	public List<HotelDto> getHotelList(String language) throws Exception {

		BewotecHubServiceStub service = new BewotecHubServiceStub(this.config.getServiceHubUrl());
		GetAvailableValues requestContainer = new GetAvailableValues();

		// Configure the request
		ValuesRequestType request = new ValuesRequestType();

		request.setAuthKey(this.config.getServiceHubAuthKey());
		request.setProductType(ProductEnum.PACKAGE);

		// Make the request
		requestContainer.setGetAvailableValuesRequest(request);
		GetAvailableValuesResponse res = service.getAvailableValues(requestContainer);

		return ObjectMapperUtils.mapAll(this.modelMapper, res.getGetAvailableValuesResult().getHotels().getHotel(),
				HotelDto.class);
	}

}
