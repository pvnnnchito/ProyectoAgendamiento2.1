package com.equipo1.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.equipo1.models.Empleado;
import com.equipo1.services.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class EmpleadoRestController {
    @Autowired
    EmpleadoService empleadoService;

    @RequestMapping("/obtener")
    public List<Empleado> obtenerListaEmpleado(){
        List<Empleado> listaEmpleados = empleadoService.findAll();
        return listaEmpleados;
    }

    //
    @PostMapping(value = "/guardar")
    public ResponseBody<Empleado> guardarEmpleado(@RequestBody Empleado empleado){
        empleadoService.guardarEmpleado(empleado);
        return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);

    }

    @PostMapping(value ="/eliminar/{id}")
    public ResponseEntity<Empleado>
    

    
}
