package com.equipo1.api;

import com.equipo1.models.Disponibilidad;
import com.equipo1.models.Negocio;
import com.equipo1.services.DisponibilidadService;
import com.equipo1.services.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disponibilidad")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class DisponibilidadApiRestController {
    @Autowired
    DisponibilidadService disponibilidadService;

    @RequestMapping("/obtener")
    public List<Disponibilidad> obtenerListaDisponibilidad(){
        List<Disponibilidad> listaDisponibilidad = disponibilidadService.findAll();
        return  listaDisponibilidad;
    }

    @PostMapping(value = "/guardar")
    public ResponseEntity<Disponibilidad> guardarDisponibilidad(@RequestBody Disponibilidad disponibilidad){
        disponibilidadService.saveDisponibilidad(disponibilidad);
        return new ResponseEntity<Disponibilidad>(disponibilidad, HttpStatus.OK);
    }

    @PostMapping(value = "/eliminar/{id}")
    public ResponseEntity<Disponibilidad> eliminarDisponibilidad(@PathVariable Long id){
        try {
            disponibilidadService.eliminarDisponibilidad(id);
            return new ResponseEntity<Disponibilidad>(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<Disponibilidad>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
