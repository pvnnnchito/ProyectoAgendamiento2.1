package com.equipo1.controllers;

import com.equipo1.models.Citas;
import com.equipo1.services.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/citas")
public class CitasController {
    @Autowired
    CitasService citasService;

    @RequestMapping("")
    public String citas(@ModelAttribute("citas")Citas citas){
        return "citas.jsp";
    }

    @RequestMapping("/agendados")
    public String citaAgendada(Model model){
        //copiamos la lista que tenemos arriba, no es necesario volver a crearla
        List<Citas> citaAgendada = citasService.findAll();
        // y con model pasamos la lista al jsp
        model.addAttribute("citaAgendada",citaAgendada);
        return "citas.jsp";
    }
}
