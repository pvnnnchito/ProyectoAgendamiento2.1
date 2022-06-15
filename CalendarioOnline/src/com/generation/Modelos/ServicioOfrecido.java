package com.generation.Modelos;

public class ServicioOfrecido extends Servicio {

    //Atributos

    private int idOfrecido;
    private int idCalendario;

    //constructores


    public ServicioOfrecido() {
        super();
    }

    public ServicioOfrecido(int idOfrecido, int idCalendario) {
        this.idOfrecido = idOfrecido;
        this.idCalendario = idCalendario;
    }

    //Getter & Setter


    public int getIdOfrecido() {
        return idOfrecido;
    }

    public void setIdOfrecido(int idOfrecido) {
        this.idOfrecido = idOfrecido;
    }

    public int getIdCalendario() {
        return idCalendario;
    }

    public void setIdCalendario(int idCalendario) {
        this.idCalendario = idCalendario;
    }
}
