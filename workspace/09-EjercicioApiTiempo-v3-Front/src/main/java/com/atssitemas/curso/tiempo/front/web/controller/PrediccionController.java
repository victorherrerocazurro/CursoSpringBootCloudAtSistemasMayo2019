package com.atssitemas.curso.tiempo.front.web.controller;

import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atssitemas.curso.tiempo.front.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.front.dto.UbicacionRequest;
import com.atssitemas.curso.tiempo.front.dto.UbicacionRequestValidator;
import com.atssitemas.curso.tiempo.front.service.PrediccionOnLineService;
import com.atssitemas.curso.tiempo.front.service.PrediccionService;

@Controller
@RequestMapping("/Predicciones")
public class PrediccionController {

	@Autowired
	private PrediccionService prediccionService;
	
	@Autowired
	private PrediccionOnLineService prediccionOnLineService;

	@InitBinder
	protected void initBinder(final WebDataBinder binder) {
		binder.addValidators(new UbicacionRequestValidator());
	}

	@GetMapping("/Consulta/Ubicacion")
	public String generarformularioconsultaPrediccionPorUbicacion(Map<String, Object> model) {

		UbicacionRequest ubicacion = new UbicacionRequest();

		model.put("ubicacion", ubicacion);

		return "Predicciones/formulario_ubicacion";
	}

	@PostMapping("/Consulta/Ubicacion")
	public String consultarPrediccionPorUbicacion(Map<String, Object> model,
			@Valid @ModelAttribute(name = "ubicacion") UbicacionRequest ubicacion, Errors errors) {

		if (errors.hasErrors()) {
			return "Predicciones/formulario_ubicacion";
		} else {
			PrediccionResponse prediccionPorUbicacion = prediccionOnLineService
					.obtenerPrediccionPorUbicacion(ubicacion.getLatitud(), ubicacion.getLongitud());

			model.put("prediccion", prediccionPorUbicacion);

			return "Predicciones/detalle";
		}
	}

	@GetMapping("/Consulta")
	public String consultarPredicciones(Map<String, Object> model) {

		Collection<PrediccionResponse> predicciones = prediccionService.obtenerPredicciones();

		model.put("predicciones", predicciones);

		return "Predicciones/listado";
	}

}
