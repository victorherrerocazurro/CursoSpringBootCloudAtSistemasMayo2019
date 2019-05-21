package com.curso.spring.consumidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@Autowired
	private ServicioPersona servicioPersona;

	@RequestMapping("/")
    String getMessage() {
        
		PersonaDto personaDto = servicioPersona.obtenerPersona();
    	
    	return personaDto.getNombre() + "-" + personaDto.getId();
    }
}
