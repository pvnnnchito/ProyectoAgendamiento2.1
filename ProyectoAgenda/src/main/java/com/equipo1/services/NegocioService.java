package com.equipo1.services;

import com.equipo1.models.Negocio;
import com.equipo1.repositories.NegocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NegocioService {
    @Autowired
    NegocioRepository negocioRepository;

    //funcion para guardar un nuevo negocio
    public void guardarNegocio(Negocio negocio) {
        negocioRepository.save(negocio);
    }

    //funcion para desplegar una lista de los negocios guardados
    public List<Negocio> findAll() {
        return negocioRepository.findAll();
    }

    public Negocio buscarId(Long id) {
        return negocioRepository.findById(id).get();
    }

    public void eliminarNegocio(Long id) {
        negocioRepository.deleteById(id);
    }
}
