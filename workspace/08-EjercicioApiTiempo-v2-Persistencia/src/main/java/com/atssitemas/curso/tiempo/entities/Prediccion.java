package com.atssitemas.curso.tiempo.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

public class Prediccion implements Serializable{
	@Id
	private Long id;
	private String icono;
	private String descripcion;
	private BigDecimal temperatura;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Prediccion(Long id, String icono, String descripcion, BigDecimal temperatura) {
		super();
		this.id = id;
		this.icono = icono;
		this.descripcion = descripcion;
		this.temperatura = temperatura;
	}
	public Prediccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Prediccion [id=" + id + ", icono=" + icono + ", descripcion=" + descripcion + ", temperatura="
				+ temperatura + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((icono == null) ? 0 : icono.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Prediccion other = (Prediccion) obj;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (temperatura == null) {
			if (other.temperatura != null)
				return false;
		} else if (!temperatura.equals(other.temperatura))
			return false;
		return true;
	}
}
