package com.equipo1.repositories;

import com.equipo1.models.ServicioAgendado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioAgendadoRepository extends JpaRepository<ServicioAgendado, Long> {

}
