package com.atssitemas.curso.tiempo.service;

import java.util.List;

import com.atssitemas.curso.tiempo.dto.NotificacionRequest;

public interface NotificacionService {

	void guardar(NotificacionRequest notificiacionRequest);
	
	List<NotificacionRequest> consultarNotificacionNoLeidas();
	
}
