package com.equipo1.services;

import com.equipo1.models.ServicioAgendado;
import com.equipo1.repositories.ServicioAgendadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class ServicioAgendadoService {
    @Autowired
    ServicioAgendadoRepository servicioAgendadoRepository;


    public ServicioAgendado buscarId(Long id) {
        return servicioAgendadoRepository.findById(id).get();
    }

    public void guardarAgendado(@Valid ServicioAgendado servicioAgendado) {
        servicioAgendadoRepository.save(servicioAgendado);
    }

    public List<ServicioAgendado> findAll() {
        return servicioAgendadoRepository.findAll();
    }

    public void eliminarPorId(Long id) {
        servicioAgendadoRepository.deleteById(id);
    }
}
