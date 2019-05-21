package com.atssitemas.curso.simpsons.service;

import java.util.Collection;

import com.atssitemas.curso.simpsons.dto.Personaje;

public interface PersonajeService {

	//Retornamos void porque no se autogenera nada en la base de datos
	void alta(Personaje personaje);
	
	//Retornamos int para tener conciencia de a cuantos registros a afectado la operacion
	int borrar(String nombre);
	
	//Actualizacion del objeto completo
	int actualizar(Personaje personaje);
	
	Personaje consultaPorNombre(String nombre);
	
	Collection<Personaje> consultaTodos();
	
	Collection<Personaje> consultaPorApellido(String apellido);
	
	Personaje consultaPadrePorNombre(String nombre);
	
	Collection<Personaje> consultaHijosPorNombre(String nombre);
	
}
