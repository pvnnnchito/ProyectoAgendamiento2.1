package com.equipo1.repositories;

import com.equipo1.models.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisponibilidadRepository extends JpaRepository<Disponibilidad, Long> {

}
