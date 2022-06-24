package com.equipo1.models;

import javax.persistence.*;

@Entity
@Table(name = "servicioAgendado")
public class ServicioAgendado {

    //Atributos
    //idAgendado es para no sobreescribir id de la clase padre.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // --> PK
    private int idAgendado; // --> FK idCitas
    private int idCalendario; //--> FK idServicio

    //Constructores

    public ServicioAgendado() {
    }

    public ServicioAgendado(int idAgendado, int idCalendario) {
        this.idAgendado = idAgendado;
        this.idCalendario = idCalendario;
    }

    //Getter & Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
