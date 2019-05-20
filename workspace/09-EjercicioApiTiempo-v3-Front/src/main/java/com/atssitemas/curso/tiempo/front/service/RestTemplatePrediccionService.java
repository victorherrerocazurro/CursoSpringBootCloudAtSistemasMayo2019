package com.atssitemas.curso.tiempo.front.service;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atssitemas.curso.tiempo.front.dto.PrediccionResponse;

@Service
public class RestTemplatePrediccionService implements PrediccionService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${servicio.predicciones.url:localhost:8080}")
	private String urlServicioPredicciones;
	
	@Value("${servicio.persistencia.url:localhost:8280}")
	private String urlServicioPersistencia;

	@Override
	public PrediccionResponse obtenerPrediccionPorUbicacion(BigDecimal latitud, BigDecimal longitud) {
		
		String url = "http://" + urlServicioPredicciones + "/prediccion/{latitud}/{longitud}";
		PrediccionResponse prediccionResponse = restTemplate.getForObject(url, PrediccionResponse.class, latitud, longitud);
		
		return prediccionResponse;
	}

	@Override
	public Collection<PrediccionResponse> obtenerPredicciones() {
		
		URI url;
		try {
			url = new URI("http://" + urlServicioPersistencia + "/prediccion");
			Collection<PrediccionResponse> predicciones = restTemplate.getForObject(url, Collection.class);
			
			return predicciones;
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}
