package com.atssitemas.curso.amqp.productor;

import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.ContentTypeDelegatingMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private ContentTypeDelegatingMessageConverter messageConverter;
	
	// http://localhost:8080/?nombre=Victor
	@GetMapping("/")
	public String holaMundo(@RequestParam String nombre) {
		
		//TODO Invocar al servicio de mensajeria
		rabbitTemplate.convertAndSend("spring-boot-exchange", "foo.bar", nombre);
		
		MessageProperties messageProperties = null;
		rabbitTemplate.send(
				"spring-boot-exchange", 
				"foo.bar", 
				messageConverter.toMessage(nombre, messageProperties));
		
		return "Su mensaje ha sido recibido";
	}
	
}
