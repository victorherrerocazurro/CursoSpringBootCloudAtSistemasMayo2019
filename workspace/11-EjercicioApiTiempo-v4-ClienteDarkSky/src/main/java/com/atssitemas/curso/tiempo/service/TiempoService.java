package com.atssitemas.curso.tiempo.service;

import com.atssitemas.curso.tiempo.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.dto.UbicacionRequest;

public interface TiempoService {

	PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest);
	
}
