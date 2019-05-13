package com.atsistemas.curso.datamongo;

import org.springframework.data.annotation.Id;

public class Persona {

	@Id
	private Long id;
	
	private String nombre;

	public Persona(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
