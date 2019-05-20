package com.atssitemas.curso.tiempo.front.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.atssitemas.curso.tiempo.front.dto.NotificacionResponse;
import com.atssitemas.curso.tiempo.front.service.NotificacionService;

@Controller
public class NotificacionController {

	@Autowired
	private NotificacionService notificacionService;
	
	@GetMapping("/Notificaciones/Consulta")
	public String consultaNotificacionesNoLeidas(Map<String, Object> model){
		
		List<NotificacionResponse> notificacionesNoLeidas = notificacionService.consultaNotificacionesNoLeidas();
		
		model.put("notificaciones", notificacionesNoLeidas);
		
		return "Notificaciones/listado";
	}
	
}
