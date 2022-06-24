package com.equipo1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

		/* id int PK
		 * nombre varchar (50)
		 * telefono varchar (20)
		 * correo varchar (50)
		 */

	//atributos
	//PK //no sé si debe ser int o Integer
	private Long id;
	@NotNull
	@Size(min=4, max=40)
	private String nombre; //en base de datos, string es un varchar, no sé si se pueden escribir límites de caracteres
	@NotNull
	@Size(min=4, max=15)
	private String telefono;
	@NotNull
	@Size(min=4, max=20)
	private String correo;
	
	//constructor vacio
	public Cliente() {
		super();
	}

	//Constructores
	public Cliente(String nombre, String telefono, String correo) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	


}
