package com.equipo1.services;

import com.equipo1.models.ServicioAgendado;
import com.equipo1.models.ServicioOfrecido;
import com.equipo1.repositories.ServicioOfrecidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioOfrecidoService {

    @Autowired
    ServicioOfrecidoRepository servicioOfrecidoRepository;

    public ServicioOfrecido buscarId(Long id) {
        return servicioOfrecidoRepository.findById(id).get();
    }

    public List<ServicioOfrecido> findAll() {
        return servicioOfrecidoRepository.findAll();
    }
}
