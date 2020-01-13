package lu.luxairtours.ibe.services;

import org.springframework.stereotype.Component;
import de.bewotec.service.BewotecHubServiceStub;
import lu.luxairtours.ibe.configuration.AppConfig;
import de.bewotec.bewotecws.schema.GetAvailableValues;
import de.bewotec.bewotecws.schema.ValuesRequestType;
import de.bewotec.bewotecws.schema.GetAvailableValuesResponse;
import de.bewotec.bewotecws.schema.ProductEnum;

@Component
public class HotelService {

	private AppConfig config;

	public String getHotelInfo() throws Exception {
		return "";
	}
	
	public HotelService(AppConfig config) {
		this.config = config;
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
