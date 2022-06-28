package com.equipo1.services;

import com.equipo1.models.Servicio;
import com.equipo1.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {
    //inyeccion de dependencias
    @Autowired
    ServicioRepository servicioRepository;

    //guardar el servicio
    public void saveService(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    //obtenemos la lista por la función de JPA que extendemos en Repository
    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }

    public Servicio buscarId(Long id) {
        return servicioRepository.findById(id).get();
    }
}
