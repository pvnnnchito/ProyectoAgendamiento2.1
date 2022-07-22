package com.equipo1.controllers;

import com.equipo1.models.Servicio;
import com.equipo1.services.ServicioService;
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
@RequestMapping("/servicio")
public class ServicioController {
    @Autowired
    ServicioService servicioService;

    //1. Desplegar
    @RequestMapping("")
    public String servicio(@ModelAttribute("servicio") Servicio servicio){
        return "servicio.jsp";
    }

    //2. Modelo vacio --> CREATE
    @PostMapping("/registrado")
    public String servicioRegistrado(@ModelAttribute("servicio") Servicio servicio,
                                    BindingResult result,
                                    Model model){
        if(result.hasErrors()){
            model.addAttribute("msgError","Ingreso incorrecto de datos");
            return "servicio.jsp";
        }else {
            //capturamos el objeto con los atributos completos
            //y lo pasamos a service para que lo guarde
            servicioService.saveService(servicio);

            //crear la lista de objetos para poderla mostrar en el jsp
            List<Servicio> listaServicios = servicioService.findAll();
            //con MODEL es que pasamos cosas al JSP
            model.addAttribute("serviciosRegistrados",listaServicios);
            return "serviciosRegistrados.jsp";//tenemos que agregar la lista de servicios luego
        }
    }

    //3. Mostrar tabla de Servicios --> READ
    @RequestMapping("/tabla")
    public String tablaservicios(Model model){
        //copiamos la lista que tenemos arriba, no es necesario volver a crearla
        List<Servicio> listaServicios = servicioService.findAll();
        // y con model pasamos la lista al jsp
        model.addAttribute("serviciosRegistrados",listaServicios);
        return "serviciosRegistrados.jsp";
    }

    //4. Ruta del boton EDITAR (nos envía al formulario de ingreso pero en ruta de edicion segun id del objetivo a editar)
    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model){

        //buscamos el servicio por su id y lo llamamos de alguna forma en esta función
        Servicio servicio = servicioService.buscarId(id);
        model.addAttribute("servicio",servicio);
        return "editarServicio.jsp";
    }
    //5. Actualiza la base de datos segun los datos editados --> UPDATE
    @PostMapping("/actualizar/{id}")
    public String actualizarServicio(@Valid @ModelAttribute("servicio") Servicio servicio,
                                    BindingResult result,
                                    Model model){
        if(result.hasErrors()){
            model.addAttribute("msgError","Ingreso incorrecto de datos");
            return "editarServicio.jsp";
        }else {
            //capturamos el objeto con los atributos completos
            //y lo pasamos a service para que lo guarde
            servicioService.saveService(servicio);

            //crear la lista de objetos para poderla mostrar en el jsp
            List<Servicio> listaServicios = servicioService.findAll();
            //con MODEL es que pasamos cosas al JSP
            model.addAttribute("serviciosRegistrados",listaServicios);
            return "redirect:/servicio/tabla";//tenemos que agregar la lista de servicios luego
        }
    }

    //6. Borra según id - DELETE
    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id){
        servicioService.eliminarServicio(id);
        return "redirect:/servicio/tabla";
    }
}
