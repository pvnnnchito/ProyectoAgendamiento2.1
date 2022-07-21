package com.equipo1.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="disponibilidades")
public class Disponibilidad {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Timestamp tiempoInicio;
    private Timestamp tiempoFinal;

    //RELACIONES
    //Relacion ManyToOne con Empleados
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    //CONSTRUCTORES
    public Disponibilidad() {
    }

    public Disponibilidad(int id, Timestamp tiempoInicio, Timestamp tiempoFinal) {
        this.id = id;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
    }

    //GETTER Y SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTiempoInicio() {
        return tiempoInicio;
    }

    public void setTiempoInicio(Timestamp tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public Timestamp getTiempoFinal() {
        return tiempoFinal;
    }

    public void setTiempoFinal(Timestamp tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }

    //FUNCIONES
}
