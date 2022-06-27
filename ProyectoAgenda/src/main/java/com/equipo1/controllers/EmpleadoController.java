package com.equipo1.controllers;

import com.equipo1.models.Empleado;
import com.equipo1.services.EmpleadoService;
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
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

     @RequestMapping("")
    public String inicioEmpleado(@ModelAttribute("empleado")Empleado empleado){
         return "empleado.jsp";
     }

     @PostMapping("/guardar")
    public String guardarEmpleado(@Valid @ModelAttribute("empleado")Empleado empleado,
                                   BindingResult result,
                                   Model model){
         if (result.hasErrors()){
             model.addAttribute("msgError", "Debe ingresar los datos correctamente");
             return "empleado.jsp";

         }else{
             empleadoService.registroEmpleado(empleado);

             List<Empleado> listaEmpleados = empleadoService.findAll();
             model.addAttribute("empleadosCapturados", listaEmpleados);
             return "mostrarEmpleado.jsp";
         }


     }

     @RequestMapping("/mostrar")
    public String mostrarEmpleados(Model model){
         List<Empleado> listaEmpleados = empleadoService.findAll();
         model.addAttribute("empleadosCapturados", listaEmpleados);
         return "mostrarEmpleado.jsp";
     }

     @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id")Long id, Model model){
         Empleado empleado = empleadoService.buscarId(id);
         model.addAttribute("empleado",empleado);
         return "editarEmpleado.jsp";
     }
     @RequestMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id")Long id,Model model){
         empleadoService.eliminarId(id);
         return "redirect:/empleado/mostrar";
     }

     @PostMapping("/actualizar/{id}")
    public String actualizarEmpleado(@PathVariable("id")Long id,
                                     @Valid @ModelAttribute("empleado") Empleado empleado,
                                     BindingResult result,
                                     Model model){
         if(result.hasErrors()){
             model.addAttribute("msgError","Datos Erroneos");
                     return "editarEmpleados.jsp";
         }else{
             empleado.setId(id);
             empleadoService.registroEmpleado(empleado);
             return"redirect:/empleado/mostrar";
         }

     }











}
