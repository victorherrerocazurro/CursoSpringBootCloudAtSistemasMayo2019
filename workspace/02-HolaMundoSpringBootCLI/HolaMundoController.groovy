package com.atsistemas.curso.holamundoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Grab(group='org.hibernate', module='hibernate-core', version='5.4.2.Final')
@RestController
class HolaMundoController {

	@GetMapping("/")
	def String holaMundo() {
		"Hola Mundo!!!"
	}
	
}
