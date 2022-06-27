package com.equipo1.models;

import javax.persistence.*;

@Entity
@Table(name="servicios")
public class Servicio {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreServicio;
    private int duracion;

    //constructor vacío


    public Servicio() {
        super();
    }

    //constructor con parámetros

    public Servicio(Long id, String nombreServicio, int duracion) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.duracion = duracion;
    }


    //Getter & Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    //Función(?)

}
