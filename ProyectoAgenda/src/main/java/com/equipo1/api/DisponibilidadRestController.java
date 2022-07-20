package com.equipo1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.equipo1.services.DisponibilidadService;

@RestController
@RequestMapping("/api/disponibilidad")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class DisponibilidadRestController {
    
    @Autowired
    DisponibilidadService disponibilidadService;
}
