package com.atssitemas.curso.tiempo.web.api;

import java.math.BigDecimal;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atssitemas.curso.tiempo.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.dto.UbicacionRequest;
import com.atssitemas.curso.tiempo.service.TiempoService;

@RestController
@RequestMapping("/prediccion")
public class TiempoRestController {
	
	@Autowired
	TiempoService tiempoService;

	//@RequestParam
	//?latitud=&longitud=
	@GetMapping("/{latitud}/{longitud}")
	public ResponseEntity<PrediccionResponse> obtenerPrediccionPorUbicacion(
			@PathVariable BigDecimal latitud, @PathVariable BigDecimal longitud) {
		
		UbicacionRequest ubicacionRequest = new UbicacionRequest(latitud, longitud);
		
		PrediccionResponse resultado = tiempoService.obtenerPrediccionPorUbicacion(ubicacionRequest);
		
		return new ResponseEntity<PrediccionResponse>(resultado, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<Collection<PrediccionResponse>> obtenerPredicciones(){
		
		Collection<PrediccionResponse> resultado = tiempoService.obtenerPredicciones();
		
		return new ResponseEntity<Collection<PrediccionResponse>>(resultado, HttpStatus.OK);
	}
	
}
