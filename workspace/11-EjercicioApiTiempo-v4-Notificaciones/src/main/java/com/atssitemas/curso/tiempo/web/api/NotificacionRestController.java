package com.atssitemas.curso.tiempo.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atssitemas.curso.tiempo.dto.NotificacionRequest;
import com.atssitemas.curso.tiempo.service.NotificacionService;

@RestController
public class NotificacionRestController {
	
	@Autowired
	private NotificacionService notificacionService;

	@GetMapping("/Notificaciones")
	public ResponseEntity<List<NotificacionRequest>> consultaNotificacionesNoLeidas(){
		return new ResponseEntity<List<NotificacionRequest>>(
				notificacionService.consultarNotificacionNoLeidas(),HttpStatus.OK);
	}
	
}
