package com.equipo1.api;

import com.equipo1.models.Cliente;
import com.equipo1.models.Empleado;
import com.equipo1.models.Servicio;
import com.equipo1.services.ClienteService;
import com.equipo1.services.EmpleadoService;
import com.equipo1.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class ApiRestController {
    @Autowired
    ClienteService clienteService;
    @Autowired
    EmpleadoService empleadoService;
    @Autowired
    ServicioService servicioService;

    @RequestMapping("/obtener/cliente")
    public List<Cliente> obtenerListaCliente(){
        List<Cliente> listadoCliente = clienteService.findAll();
        return listadoCliente;

    }

    @RequestMapping("/obtener/empleado")
    public List<Empleado> obtenerListaEmpleado(){
        List<Empleado> listadoEmpleado = empleadoService.findAll();
        return listadoEmpleado;
    }

    @RequestMapping("/obtener/servicio")
    public List<Servicio> obtenerListaServicio(){
        List<Servicio> listadoServicio = servicioService.findAll();
        return listadoServicio;

    }

}
