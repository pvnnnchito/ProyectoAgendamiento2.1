package com.equipo1.api;

import com.equipo1.models.Cliente;
import com.equipo1.models.Empleado;
import com.equipo1.models.Servicio;
import com.equipo1.services.ClienteService;
import com.equipo1.services.EmpleadoService;
import com.equipo1.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ClienteApiRestController {
    @Autowired
    ClienteService clienteService;

    @RequestMapping("/obtener")
    public List<Cliente> obtenerListaCliente(){
        List<Cliente> listadoCliente = clienteService.findAll();
        return listadoCliente;

    }

    @PostMapping(value = "/guardar")
    public ResponseEntity<Cliente> registrarCliente(@RequestBody Cliente cliente){
        clienteService.guardarCliente(cliente);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PostMapping(value = "/eliminar/{id}")
    public ResponseEntity<Cliente> eliminarCliente(@PathVariable Long id){
        try{
            clienteService.eliminarById(id);
            return new ResponseEntity<Cliente>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
