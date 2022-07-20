package com.equipo1.repositories;

import com.equipo1.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado, Long>{//  extends JpaRepository<"","">  {
}
