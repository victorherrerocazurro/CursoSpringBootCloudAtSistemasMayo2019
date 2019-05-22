package com.atssitemas.curso.tiempo.bussiness;

import com.atssitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atssitemas.curso.tiempo.dto.UbicacionRequest;

public interface ClienteDarkSky {

	PrediccionDarkSkyResponse obtenerPrediccion(UbicacionRequest ubicacionRequest);
	
}
