package com.equipo1.controllers;

import com.equipo1.models.Servicio;
import com.equipo1.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> main
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> main

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/servicio")
public class ServicioController {
    @Autowired
    ServicioService servicioService;

    //primera ruta, para desplegar el jsp
    @RequestMapping("")
    public String servicio(@ModelAttribute("servicio") Servicio servicio){
        return "servicio.jsp";
    }

    //segunda ruta, para pasar el modelo vacio
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

    //tercera ruta, para mostrar la tabla de servicios
<<<<<<< HEAD
<<<<<<< HEAD
    @RequestMapping("/tablaServicios")
    public String tablaServicios(Model model){
=======
    @RequestMapping("/tabla")
    public String tablaservicios(Model model){
>>>>>>> main
=======
    @RequestMapping("/tabla")
    public String tablaservicios(Model model){
>>>>>>> main
        //copiamos la lista que tenemos arriba, no es necesario volver a crearla
        List<Servicio> listaServicios = servicioService.findAll();
        // y con model pasamos la lista al jsp
        model.addAttribute("serviciosRegistrados",listaServicios);
        return "serviciosRegistrados.jsp";
    }

<<<<<<< HEAD
<<<<<<< HEAD
    @RequestMapping("/editar/{id}")
    public String editarServicio(@PathVariable("id")Long id, Model model){
        Servicio servicio = servicioService.buscarId(id);
        model.addAttribute("servicio",servicio);
        return"editarServicio.jsp";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarServicio(@PathVariable("id")Long id){

        servicioService.eliminarById(id);
        return"redirect:/servicio/tablaServicios";

    }

    @PostMapping("/actualizar/{id}")
    public String actualizarServicio(@PathVariable("id")Long id,
                                     @Valid @ModelAttribute("servicio")Servicio servicio,
                                     BindingResult result,
                                     Model model){
        if (result.hasErrors()){
            model.addAttribute("msgError","Debe ingresar los datos correctamente");
            return "editarServicio.jsp";

        }else {
            servicio.setId(id);
            servicioService.saveService(servicio);
            List<Servicio> listaServicio = servicioService.findAll();
            model.addAttribute("serviciosRegistrados",listaServicio);
            return "redirect:/servicio/tablaServicios";

        }

    }



=======
=======
>>>>>>> main
    //cuarta ruta, creada con el boton para mostrar los datos del objeto editado
    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model){

        //buscamos el servicio por su id y lo llamamos de alguna forma en esta función
        Servicio servicio = servicioService.buscarId(id);
        model.addAttribute("servicio",servicio);
        return "editarServicio.jsp";
    }
    //quinta ruta, para pasar el objeto con los atributos editados a la base de datos
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

    //sexta ruta, para eliminar
    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id){
        servicioService.eliminarServicio(id);
        return "redirect:/servicio/tabla";
    }
<<<<<<< HEAD
>>>>>>> main
=======
>>>>>>> main
}
