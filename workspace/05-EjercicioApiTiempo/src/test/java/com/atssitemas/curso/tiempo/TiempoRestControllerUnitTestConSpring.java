package com.atssitemas.curso.tiempo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.atssitemas.curso.tiempo.dto.PrediccionResponse;
import com.atssitemas.curso.tiempo.service.TiempoService;
import com.atssitemas.curso.tiempo.web.api.TiempoRestController;

//Anotacion que permite indicar a JUnit que interprete las anotaciones de Spring
@RunWith(SpringRunner.class)
//Construia un contexto de Spring empleando la clase anotada con @SpringBootApplication
//@SpringBootTest //Opcional, hay mas variantes
@ContextConfiguration(classes = TiempoRestController.class)
public class TiempoRestControllerUnitTestConSpring {

	@Autowired
	private TiempoRestController sut;

	@MockBean
	private TiempoService tiempoService;
	
	//Configurar el Mock
	@Before
	public void init() {
		when(tiempoService.obtenerPredicciones()).thenReturn(new ArrayList<>());
	}

	@Test
	public void comprobarQueSeRetornaUnaColleccion() {
		int expected = 0;

		ResponseEntity<Collection<PrediccionResponse>> prediccionesRE 
													= sut.obtenerPredicciones();

		assertNotNull(prediccionesRE.getBody());
		assertEquals(expected, prediccionesRE.getBody().size());
	}

}
