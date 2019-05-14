package com.atssitemas.curso.tiempo.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atssitemas.curso.tiempo.bussiness.ClienteDarkSky;
import com.atssitemas.curso.tiempo.bussiness.PrediccionFactory;
import com.atssitemas.curso.tiempo.dto.PrediccionDarkSkyResponse;
import com.atssitemas.curso.tiempo.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.dto.UbicacionRequest;
import com.atssitemas.curso.tiempo.entities.Prediccion;
import com.atssitemas.curso.tiempo.repository.PrediccionRepository;

@Service
public class SimpleTiempoService implements TiempoService{

	@Autowired
	private PrediccionRepository prediccionRepository;
	
	@Autowired 
	private ClienteDarkSky clienteDarkApi;
	
	@Autowired
	private PrediccionFactory prediccionFactory;
	
	@Override
	public PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest) {
		
		PrediccionDarkSkyResponse prediccionDarkSkyResponse = clienteDarkApi.obtenerPrediccion(ubicacionRequest);
		
		PrediccionResponse prediccionResponse = prediccionFactory.getInstanceFromPrediccionDarkSkyResponse(prediccionDarkSkyResponse);
		
		Prediccion prediccion = prediccionFactory.getInstanceFromPrediccionResponse(prediccionResponse);
		
		prediccionRepository.save(prediccion);
		
		return prediccionResponse;
	}

	@Override
	public Collection<PrediccionResponse> obtenerPredicciones() {
		List<Prediccion> predicciones = prediccionRepository.findAll();
		return predicciones
				.parallelStream()
					.map(p -> prediccionFactory.getInstanceFromPrediccion(p))
					.collect(Collectors.toList());
	}

}
