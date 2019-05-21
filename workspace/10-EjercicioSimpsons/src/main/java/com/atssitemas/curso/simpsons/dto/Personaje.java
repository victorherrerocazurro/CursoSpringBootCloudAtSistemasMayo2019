package com.atssitemas.curso.simpsons.dto;

import java.util.Collection;

public class Personaje {

	private String nombre; //PK
	private String apellido;
	private String padre;
	//private String madre;
	//private Collection<String> hijos;
	private int edad;
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
