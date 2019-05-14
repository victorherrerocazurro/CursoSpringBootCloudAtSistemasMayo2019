package com.atssitemas.curso.tiempo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.atssitemas.curso.tiempo.entities.Prediccion;

public interface PrediccionRepository extends MongoRepository<Prediccion, Long>{

}
