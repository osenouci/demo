package lu.luxairtours.ibe.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class AppConfig {

	@Getter
	private String serviceHubAuthKey;
	@Getter
	private String contentAuthKey;
	@Getter
	private String treeId;
	@Getter
	private String serviceHubUrl;
	@Getter
	private String contentUrl;

	public AppConfig(@Value("${bewotec.searchHub.authKey}") String serviceHubAuthKey,
			@Value("${bewotec.contentHub.authKey}") String contentAuthKey,
			@Value("${bewotec.searchHub.treeId}") String treeId,
			@Value("${bewotec.searchHub.url}") String serviceHubUrl,
			@Value("${bewotec.contentHub.url}") String contentUrl) {
		this.serviceHubAuthKey = serviceHubAuthKey;
		this.contentAuthKey = contentAuthKey;
		this.treeId = treeId;
		this.serviceHubUrl = serviceHubUrl;
		this.contentUrl = contentUrl;
	}
}
