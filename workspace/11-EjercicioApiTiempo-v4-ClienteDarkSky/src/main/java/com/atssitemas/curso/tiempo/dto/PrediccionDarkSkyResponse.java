package com.atssitemas.curso.tiempo.dto;

import java.math.BigDecimal;

public class PrediccionDarkSkyResponse {

	private Currently currently;

	public Currently getCurrently() {
		return currently;
	}

	public void setCurrently(Currently currently) {
		this.currently = currently;
	}
	
	public String getIcon() {
		return this.currently.getIcon();
	}
	public String getSummary() {
		return this.currently.getSummary();
	}
	public BigDecimal getTemperature() {
		return this.currently.getTemperature();
	}

	public PrediccionDarkSkyResponse(Currently currently) {
		super();
		this.currently = currently;
	}

	public PrediccionDarkSkyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PrediccionDarkSkyResponse [currently=" + currently + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currently == null) ? 0 : currently.hashCode());
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
		PrediccionDarkSkyResponse other = (PrediccionDarkSkyResponse) obj;
		if (currently == null) {
			if (other.currently != null)
				return false;
		} else if (!currently.equals(other.currently))
			return false;
		return true;
	}
}

class Currently {
	private String icon;
	private String summary;
	private BigDecimal temperature;
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public BigDecimal getTemperature() {
		return temperature;
	}
	public void setTemperature(BigDecimal temperature) {
		this.temperature = temperature;
	}
	public Currently(String icon, String summary, BigDecimal temperature) {
		super();
		this.icon = icon;
		this.summary = summary;
		this.temperature = temperature;
	}
	public Currently() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Currently [icon=" + icon + ", summary=" + summary + ", temperature=" + temperature + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((icon == null) ? 0 : icon.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
		result = prime * result + ((temperature == null) ? 0 : temperature.hashCode());
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
		Currently other = (Currently) obj;
		if (icon == null) {
			if (other.icon != null)
				return false;
		} else if (!icon.equals(other.icon))
			return false;
		if (summary == null) {
			if (other.summary != null)
				return false;
		} else if (!summary.equals(other.summary))
			return false;
		if (temperature == null) {
			if (other.temperature != null)
				return false;
		} else if (!temperature.equals(other.temperature))
			return false;
		return true;
	}
}
