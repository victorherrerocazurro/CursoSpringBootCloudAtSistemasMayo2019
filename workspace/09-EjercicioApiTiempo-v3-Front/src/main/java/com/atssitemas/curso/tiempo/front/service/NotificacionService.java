package com.atssitemas.curso.tiempo.front.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.atssitemas.curso.tiempo.front.dto.NotificacionResponse;

@FeignClient(name="notificaciones")
public interface NotificacionService {

	@GetMapping("/Notificaciones")
	List<NotificacionResponse> consultaNotificacionesNoLeidas();
	
}
