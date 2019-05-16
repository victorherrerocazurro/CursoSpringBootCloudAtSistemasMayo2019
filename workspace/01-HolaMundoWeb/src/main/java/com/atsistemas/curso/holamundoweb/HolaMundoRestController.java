package com.atsistemas.curso.holamundoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoRestController {

	@GetMapping("/")
	public String holaMundo() {
		return "Hola Mundo!!!";
	}
	
}
