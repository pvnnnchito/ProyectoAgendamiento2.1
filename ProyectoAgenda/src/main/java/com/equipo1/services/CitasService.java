package com.equipo1.services;

import com.equipo1.models.Citas;
import com.equipo1.repositories.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitasService {
    @Autowired
    CitasRepository citasRepository;

    public List<Citas> findAll() {
        return citasRepository.findAll();
    }
}
