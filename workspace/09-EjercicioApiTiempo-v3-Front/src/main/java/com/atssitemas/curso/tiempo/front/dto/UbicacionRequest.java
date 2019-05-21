package com.atssitemas.curso.tiempo.front.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class UbicacionRequest implements Serializable{

	@Min(-90)
	@Max(90)
	private BigDecimal latitud;
	@Min(-180)
	@Max(180)
	private BigDecimal longitud;
	public BigDecimal getLatitud() {
		return latitud;
	}
	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}
	public BigDecimal getLongitud() {
		return longitud;
	}
	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}
	public UbicacionRequest(BigDecimal latitud, BigDecimal longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public UbicacionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PrediccionRequest [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
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
		UbicacionRequest other = (UbicacionRequest) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}
}
