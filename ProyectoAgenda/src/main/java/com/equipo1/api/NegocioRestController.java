package com.equipo1.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.equipo1.models.Cliente;
import com.equipo1.services.ClienteService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class NegocioRestController {
    @Autowired
    ;
    
    @RequestMapping("/obetener/cliente")
    public List<Cliente> obtenerListaCliente(){
        List<Cliente> listadoCliente = clienteService.findAll();
        return listadoCliente;
    }

    @PostMapping
}
