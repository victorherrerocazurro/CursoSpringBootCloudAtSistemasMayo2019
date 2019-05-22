package com.atssitemas.curso.simpsons.dto;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Personaje {

	private String nombre; //PK
	private String apellido;
	private int edad;
	
	//Relaciones
	@JsonIgnore
	private String padre;
	//private String madre;
	//private Collection<String> hijos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPadre() {
		return padre;
	}
	public void setPadre(String padre) {
		this.padre = padre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Personaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personaje(String nombre, String apellido, String padre, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.padre = padre;
		this.edad = edad;
	}	
}
