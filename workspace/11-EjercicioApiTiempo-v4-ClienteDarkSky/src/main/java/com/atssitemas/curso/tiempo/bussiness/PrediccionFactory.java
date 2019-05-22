package com.atssitemas.curso.tiempo.bussiness;

import org.springframework.stereotype.Component;

import com.atssitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atssitemas.curso.tiempo.dto.PrediccionResponse;

@Component
public class PrediccionFactory {

	public PrediccionResponse getInstanceFromPrediccionDarkSkyResponse(
			PrediccionDarkSkyResponse prediccionDarkSkyResponse) {
		return new PrediccionResponse(
				prediccionDarkSkyResponse.getIcon(), 
				prediccionDarkSkyResponse.getSummary(), 
				prediccionDarkSkyResponse.getTemperature());
	}
	
}
