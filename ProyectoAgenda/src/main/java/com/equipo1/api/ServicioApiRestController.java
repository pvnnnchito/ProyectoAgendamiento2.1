package com.equipo1.api;

import com.equipo1.models.Servicio;
import com.equipo1.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicio")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ServicioApiRestController {

    @Autowired
    ServicioService servicioService;

    @RequestMapping("/obtener")
    public List<Servicio> obtenerListaServicio(){
        List<Servicio> listadoServicio = servicioService.findAll();
        return listadoServicio;

    }

    @PostMapping(value = "/guardar")
    public ResponseEntity<Servicio> registrarServicio(@RequestBody Servicio servicio){
        servicioService.saveService(servicio);
        return new ResponseEntity<Servicio>(servicio, HttpStatus.OK);
    }

    @PostMapping(value = "/eliminar/{id}")
    public ResponseEntity<Servicio> eliminarServicio(@PathVariable Long id){
        try {
            servicioService.eliminarServicio(id);
            return new ResponseEntity<Servicio>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Servicio>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
