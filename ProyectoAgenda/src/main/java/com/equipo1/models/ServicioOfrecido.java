package com.equipo1.models;

import javax.persistence.*;
@Entity
@Table(name="servicios_ofrecidos")

public class ServicioOfrecido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos
    private Long id;
    private int idCitas; // --> FK idCitas
    private int idServicio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citas_id")
    private Citas citas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servicios_id")
    private Servicio servicio ;
    //constructores


    public ServicioOfrecido() {
        super();
    }

    public ServicioOfrecido(int idCitas, int idServicio) {
        this.idCitas = idCitas;
        this.idServicio = idServicio;
    }

//Getter & Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdCitas() {
        return idCitas;
    }

    public void setIdCitas(int idCitas) {
        this.idCitas = idCitas;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
}
