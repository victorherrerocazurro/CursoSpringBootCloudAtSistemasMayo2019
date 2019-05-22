package com.atssitemas.curso.tiempo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atssitemas.curso.tiempo.bussiness.NotificacionFactory;
import com.atssitemas.curso.tiempo.dto.NotificacionRequest;
import com.atssitemas.curso.tiempo.entities.Notificacion;
import com.atssitemas.curso.tiempo.repositories.NotificacionRepository;

@Service
public class SimpleNotificacionService implements NotificacionService {

	@Autowired
	private NotificacionRepository notificacionRepository;
	
	@Autowired
	private NotificacionFactory notificacionFactory;
	
	@Override
	public void guardar(NotificacionRequest notificacionRequest) {
		notificacionRepository.save(notificacionFactory.getInstanceFromNotificacionRequest(notificacionRequest));
	}

	@Override
	public List<NotificacionRequest> consultarNotificacionNoLeidas() {
		List<Notificacion> resultado = notificacionRepository.findByLeido(false);
		return resultado
				.parallelStream()
				.map(n -> notificacionFactory.getInstanceFromNotificacion(n))
				.collect(Collectors.toList());
	}

}
