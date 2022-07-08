package com.equipo1.controllers;

import com.equipo1.models.Citas;
import com.equipo1.services.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/citas")
public class CitasController {
    @Autowired
    CitasService citasService;

    @RequestMapping("")
    public String citas(@ModelAttribute("citas")Citas citas){
        return "";
    }

}
