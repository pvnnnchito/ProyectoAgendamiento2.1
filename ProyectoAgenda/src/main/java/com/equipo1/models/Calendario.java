package com.equipo1.models;

import java.sql.Timestamp;

//@Entity
//@Table(name="usuarios")
public class Calendario {

    //ATRIBUTOS
    private int id;
    private int empleado_id;
    private Timestamp tiempoInicio;
    private Timestamp tiempoFinal;

    //CONSTRUCTORES
    public Calendario() {
    }

    public Calendario(int id, int empleado_id, Timestamp tiempoInicio, Timestamp tiempoFinal) {
        this.id = id;
        this.empleado_id = empleado_id;
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

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
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
