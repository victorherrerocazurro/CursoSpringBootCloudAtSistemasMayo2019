package com.atssitemas.curso.simpsons.web.api;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atssitemas.curso.simpsons.dto.Personaje;
import com.atssitemas.curso.simpsons.dto.RecursosAfectadosOperationResponse;
import com.atssitemas.curso.simpsons.service.PersonajeService;

@RestController
@RequestMapping("/hateoas/Personaje")
public class PersonajeHateoasRestController {

	@Autowired
	private PersonajeService personajeService;
	
	@PutMapping
	public ResponseEntity<RecursosAfectadosOperationResponse> alta(@RequestBody Personaje personaje) {
		//TODO, seria mejor crear un capa de adaptacion al servicio
		int numeroDeRecursosAfectados = personajeService.actualizar(personaje);
		
		if(numeroDeRecursosAfectados > 0) {
			return new ResponseEntity<RecursosAfectadosOperationResponse>(
					new RecursosAfectadosOperationResponse(numeroDeRecursosAfectados), HttpStatus.OK);
		}
		
		personajeService.alta(personaje);
		
		return new ResponseEntity<RecursosAfectadosOperationResponse>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{nombre}")
	public ResponseEntity<RecursosAfectadosOperationResponse> borrar(@PathVariable String nombre) {
		int numeroDeRecursosAfectados = personajeService.borrar(nombre);
		return new ResponseEntity<RecursosAfectadosOperationResponse>(new RecursosAfectadosOperationResponse(numeroDeRecursosAfectados), HttpStatus.OK);
	}
	
	@GetMapping(path="/{nombre}", produces = "application/hal+json")
	public ResponseEntity<Resource<Personaje>> consultaPorNombre(@PathVariable String nombre) {
		
		Personaje personaje = personajeService.consultaPorNombre(nombre);
		
		Resource<Personaje> personajeHateoas = new Resource<>(
			personaje,
			linkTo(methodOn(PersonajeHateoasRestController.class).consultaPorNombre(nombre)).withSelfRel(),
			linkTo(methodOn(PersonajeHateoasRestController.class).consultaPorNombre(personaje.getPadre())).withRel("padre"),
			linkTo(methodOn(PersonajeHateoasRestController.class).consultaPadrePorNombre(nombre)).withRel("padre"));
		
		return new ResponseEntity<Resource<Personaje>>(personajeHateoas, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<Collection<Personaje>> consultaTodos() {
		
		Collection<Personaje> personajes = personajeService.consultaTodos();
		
		return new ResponseEntity<Collection<Personaje>>(personajes, HttpStatus.OK);
	}
	
	@GetMapping(params = "apellido")
	public ResponseEntity<Collection<Personaje>> consultaPorApellido(@RequestParam String apellido) {
		
		Collection<Personaje> personajes = personajeService.consultaPorApellido(apellido);
		
		return new ResponseEntity<Collection<Personaje>>(personajes, HttpStatus.OK);
	}
	
	@GetMapping("/{nombre}/padre")
	public ResponseEntity<Personaje> consultaPadrePorNombre(@PathVariable String nombre) {
		Personaje personaje = personajeService.consultaPadrePorNombre(nombre);
		
		return new ResponseEntity<Personaje>(personaje, HttpStatus.OK);
	}
	
}
