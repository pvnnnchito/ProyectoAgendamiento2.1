package com.equipo1.services;

import com.equipo1.models.Disponibilidad;
import com.equipo1.repositories.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisponibilidadService {

    @Autowired
    DisponibilidadRepository disponibilidadRepository;


    public void saveDisponibilidad(Disponibilidad disponibilidad) {
        disponibilidadRepository.save(disponibilidad);
    }

    public List<Disponibilidad> findAll() {
       return disponibilidadRepository.findAll();
    }

    public Disponibilidad buscarId(Long id) {
        return disponibilidadRepository.findById(id).get();
    }

    public void eliminarDisponibilidad(Long id) {
        disponibilidadRepository.deleteById(id);
    }
}
