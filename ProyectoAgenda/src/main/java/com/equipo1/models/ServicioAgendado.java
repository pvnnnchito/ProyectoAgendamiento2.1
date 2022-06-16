package com.equipo1.models;

public class ServicioAgendado extends Servicio{

    //Atributos
    //idAgendado es para no sobreescribir id de la clase padre.

    private int idAgendado;
    private int idCalendario;

    //Constructores


    public ServicioAgendado() {
        super();
    }

    public ServicioAgendado(int idAgendado, int idCalendario) {
        this.idAgendado = idAgendado;
        this.idCalendario = idCalendario;
    }

    //Getter & Setter


    public int getIdAgendado() {
        return idAgendado;
    }

    public void setIdAgendado(int idAgendado) {
        this.idAgendado = idAgendado;
    }

    public int getIdCalendario() {
        return idCalendario;
    }

    public void setIdCalendario(int idCalendario) {
        this.idCalendario = idCalendario;
    }
}
