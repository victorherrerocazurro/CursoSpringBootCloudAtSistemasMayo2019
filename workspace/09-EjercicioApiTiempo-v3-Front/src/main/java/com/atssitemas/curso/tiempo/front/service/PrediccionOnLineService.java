package com.atssitemas.curso.tiempo.front.service;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.atssitemas.curso.tiempo.front.dto.PrediccionResponse;

@FeignClient(name="cliente-dark-sky")
public interface PrediccionOnLineService {

	@GetMapping("/prediccion/{latitud}/{longitud}")
	PrediccionResponse obtenerPrediccionPorUbicacion(@PathVariable BigDecimal latitud, @PathVariable BigDecimal longitud);
	
}
