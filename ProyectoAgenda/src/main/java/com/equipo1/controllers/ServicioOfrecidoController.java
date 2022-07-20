package com.equipo1.controllers;

import com.equipo1.models.Servicio;
import com.equipo1.models.ServicioAgendado;
import com.equipo1.models.ServicioOfrecido;
import com.equipo1.services.ServicioOfrecidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ServicioOfrecidoController {

    @Autowired
    ServicioOfrecidoService servicioOfrecidoService;

    //PRIMERA url PARA DESPLEGAR JSP
    @RequestMapping("/ofrecido")
    public String ofrecido(@ModelAttribute("servicioOfrecido") ServicioOfrecido servicioOfrecido) {
        return "ofrecido.jsp";
    }

    @RequestMapping("/tabla")
    public String listaOfrecidos(Model model){
        //copiamos la lista que tenemos arriba, no es necesario volver a crearla
        List<ServicioOfrecido> listaOfrecidos = servicioOfrecidoService.findAll();
        // y con model pasamos la lista al jsp
        model.addAttribute("serviciosOfrecidos",listaOfrecidos);
        return "serviciosOfrecidos.jsp";
    }
}
