package com.equipo1.controllers;

import com.equipo1.models.Disponibilidad;
import com.equipo1.services.DisponibilidadService;
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
@RequestMapping("/disponibilidades")
public class DisponibilidadController {

    @Autowired
    DisponibilidadService disponibilidadService;

    @RequestMapping("")
    public String disponibilidad(@ModelAttribute("disponibilidad") Disponibilidad disponibilidad){
        return "servicio.jsp";
    }

    @PostMapping("/registro")
    public String disponibilidadRegistrada(@ModelAttribute("disponibilidad") Disponibilidad disponibilidad,
                                    BindingResult result,
                                    Model model){
        if(result.hasErrors()){
            model.addAttribute("msgError","Ingreso incorrecto de datos");
            return "disponibilidad.jsp";
        }else {
            //capturamos el objeto con los atributos completos
            //y lo pasamos a service para que lo guarde
            disponibilidadService.saveDisponibilidad(disponibilidad);

            //crear la lista de objetos para poderla mostrar en el jsp
            List<Disponibilidad> listaDisponibilidad = disponibilidadService.findAll();
            //con MODEL es que pasamos cosas al JSP
            model.addAttribute("disponibilidadRegistradas",listaDisponibilidad);
            return "disponibilidadRegistradas.jsp";
        }
    }

    @RequestMapping("/tabla")
    public String tablaDisponibilidad(Model model){
        //copiamos la lista que tenemos arriba, no es necesario volver a crearla
        List<Disponibilidad> listaDisponibilidad = disponibilidadService.findAll();
        // y con model pasamos la lista al jsp
        model.addAttribute("disponibilidadRegistradas",listaDisponibilidad);
        return "disponibilidadRegistradas.jsp";
    }

    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model){

        //buscamos el servicio por su id y lo llamamos de alguna forma en esta función
        Disponibilidad disponibilidad = disponibilidadService.buscarId(id);
        model.addAttribute("disponibilidad",disponibilidad);
        return "editarDisponibilidad.jsp";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarDisponibilidad(@Valid @ModelAttribute("disponibilidad") Disponibilidad disponibilidad,
                                     BindingResult result,
                                     Model model){
        if(result.hasErrors()){
            model.addAttribute("msgError","Ingreso incorrecto de datos");
            return "editarDisponibilidad.jsp";
        }else {
            //capturamos el objeto con los atributos completos
            //y lo pasamos a service para que lo guarde
            disponibilidadService.saveDisponibilidad(disponibilidad);

            //crear la lista de objetos para poderla mostrar en el jsp
            List<Disponibilidad> listaDisponibilidad = disponibilidadService.findAll();
            //con MODEL es que pasamos cosas al JSP
            model.addAttribute("disponibilidadRegistradas",listaDisponibilidad);
            return "redirect:/disponibilidad/tabla";//tenemos que agregar la lista de servicios luego
        }
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id){
        disponibilidadService.eliminarDisponibilidad(id);
        return "redirect:/servicio/tabla";
    }
}
