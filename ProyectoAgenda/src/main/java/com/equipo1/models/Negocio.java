package com.equipo1.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Negocios")
public class Negocio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String rubro;
    private String direccion;
    private String telefono;
    private String email;

    @Column(updatable = false) //
    private Date createdAt;
    private Date updatedAt;

    public Negocio() {
    }

    public Negocio(String nombre, String rubro, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.rubro = rubro;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
