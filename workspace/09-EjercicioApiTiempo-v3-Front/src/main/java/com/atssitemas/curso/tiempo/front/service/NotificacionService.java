package com.atssitemas.curso.tiempo.front.service;

import java.util.List;

import com.atssitemas.curso.tiempo.front.dto.NotificacionResponse;

public interface NotificacionService {

	List<NotificacionResponse> consultaNotificacionesNoLeidas();
	
}
