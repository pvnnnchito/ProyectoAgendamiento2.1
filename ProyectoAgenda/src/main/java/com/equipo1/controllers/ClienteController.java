package com.equipo1.controllers;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;

@Controller
public class ClienteController {
=======
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.equipo1.models.Cliente;
import com.equipo1.services.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @RequestMapping("") // ruta vacia, para hacer el llamado de la ruta principal
    public String inicioCliente(@ModelAttribute("cliente") Cliente cliente) {
        return "cliente.jsp";
    }

    @PostMapping("/guardar")
    public String guardarCliente(@Valid @ModelAttribute("cliente") Cliente cliente,
            BindingResult resultado,
            Model model) {

        if (resultado.hasErrors()) {
            model.addAttribute("msgError", "Datos erroneos");
            return "cliente.jsp";
        } else {
            // Creando el metodo para guardar los clientes en la base de datos
            clienteService.guardarCliente(cliente);

            List<Cliente> listaClientes = clienteService.findAll();

            model.addAttribute("clienteCapturados", listaClientes);

            return "mostrarClientes.jsp";

        }

    }

>>>>>>> FranciscoPerez
}
