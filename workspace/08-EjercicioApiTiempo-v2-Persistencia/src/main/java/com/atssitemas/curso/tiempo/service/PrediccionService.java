package com.atssitemas.curso.tiempo.service;

import java.util.Collection;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atssitemas.curso.tiempo.entities.Prediccion;
import com.atssitemas.curso.tiempo.repository.PrediccionRepository;

@Service
public class PrediccionService {
	
	private long id = 1;
	
	@Autowired
	private PrediccionRepository prediccionRepository;
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public Collection<Prediccion> obtenerPredicciones() {
		return prediccionRepository.findAll();
	}
	
	public void salvarPrediccion(Prediccion prediccion) {
		
		prediccion.setId(id++);
		
		prediccionRepository.save(prediccion);
		
		rabbitTemplate.convertAndSend("ejercicio-prediccion-notificacion-exchange", "notificacion.nueva", "Se ha guardado correctamente la prediccion");
	}
}
