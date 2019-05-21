package com.atssitemas.curso.simpsons.dto;

public class RecursosAfectadosOperationResponse {

	private int numeroRecursosAfectados;

	public int getNumeroRecursosAfectados() {
		return numeroRecursosAfectados;
	}

	public void setNumeroRecursosAfectados(int numeroRecursosAfectados) {
		this.numeroRecursosAfectados = numeroRecursosAfectados;
	}

	public RecursosAfectadosOperationResponse(int numeroRecursosAfectados) {
		super();
		this.numeroRecursosAfectados = numeroRecursosAfectados;
	}

	public RecursosAfectadosOperationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
