package com.atssitemas.curso.tiempo.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atssitemas.curso.tiempo.entities.Prediccion;
import com.atssitemas.curso.tiempo.service.PrediccionService;

@RestController
@RequestMapping("/prediccion")
public class PrediccionRestController {
	
	@Autowired
	private PrediccionService prediccionService;
	
	@GetMapping
	public ResponseEntity<Collection<Prediccion>> obtenerPredicciones() {

		Collection<Prediccion> resultado = prediccionService.obtenerPredicciones();

		return new ResponseEntity<Collection<Prediccion>>(resultado, HttpStatus.OK);
	}
}
