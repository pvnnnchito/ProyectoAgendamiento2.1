package com.equipo1.controllers;

import com.equipo1.models.ServicioAgendado;
import com.equipo1.services.ServicioAgendadoService;
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

public class ServicioAgendadoController {
    @Autowired
    ServicioAgendadoService servicioAgendadoService;

    //PRIMERA url PARA DESPLEGAR JSP
    @RequestMapping("/agendado")
    public String agendado(@ModelAttribute("servicioAgendado") ServicioAgendado servicioAgendado) {
    return "agendado.jsp";
    }

    @RequestMapping("agendado/editar/{id}") //despliegue
    public String editar(@PathVariable("id") Long id,
                         Model model) {
        System.out.println("el id es: " + id);
        ServicioAgendado servicioAgendado = servicioAgendadoService.buscarId(id);
        model.addAttribute("servicioAgendado", servicioAgendado);

        return "agendado.jsp";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarAgendado(@PathVariable("id") Long id, @Valid @ModelAttribute("servicioAgendado") ServicioAgendado servicioAgendado,
                                 BindingResult resultado,
                                 Model model) {
        System.out.println("el id al actualizar es: " + id);


        if (resultado.hasErrors()) { //capturando si existe un error en el ingreso de datos desde el JSP
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "editarAuto.jsp";
        } else {
            servicioAgendado.setId(id); //--> agregar el id al objeto

            //enviamos el objeto a persistir en base de datos
            servicioAgendadoService.guardarAgendado(servicioAgendado);
            //obtener una lista de autos
            List<ServicioAgendado> listaAgenda = servicioAgendadoService.findAll();

            model.addAttribute("agendados", listaAgenda);
            return "agendado.jsp";
        }
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarAgendamiento(@PathVariable("id") Long id){
        servicioAgendadoService.eliminarPorId(id);
        return "agendado.jsp";
    }
}

