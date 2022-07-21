package com.equipo1.models;

import javax.persistence.*;
@Entity
@Table(name="servicios_ofrecidos")

public class ServicioOfrecido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos
    private Long id;

    //RELACIONES
    //Relacion ManyToOne con Citas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citas_id")
    private Citas citas;

    //Relacion ManyToOne con Servicio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servicio_id")
    private Servicio servicio ;
    //constructores


    public ServicioOfrecido() {
        super();
    }


//Getter & Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
