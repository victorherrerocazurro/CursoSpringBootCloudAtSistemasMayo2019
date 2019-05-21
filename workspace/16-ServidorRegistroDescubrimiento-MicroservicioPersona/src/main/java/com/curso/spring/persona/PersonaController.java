package com.curso.spring.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Exponer la logica que define ServicioPersonaSimple via HTTP
@RestController
public class PersonaController {

	@Autowired
	private ServicioPersona servicioPersona;
	
    @GetMapping("/")
    PersonaDto getMessage() {
        return servicioPersona.obtenerPersona();
    }
}
