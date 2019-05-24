package com.atsistemas.curso.holamundoweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class HolaMundoRestControllerUnitTest {

	@Test
	public void test() {
		//Given (Entorno, Datos de Prueba) son Ctes (Parametros, estados esperados, dependencias)
		HolaMundoRestController sut = new HolaMundoRestController();
		String expected = "Hola Mundo!!";
		//When
		String holaMundo = sut.holaMundo();
		//Then
		assertEquals(expected, holaMundo);
	}
	
	@Test
	public void otroTest() {
		//fail("Not yet implemented");
		HolaMundoRestController holaMundoRestController = new HolaMundoRestController();
		
		String holaMundo = holaMundoRestController.holaMundo();
		
		assertEquals("Hola Mundo!!!", holaMundo);
		
		
		
	}
	
	@Test//(expected = RuntimeException.class)
	public void excepcionTest() {
		throw new RuntimeException();
	}

}
