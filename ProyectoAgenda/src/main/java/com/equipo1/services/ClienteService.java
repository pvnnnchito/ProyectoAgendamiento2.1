package com.equipo1.services;

import com.equipo1.models.Cliente;
import com.equipo1.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public void guardarCliente(@Valid Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente buscarId(Long id) {
        return clienteRepository.findById(id).get();
    }

    public void eliminarById(Long id) {
        clienteRepository.deleteById(id);
    }
}
