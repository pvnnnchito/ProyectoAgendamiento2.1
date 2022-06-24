package com.equipo1.controllers;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;

@Controller
public class ServicioController {
=======
import com.equipo1.models.Servicio;
import com.equipo1.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/tablaservicios")
    public String tablaservicios(Model model){
        //copiamos la lista que tenemos arriba, no es necesario volver a crearla
        List<Servicio> listaServicios = servicioService.findAll();
        // y con model pasamos la lista al jsp
        model.addAttribute("sserviciosRegistrados",listaServicios);
        return "serviciosRegistrados.jsp";
    }

>>>>>>> LuisMejias
}
