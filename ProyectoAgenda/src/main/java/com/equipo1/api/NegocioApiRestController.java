package com.equipo1.api;

import com.equipo1.models.Cliente;
import com.equipo1.models.Negocio;
import com.equipo1.services.ClienteService;
import com.equipo1.services.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/negocio")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class NegocioApiRestController {
    @Autowired
    NegocioService negocioService;

    @RequestMapping("/obtener")
    public List<Negocio> obtenerListaNegocio(){
        List<Negocio> listaNegocio = negocioService.findAll();
        return listaNegocio;
    }

    @PostMapping(value="/guardar")
    public ResponseEntity<Negocio> registrarNegocio(@RequestBody Negocio negocio){
        negocioService.guardarNegocio(negocio);
        return new ResponseEntity<Negocio>(negocio, HttpStatus.OK);
    }

    @PostMapping(value = "/eliminar/{id}")
    public ResponseEntity<Negocio> eliminarNegocio(@PathVariable Long id){
        try {
            negocioService.eliminarNegocio(id);
            return new ResponseEntity<Negocio>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<Negocio>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
