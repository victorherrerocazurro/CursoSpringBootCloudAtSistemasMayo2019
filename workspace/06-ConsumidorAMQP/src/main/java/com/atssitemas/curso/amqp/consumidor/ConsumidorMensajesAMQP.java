package com.atssitemas.curso.amqp.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumidorMensajesAMQP {

	@RabbitListener(queues = {"spring-boot"})
	public void proceseMensaje(String nombre) {
		System.out.println("Procesando: " + nombre);
	}
	
}
