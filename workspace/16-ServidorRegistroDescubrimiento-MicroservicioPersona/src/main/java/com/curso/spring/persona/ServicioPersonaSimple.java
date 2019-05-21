package com.curso.spring.persona;

import org.springframework.stereotype.Service;

@Service
public class ServicioPersonaSimple implements ServicioPersona {

	@Override
	public PersonaDto obtenerPersona() {
		return new PersonaDto(1, "Victor");
	}

}
