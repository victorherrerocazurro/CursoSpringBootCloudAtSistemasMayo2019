package com.atssitemas.curso.tiempo.front.service;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.atssitemas.curso.tiempo.front.dto.PrediccionResponse;

@FeignClient(name="persistencia")
public interface PrediccionService {

	@GetMapping("/prediccion")
	Collection<PrediccionResponse> obtenerPredicciones();
	
}
