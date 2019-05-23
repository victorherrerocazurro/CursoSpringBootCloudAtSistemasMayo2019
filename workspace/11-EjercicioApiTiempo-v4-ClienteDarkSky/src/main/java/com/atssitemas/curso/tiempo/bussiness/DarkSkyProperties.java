package com.atssitemas.curso.tiempo.bussiness;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "darksky.api")
public class DarkSkyProperties {

	private String url = "https://api.darksky.net/forecast";
	
	private String apiKey = "7546f54c1c0561c1be0212d91d7f0ba4";

	public String getUrl() {
		return url;
	}

	public String getApiKey() {
		return apiKey;
	}
	
	
}
