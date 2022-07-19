package com.equipo1.controllers;

import com.equipo1.models.Cliente;
import com.equipo1.services.ClienteService;
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
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @RequestMapping("")
    public String cliente(@ModelAttribute("cliente") Cliente cliente) {
        return "cliente.jsp";
    }

    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute("cliente") Cliente cliente,
                                 BindingResult result,
                                 Model model) {
        if (result.hasErrors()) {
            model.addAttribute("msgError", "Debe ingresar los datos correctamente");
            return "cliente.jsp";

        } else {
            clienteService.guardarCliente(cliente);

            List<Cliente> listaCliente = clienteService.findAll();
            model.addAttribute("clientesCapturados", listaCliente);

            return "mostrarCliente.jsp";

        }
    }

    @RequestMapping("/mostrar")
    public String mostrarCliente(@ModelAttribute("cliente") Cliente cliente, Model model) {
        List<Cliente> listaCliente = clienteService.findAll();
        model.addAttribute("clientesCapturados", listaCliente);

        return "mostrarCliente.jsp";
    }

    @RequestMapping("/editar/{id}")
    public String editarCliente(@PathVariable("id") Long id, Model model) {

        Cliente cliente = clienteService.buscarId(id);
        model.addAttribute("cliente", cliente);
        return "editarCliente.jsp";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable("id")Long id){
        clienteService.eliminarById(id);
        return "redirect:/cliente/mostrar";
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarCliente(@PathVariable("id")Long id,
                                    @Valid @ModelAttribute("cliente")Cliente cliente,
                                    BindingResult result,
                                    Model model){
        if (result.hasErrors()){
            model.addAttribute("msgError","Debe ingresar los datos correctamente");
            return "editarCliente.jsp";
        }else{
            cliente.setId(id);
            clienteService.guardarCliente(cliente);
            List<Cliente> listaCliente = clienteService.findAll();
            model.addAttribute("clientesCapturados",listaCliente);
            return "redirect:/cliente/mostrar";

        }

    }



}


