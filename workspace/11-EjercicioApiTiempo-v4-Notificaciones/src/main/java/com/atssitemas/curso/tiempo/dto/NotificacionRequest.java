package com.atssitemas.curso.tiempo.dto;

public class NotificacionRequest {

	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public NotificacionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotificacionRequest(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "NotificacionRequest [mensaje=" + mensaje + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
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
		NotificacionRequest other = (NotificacionRequest) obj;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		return true;
	}
}
