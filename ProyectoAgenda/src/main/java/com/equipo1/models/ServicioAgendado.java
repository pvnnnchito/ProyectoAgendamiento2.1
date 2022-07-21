package com.equipo1.models;

import javax.persistence.*;

@Entity
@Table(name = "serviciosAgendados")
public class ServicioAgendado {

    //Atributos
    //idAgendado es para no sobreescribir id de la clase padre.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // --> PK


    //RELACIONES

    //Relacion ManyToOne con Citas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citas_id")
    private Citas citas;

    //Relacion ManyToOne con Servicio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servicio_id")
    private Servicio servicio ;

    //Constructores

    public ServicioAgendado() {
    }


    //Getter & Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
