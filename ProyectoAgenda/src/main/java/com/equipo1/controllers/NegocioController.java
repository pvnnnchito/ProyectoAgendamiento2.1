package com.equipo1.controllers;

import com.equipo1.models.Negocio;
import com.equipo1.services.NegocioService;
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
@RequestMapping("/negocio")
public class NegocioController {
    @Autowired
    NegocioService negocioService;

    //1era ruta - Desplegar el jsp
    @RequestMapping("")
    public String negocio(@ModelAttribute("negocio") Negocio negocio){
        return "negocio.jsp";
    }

    //2da ruta - pasar modelo vacio
    @PostMapping("/registrado")
    public String negocioRegistrado(@ModelAttribute("negocio") Negocio negocio,
                                    BindingResult result,
                                    Model model){
        if(result.hasErrors()){
            model.addAttribute("msgError","Ingreso incorrecto de datos");
            return "negocio.jsp";
        }else {
            //capturamos el objeto con los atributos completos
            //y lo pasamos a service para que lo guarde
            negocioService.guardarNegocio(negocio);

            //crear la lista de objetos para poderla mostrar en el jsp
            List<Negocio> listaNegocios = negocioService.findAll();
            //con MODEL es que pasamos cosas al JSP
            model.addAttribute("negociosRegistrados",listaNegocios);
            return "negociosRegistrados.jsp";//tenemos que agregar la lista de servicios luego
        }
    }

    //tercera ruta, para mostrar la tabla de servicios
    @RequestMapping("/lista")
    public String listaNegocios(Model model){
        //copiamos la lista que tenemos arriba, no es necesario volver a crearla
        List<Negocio> listaNegocios = negocioService.findAll();
        // y con model pasamos la lista al jsp
        model.addAttribute("negociosRegistrados",listaNegocios);
        return "negociosRegistrados.jsp";
    }

    //cuarta ruta, creada con el boton para mostrar los datos del objeto editado
    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model){

        //buscamos el servicio por su id y lo llamamos de alguna forma en esta función
        Negocio negocio = negocioService.buscarId(id);
        model.addAttribute("negocio",negocio);
        return "editarNegocio.jsp";
    }

    //quinta ruta, para pasar el objeto con los atributos editados a la base de datos
    @PostMapping("/actualizar/{id}")
    public String actualizarNegocio(@Valid @ModelAttribute("negocio") Negocio negocio,
                                     BindingResult result,
                                     Model model){
        if(result.hasErrors()){
            model.addAttribute("msgError","Ingreso incorrecto de datos");
            return "editarNegocio.jsp";
        }else {
            //capturamos el objeto con los atributos completos
            //y lo pasamos a service para que lo guarde
            negocioService.guardarNegocio(negocio);

            //crear la lista de objetos para poderla mostrar en el jsp
            List<Negocio> listaNegocios = negocioService.findAll();
            //con MODEL es que pasamos cosas al JSP
            model.addAttribute("negociosRegistrados",listaNegocios);
            return "redirect:/negocio/lista";//tenemos que agregar la lista de servicios luego
        }
    }

    //sexta ruta, para eliminar
    @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id){
        negocioService.eliminarNegocio(id);
        return "redirect:/Negocio/lista";
    }
}
