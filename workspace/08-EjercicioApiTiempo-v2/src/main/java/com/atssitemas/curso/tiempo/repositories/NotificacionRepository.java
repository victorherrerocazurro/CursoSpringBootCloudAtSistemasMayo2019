package com.atssitemas.curso.tiempo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atssitemas.curso.tiempo.entities.Notificacion;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {

	@Query("select n from Notificacion n where n.leido = :leido")
	List<Notificacion> findByLeido(@Param("leido") boolean leido);

}
