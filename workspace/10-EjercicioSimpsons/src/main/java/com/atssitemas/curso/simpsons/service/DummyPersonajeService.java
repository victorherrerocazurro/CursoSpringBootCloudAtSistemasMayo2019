package com.atssitemas.curso.simpsons.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Service;

import com.atssitemas.curso.simpsons.dto.Personaje;

@Service
public class DummyPersonajeService implements PersonajeService {

	@Override
	public void alta(Personaje personaje) {
	
	}

	@Override
	public int borrar(String nombre) {
		return 1;
	}

	@Override
	public int actualizar(Personaje personaje) {
		return 1;
	}

	@Override
	public Personaje consultaPorNombre(String nombre) {
		return new Personaje("Bart", "Simpson", "Hommer", 9);
	}

	@Override
	public Collection<Personaje> consultaTodos() {
		Personaje[] personajes = new Personaje[] {new Personaje("Bart", "Simpson", "Hommer", 9),new Personaje("Hommer", "Simpson", "Abraham", 40)}; 
		
		return Arrays.asList(personajes);
	}

	@Override
	public Collection<Personaje> consultaPorApellido(String apellido) {
		Personaje[] personajes = new Personaje[] {new Personaje("Bart", "Simpson", "Hommer", 9),new Personaje("Hommer", "Simpson", "Abraham", 40)}; 
		
		return Arrays.asList(personajes);
	}

	@Override
	public Personaje consultaPadrePorNombre(String nombre) {
		return new Personaje("Hommer", "Simpson", "Abraham", 40);
	}

	@Override
	public Collection<Personaje> consultaHijosPorNombre(String nombre) {
		Personaje[] personajes = new Personaje[] {new Personaje("Bart", "Simpson", "Hommer", 9)}; 
		
		return Arrays.asList(personajes);
	}

}
