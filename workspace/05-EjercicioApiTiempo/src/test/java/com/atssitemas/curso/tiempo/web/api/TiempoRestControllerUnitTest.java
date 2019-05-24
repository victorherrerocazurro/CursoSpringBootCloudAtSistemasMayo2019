package com.atssitemas.curso.tiempo.web.api;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import com.atssitemas.curso.tiempo.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.dto.UbicacionRequest;
import com.atssitemas.curso.tiempo.service.SimpleTiempoService;
import com.atssitemas.curso.tiempo.service.TiempoService;
import com.atssitemas.curso.tiempo.web.api.TiempoRestController;

public class TiempoRestControllerUnitTest {

	@Test
	public void test() {
		
		TiempoRestController sut = new TiempoRestController();
		sut.tiempoService = new TiempoService() {
			
			@Override
			public Collection<PrediccionResponse> obtenerPredicciones() {
				// TODO Auto-generated method stub
				return new ArrayList<>();
			}
			
			@Override
			public PrediccionResponse obtenerPrediccionPorUbicacion(UbicacionRequest ubicacionRequest) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		int expected = 0;
		
		ResponseEntity<Collection<PrediccionResponse>> prediccionesRE = sut.obtenerPredicciones();
		
		assertNotNull(prediccionesRE.getBody());
		assertEquals(expected, prediccionesRE.getBody().size());
		
	}

}
