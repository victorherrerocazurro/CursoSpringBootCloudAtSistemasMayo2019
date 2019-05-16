package com.atssitemas.curso.tiempo.service;

import java.util.Collection;

import com.atssitemas.curso.tiempo.dto.UbicacionRequest;
import com.atssitemas.curso.tiempo.dto.PrediccionResponse;

public interface TiempoService {

	PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest);
	
	Collection<PrediccionResponse> obtenerPredicciones();
	
}
