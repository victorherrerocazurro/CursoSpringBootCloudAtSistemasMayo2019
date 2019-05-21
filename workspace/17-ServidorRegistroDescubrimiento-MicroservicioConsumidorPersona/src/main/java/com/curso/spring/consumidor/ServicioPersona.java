package com.curso.spring.consumidor;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="persona")
public interface ServicioPersona {

	@GetMapping("/")
	PersonaDto obtenerPersona();

}
