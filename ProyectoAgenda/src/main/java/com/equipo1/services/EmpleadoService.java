package com.equipo1.services;

import com.equipo1.models.Empleado;
import com.equipo1.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public void registroEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Empleado buscarId(Long id) {
        return empleadoRepository.findById(id).get();
    }
    public void eliminarId(Long id) {
        empleadoRepository.deleteById(id);
    }


    public void guardarEmpleado(Empleado empleado) {

    }
}
