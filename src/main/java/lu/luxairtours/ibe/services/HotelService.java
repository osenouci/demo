package lu.luxairtours.ibe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import de.bewotec.service.BewotecHubServiceStub;
import de.bewotec.bewotecws.schema.GetAvailableValues;
import de.bewotec.bewotecws.schema.ValuesRequestType;
import de.bewotec.bewotecws.schema.GetAvailableValuesResponse;
import de.bewotec.bewotecws.schema.ProductEnum;

@Component
public class HotelService {

	
	private String serviceHubAuthKey;
	private String contentAuthKey;
	private String treeId;
	private String serviceHubUrl;
	private String contentUrl;

	public String getHotelInfo() throws Exception {
		return "";
	}
	
	public HotelService(
		@Value("${bewotec.searchHub.authKey}") String serviceHubAuthKey, 
		@Value("${bewotec.contentHub.authKey}") String contentAuthKey,
		@Value("${bewotec.searchHub.treeId}") String treeId,
		@Value("${bewotec.searchHub.url}") String serviceHubUrl,
		@Value("${bewotec.contentHub.url}") String contentUrl
	) {
		this.serviceHubAuthKey = serviceHubAuthKey;
		this.contentAuthKey = contentAuthKey;
		this.treeId = treeId;
		this.serviceHubUrl = serviceHubUrl;
		this.contentUrl = contentUrl;
	}
	
	public GetAvailableValuesResponse getHotelList(String language) throws Exception, Exception {
		
		BewotecHubServiceStub service = new BewotecHubServiceStub(this.serviceHubUrl);
		GetAvailableValues requestContainer = new GetAvailableValues();

		ValuesRequestType request = new ValuesRequestType();

		request.setAuthKey(this.serviceHubAuthKey);
		request.setProductType(ProductEnum.PACKAGE);

		requestContainer.setGetAvailableValuesRequest(request);
		return service.getAvailableValues(requestContainer);
	}
}
