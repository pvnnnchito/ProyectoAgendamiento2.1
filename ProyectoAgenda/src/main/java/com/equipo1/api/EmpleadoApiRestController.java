package com.equipo1.api;

import com.equipo1.models.Empleado;
import com.equipo1.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class EmpleadoApiRestController {

    @Autowired
    EmpleadoService empleadoService;

    @RequestMapping("/obtener")
    public List<Empleado> obtenerListaEmpleado(){
        List<Empleado> listadoEmpleado = empleadoService.findAll();
        return listadoEmpleado;
    }

    @PostMapping(value="/guardar")
    public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado){
        empleadoService.registroEmpleado(empleado);
        return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
    }

    @PostMapping(value="/eliminar/{id}")
    public ResponseEntity<Empleado> eliminarEmpleado (@PathVariable Long id){
        try{
            empleadoService.eliminarId(id);
            return new ResponseEntity<Empleado>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Empleado>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
