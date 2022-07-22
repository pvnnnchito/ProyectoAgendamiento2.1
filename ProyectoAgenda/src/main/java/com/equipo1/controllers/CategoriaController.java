package com.equipo1.controllers;

import com.equipo1.models.Categoria;
import com.equipo1.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    //PRIMER METODO, para desplegar el ingreso de Categoria
    @RequestMapping("")
    public String categoria(@ModelAttribute("categoria")Categoria categoria) {
        return "categoria.jsp";
    }

    //SEGUNDO METODO

}
