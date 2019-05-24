package com.atsistemas.curso.holamundoweb;

public class TestGuarro {
	public static void main(String[] args) {
		HolaMundoRestController holaMundoRestController = new HolaMundoRestController();
		
		String holaMundo = holaMundoRestController.holaMundo();
		
		//System.out.println(holaMundo);
		
		if(!holaMundo.equals("Hola Mundo!!")) {
			throw new RuntimeException("HolaMundoController No funciona");
		}
	}
}
