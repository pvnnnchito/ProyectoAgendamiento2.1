package com.equipo1.models;

public class Cliente {

		/* id int PK
		 * nombre varchar (50)
		 * telefono varchar (20)
		 * correo varchar (50)
		 */

	//atributos
	private int id;//PK //no sé si debe ser int o Integer
	private String nombre; //en base de datos, string es un varchar, no sé si se pueden escribir límites de caracteres
	private String telefono;
	private String correo;
	
	//constructor vacio
	public Cliente() {
		super();
	}

	//constructor lleno
	public Cliente(int id, String nombre, String telefono, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	//getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
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
