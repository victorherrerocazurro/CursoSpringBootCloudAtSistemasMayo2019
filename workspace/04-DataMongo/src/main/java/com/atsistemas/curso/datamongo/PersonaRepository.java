package com.atsistemas.curso.datamongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonaRepository extends MongoRepository<Persona, Long>{

	List<Persona> findByNombre(String nombre);

	@Query("{ 'nombre' : ?0 }")
	List<Persona> buscarPorNombre(String nombre);
	
}
