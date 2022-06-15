package com.generation.Modelos;

public class Servicio {

    //Atributos

    private int id;
    private String nombreServicio;
    private int duracion;

    //constructor vacío


    public Servicio() {
        super();
    }

    //constructor con parámetros


    public Servicio(int id, String nombreServicio, int duracion) {
        super();
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.duracion = duracion;
    }

    //Getter & Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_servicio() {
        return nombreServicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombreServicio = nombre_servicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Función(?)

}
