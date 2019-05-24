package com.atssitemas.curso.tiempo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.atssitemas.curso.tiempo.service.TiempoService;
import com.atssitemas.curso.tiempo.web.api.TiempoRestController;

@RunWith(SpringRunner.class)
//@SpringBootTest
//@ContextConfiguration(classes = TiempoRestController.class)
//Crea el contexto de Spring para los Beans necesarios en la capa web, en cierto modo equivalente a @EnableWebMvc
@WebMvcTest
@AutoConfigureMockMvc
public class TiempoApiTest {

	@MockBean
	private TiempoService tiempoService;
	
	@Autowired
	private MockMvc mvc;
	
	//Configurar el Mock
	@Before
	public void init() {
		when(tiempoService.obtenerPredicciones()).thenReturn(new ArrayList<>());
	}
	
	@Test
	public void test() throws Exception {
		this.mvc.perform(get("/prediccion"))
				.andExpect(status().isOk())
				.andExpect(content().string("[]"));
	}

}
