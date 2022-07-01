package com.equipo1.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="servicios")
public class Servicio {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreServicio;
    private int duracion;
    @Column(updatable = false) //nos indica que esta columna no se puede actualizar por el sistema.
    private Date createdAt;
    private Date updatedAt;
    //relacion ManyToOne con Categoria FK
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


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

    //Insertara en el atributo la fecha antes de insertar en la BD.
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    //Función(?)

}
