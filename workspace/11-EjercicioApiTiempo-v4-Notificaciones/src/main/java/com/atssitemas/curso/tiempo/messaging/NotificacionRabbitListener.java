
package com.atssitemas.curso.tiempo.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atssitemas.curso.tiempo.dto.NotificacionRequest;
import com.atssitemas.curso.tiempo.service.NotificacionService;

@Component
public class NotificacionRabbitListener {

	@Autowired
	private NotificacionService notificacionService;
	
	@RabbitListener(queues = {"ejercicio-prediccion-notificacion-queue"})
	public void proceseNotificacion(String notificacion) {
		System.out.println("Procesando: " + notificacion);
		notificacionService.guardar(new NotificacionRequest(notificacion));
	}
	
}
