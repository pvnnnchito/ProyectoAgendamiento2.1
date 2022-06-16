package com.equipo1.models;

import java.sql.Timestamp;

public class Citas {
	/* id int PK
	 * fecha_creacion timestamp
	 * creador int FK
	 * cliente_id int N FK (este se hereda/traspasa de Cliente,java)
	 * empleado_id int N FK (este se traspasa)
	 * nombre_cliente varchar(128) (no lo dice la imagen pero se debería traspasar de Cliente.java)
	 * contacto_cliente varchar(128) (quizá este sea el telefono de cliente)
	 * hora_inicio timestamp
	 * hora_termino timestamp
	 * cancelado boolean
	 */
	//timestamp importar de java util
	
	//atributos
	private int idCitas; //PK, qué nombre es mejor? id o idCitas
	private Timestamp fechaCreacion;
	private int creador; //FK
	private int clienteId; //herencia
	private int empleadoId; //herencia
	private String nombreCliente; //herencia?
	private String contactoCliente; //telefono? o persona?
	private Timestamp horaInicio;
	private Timestamp horaTermino;
	private boolean cancelado;
	
	//constructores
	public Citas() {
		super();
	}

	public Citas(int id, Timestamp fechaCreacion, int creador, int clienteId, int empleadoId, String nombreCliente,
			String contactoCliente, Timestamp horaInicio, Timestamp horaTermino, boolean cancelado) {
		super();
		this.idCitas = id;
		this.fechaCreacion = fechaCreacion;
		this.creador = creador;
		this.clienteId = clienteId;
		this.empleadoId = empleadoId;
		this.nombreCliente = nombreCliente;
		this.contactoCliente = contactoCliente;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
		this.cancelado = cancelado;
	}

	//getters y setters
	public int getId() {
		return idCitas;
	}

	public void setId(int id) {
		this.idCitas = id;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getCreador() {
		return creador;
	}

	public void setCreador(int creador) {
		this.creador = creador;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getContactoCliente() {
		return contactoCliente;
	}

	public void setContactoCliente(String contactoCliente) {
		this.contactoCliente = contactoCliente;
	}

	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Timestamp getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(Timestamp horaTermino) {
		this.horaTermino = horaTermino;
	}

	public boolean isCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}
	
	
	
	

}
