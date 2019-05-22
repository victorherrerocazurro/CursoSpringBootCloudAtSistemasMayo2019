package com.atssitemas.curso.tiempo.bussiness;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.atssitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atssitemas.curso.tiempo.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.dto.UbicacionRequest;

@Component
public class RestTemplateClienteDarkSky implements ClienteDarkSky{

	@Autowired
	private DarkSkyProperties properties;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public PrediccionDarkSkyResponse obtenerPrediccion(UbicacionRequest ubicacionRequest){
		// https://api.darksky.net/forecast/7546f54c1c0561c1be0212d91d7f0ba4/53.5511,9.9937
		
		String url = 
				properties.getUrl() + "/" + 
				properties.getApiKey() + "/" + 
				ubicacionRequest.getLatitud() + "," + 
				ubicacionRequest.getLongitud();
		
		try {
			ResponseEntity<PrediccionDarkSkyResponse> respuesta = restTemplate.getForEntity(new URI(url), PrediccionDarkSkyResponse.class);
			return respuesta.getBody();
		} catch (Exception e) {
			throw new DarkSkyException(e);
		}
	}

}
