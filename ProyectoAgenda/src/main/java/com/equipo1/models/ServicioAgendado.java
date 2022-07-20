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
    private int idCitas; // --> FK idCitas
    private int idServicio; //--> FK idServicio

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citas_id")
    private Citas citas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servicio_id")
    private Servicio servicio ;

    //Constructores

    public ServicioAgendado() {
    }

    public ServicioAgendado(int idCitas, int idServicio) {
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

    public int getidCitas() {
        return idCitas;
    }

    public void setidCitas(int idCitas) {
        this.idCitas = idCitas;
    }

    public int getidServicio() {
        return idServicio;
    }

    public void setidServicio(int idServicio) {
        this.idServicio = idServicio;
    }
}
