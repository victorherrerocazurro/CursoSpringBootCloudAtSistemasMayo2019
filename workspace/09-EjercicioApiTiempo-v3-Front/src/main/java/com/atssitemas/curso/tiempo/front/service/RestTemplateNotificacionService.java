package com.atssitemas.curso.tiempo.front.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atssitemas.curso.tiempo.front.dto.NotificacionResponse;

@Service
public class RestTemplateNotificacionService implements NotificacionService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${servicio.predicciones.url:localhost:8080}")
	private String urlServicioNotificaciones;
	
	@Override
	public List<NotificacionResponse> consultaNotificacionesNoLeidas() {

		String url = "http://" + urlServicioNotificaciones + "/Notificaciones";
		
		List<NotificacionResponse> notificaciones = restTemplate.getForObject(url, List.class);
		
		return notificaciones;
	}

}
