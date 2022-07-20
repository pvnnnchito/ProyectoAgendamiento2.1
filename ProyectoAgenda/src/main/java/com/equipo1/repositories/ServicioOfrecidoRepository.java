package com.equipo1.repositories;

import com.equipo1.models.ServicioOfrecido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioOfrecidoRepository extends JpaRepository<ServicioOfrecido, Long> {
}
