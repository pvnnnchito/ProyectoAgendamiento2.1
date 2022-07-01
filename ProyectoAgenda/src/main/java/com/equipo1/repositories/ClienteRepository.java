package com.equipo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equipo1.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{//  extends JpaRepository<"","">  {
}
