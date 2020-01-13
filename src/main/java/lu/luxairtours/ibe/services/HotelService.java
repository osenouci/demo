package lu.luxairtours.ibe.services;

import org.springframework.beans.factory.annotation.Value;

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

	private final static String SOUP_ACTION_GET_AVAILABLE_VALUES = "GetAvailableValues";
	
	public String getHotelList(String language) {
		
		
		
		
		return "";
	}
}
