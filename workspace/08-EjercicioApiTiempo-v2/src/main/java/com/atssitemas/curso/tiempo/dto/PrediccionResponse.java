package com.atssitemas.curso.tiempo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrediccionResponse implements Serializable {

	private String icono;
	private String descripcion;
	private BigDecimal temperatura;
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(BigDecimal temperatura) {
		this.temperatura = temperatura;
	}
	public PrediccionResponse(String icono, String descripcion, BigDecimal temperatura) {
		super();
		this.icono = icono;
		this.descripcion = descripcion;
		this.temperatura = temperatura;
	}
	public PrediccionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((icono == null) ? 0 : icono.hashCode());
		result = prime * result + ((temperatura == null) ? 0 : temperatura.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrediccionResponse other = (PrediccionResponse) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (icono == null) {
			if (other.icono != null)
				return false;
		} else if (!icono.equals(other.icono))
			return false;
		if (temperatura == null) {
			if (other.temperatura != null)
				return false;
		} else if (!temperatura.equals(other.temperatura))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PrediccionResponse [icono=" + icono + ", descripcion=" + descripcion + ", temperatura=" + temperatura
				+ "]";
	}
}
