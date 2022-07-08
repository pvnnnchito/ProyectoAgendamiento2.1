package com.equipo1.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="clientes")
public class Cliente {

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nombre; //en base de datos, string es un varchar, no sé si se pueden escribir límites de caracteres
	private String telefono;
	private String correo;
	
	//constructor vacio
	public Cliente() {
		super();
	}

	//constructor lleno


	public Cliente(Long id, String nombre, String telefono, String correo) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	//getters y setters


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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
