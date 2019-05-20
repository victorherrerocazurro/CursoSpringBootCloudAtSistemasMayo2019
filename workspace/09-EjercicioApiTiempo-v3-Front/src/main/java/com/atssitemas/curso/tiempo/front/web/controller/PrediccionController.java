package com.atssitemas.curso.tiempo.front.web.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atssitemas.curso.tiempo.front.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.front.dto.UbicacionRequest;
import com.atssitemas.curso.tiempo.front.service.PrediccionService;

@Controller
@RequestMapping("/Predicciones")
public class PrediccionController {

	@Autowired
	private PrediccionService prediccionService;
	
	@GetMapping("/Consulta/Ubicacion")
	public String generarformularioconsultaPrediccionPorUbicacion(Map<String, Object> model) {
		
		UbicacionRequest ubicacion = new UbicacionRequest();
		
		model.put("ubicacion", ubicacion);
		
		return "Predicciones/formulario_ubicacion";
	}
	
	@PostMapping("/Consulta/Ubicacion")
	public String consultarPrediccionPorUbicacion(Map<String, Object> model, 
									@ModelAttribute(name = "ubicacion") UbicacionRequest ubicacion) {
		
		PrediccionResponse prediccionPorUbicacion = prediccionService.obtenerPrediccionPorUbicacion(
																ubicacion.getLatitud(), ubicacion.getLongitud());
		
		model.put("prediccion", prediccionPorUbicacion);
		
		return "Predicciones/formulario_ubicacion";
	}

	@GetMapping("/Consulta")
	public String consultarPredicciones(Map<String, Object> model){
		
		Collection<PrediccionResponse> predicciones = prediccionService.obtenerPredicciones();
		
		model.put("predicciones", predicciones);
		
		return "Predicciones/listado";
	}
	
}
