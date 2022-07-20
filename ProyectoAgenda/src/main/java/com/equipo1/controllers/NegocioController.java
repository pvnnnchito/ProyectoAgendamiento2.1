package com.equipo1.controllers;

import com.equipo1.models.Negocio;
import com.equipo1.services.NegocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/negocio")
public class NegocioController {
    @Autowired
    NegocioService negocioService;

    @RequestMapping("")
    public String registroNegocio(@ModelAttribute("negocio") Negocio negocio){
        return "registroNegocio.jsp";
    }




}
