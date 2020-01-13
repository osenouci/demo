package lu.luxairtours.ibe.services;

import org.springframework.beans.factory.annotation.Value;
import de.bewotec.service.BewotecHubServiceStub;
import de.bewotec.bewotecws.schema.GetAvailableValues;
import de.bewotec.bewotecws.schema.ValuesRequestType;
import de.bewotec.bewotecws.schema.GetAvailableValuesResponse;
import de.bewotec.bewotecws.schema.ProductEnum;

public class HotelService {

	
	@Value("${bewotec.searchHub.authKey}")
	private String authKey;
	@Value("${bewotec.contentHub.authKey}")
	private String contentAuthKey;
	@Value("${bewotec.searchHub.treeId}")
	private String treeId;
	@Value("${bewotec.searchHub.url}")
	private String url;
	@Value("${bewotec.contentHub.url}")
	private String contentUrl;
	@Value("${bewotec.searchHub.actionPrefix}")
	private String actionPrefix;
	
	public String getHotelInfo() throws Exception {
		
		return "";
	}
	public GetAvailableValuesResponse getHotelList(String language) throws Exception, Exception {

		BewotecHubServiceStub service = new BewotecHubServiceStub("http://192.150.150.238:6164/Bewo.Hub.Service/BewotecHubService.svc");
		GetAvailableValues requestContainer = new GetAvailableValues();
		
		ValuesRequestType request = new ValuesRequestType();
		
		request.setAuthKey("FtM8u18lux");
		request.setProductType(ProductEnum.PACKAGE);
	
		requestContainer.setGetAvailableValuesRequest(request);
		GetAvailableValuesResponse res = service.getAvailableValues(requestContainer);
		return res;		
	}
}
