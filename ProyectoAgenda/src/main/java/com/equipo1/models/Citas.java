package com.equipo1.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "citas")
public class Citas {

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp fechaCreacion;
	private Integer creador; //FK
	private String nombreCliente; //herencia?
	private String contactoCliente; //telefono? o persona?
	private Timestamp horaInicio;
	private Timestamp horaTermino;
	private Boolean cancelado;

	//RELACIONES

	//Relacion ManyToOne con Empleado
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empleado_id")
	private Empleado empleado;

	//Relacion ManyToOne con Cliente
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@OneToMany(mappedBy = "citas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ServicioAgendado> listaAgenda;

	@OneToMany(mappedBy = "citas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ServicioOfrecido> listaOfrecidos;

	//constructores
	public Citas() {
		super();
	}

	//Constructor lleno
	public Citas(Timestamp fechaCreacion, Integer creador, String nombreCliente, String contactoCliente, Timestamp horaInicio, Timestamp horaTermino, Boolean cancelado) {
		this.fechaCreacion = fechaCreacion;
		this.creador = creador;
		this.nombreCliente = nombreCliente;
		this.contactoCliente = contactoCliente;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
		this.cancelado = cancelado;
	}

	//Getter & Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getCreador() {
		return creador;
	}

	public void setCreador(Integer creador) {
		this.creador = creador;
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

	public Boolean getCancelado() {
		return cancelado;
	}

	public void setCancelado(Boolean cancelado) {
		this.cancelado = cancelado;
	}
}
