package com.equipo1.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    @Column(updatable = false) //nos indica que esta columna no se puede actualizar por el sistema.
    private Date createdAt;

    private Date updatedAt;

    //RELACIONES

    //relación OneToMany con Servicio
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Servicio> listaServicios;


    //contructores

    public Categoria() {
    }

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //get y set


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
}
