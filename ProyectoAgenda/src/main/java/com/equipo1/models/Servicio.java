package com.equipo1.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="servicios")
public class Servicio {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreServicio;
    private int duracion;

    private int precio;
    @Column(updatable = false) //nos indica que esta columna no se puede actualizar por el sistema.
    private Date createdAt;
    private Date updatedAt;

    //RELACIONES

    //relacion ManyToOne con Categoria FK
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    //Relacion OneToMane con ServicioAgendado
    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ServicioAgendado> listaAgenda;

    //Relacion OneToMane con ServicioOfrecido
    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ServicioOfrecido> listaOfrecidos;

    //Relacion ManyToOne con Negocio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "negocio_id")
    private Negocio negocio;

    //constructor vacío
    public Servicio() {
        super();
    }

    //constructor con parámetros

    public Servicio(Long id, String nombreServicio, int duracion, int precio) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.duracion = duracion;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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
