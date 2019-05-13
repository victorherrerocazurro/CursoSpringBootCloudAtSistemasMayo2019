package com.atsistemas.curso.datajpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAS")
public class Persona {

	@Id
	@Column(name = "identificador")
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
