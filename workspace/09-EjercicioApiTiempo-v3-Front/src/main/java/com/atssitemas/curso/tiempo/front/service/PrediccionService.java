package com.atssitemas.curso.tiempo.front.service;

import java.math.BigDecimal;
import java.util.Collection;

import com.atssitemas.curso.tiempo.front.dto.PrediccionResponse;

public interface PrediccionService {

	PrediccionResponse obtenerPrediccionPorUbicacion(BigDecimal latitud, BigDecimal longitud);

	Collection<PrediccionResponse> obtenerPredicciones();
	
}
