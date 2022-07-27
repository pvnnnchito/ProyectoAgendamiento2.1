import React, { useEffect, useState } from "react";
import { eliminarEmpleado, getAllEmpleado } from "../component/EmpleadoService";
import { AgendaEmpleadosComponent } from "./AgendaComponent";
import empleadoImagen from "../assets/Empleado.svg"


const initialAgendaEmpleado=[
    {
        key:"",
        nombre:"",
        correo:"",
        telefono:"",
        password:""
        
    }
]


const EmpleadoAgendaComponent=()=>{

    const [agendaEmpleados, setAgendaEmpleados]= useState(initialAgendaEmpleado);

    const obtenerEmpleados = async()=>{
        setAgendaEmpleados(await getAllEmpleado());
    }

    useEffect(
        ()=>{obtenerEmpleados()}
        ,[])
    
    const empleadoDelete = async(id) => {
        await eliminarEmpleado(id)
        setAgendaEmpleados(await getAllEmpleado());
    }

    return(
        <>
        <header>
                <nav className="navbar navbar-expand-lg navbar-dark" style={{backgroundColor:"#63029F"}}>
                    <div className="container-fluid">
                        <a className="navbar-brand" href="#">AgendAmigo</a>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                                <li className="nav-item">
                                    <a className="nav-link active" aria-current="page" href="#">Agenda</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link" href="#">Calendario</a>
                                </li>
                                <li className="nav-item dropdown">
                                    <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                        data-bs-toggle="dropdown" aria-expanded="false">
                                        Agregar
                                    </a>
                                    <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <li><a className="dropdown-item" href="#">Cita</a></li>
                                        <li><a className="dropdown-item" href="#">Cliente</a></li>
                                        <li><a className="dropdown-item" href="#">Servicio</a></li>
                                        <li>
                                            <hr className="dropdown-divider" />
                                        </li>
                                        <li><a className="dropdown-item" href="#">Empleado</a></li>
                                    </ul>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link">Historial</a>
                                </li>
                                <li className="nav-item">
                                    <a className="nav-link">Perfil</a>
                                </li>
                            </ul>
                            <form className="d-flex">
                                <input className="form-control me-2" type="search" placeholder="Buscar cliente" aria-label="Search" />
                                <button className="btn btn-outline-warning" type="submit">Buscar</button>
                            </form>
                        </div>
                    </div>
                </nav>
            </header>
            <div className="text-center">
                    <img src={empleadoImagen} alt="empleado" />
                </div>
        {
            agendaEmpleados.map(empleado => <AgendaEmpleadosComponent 
                key={empleado.id}
                empleado={empleado}
                empleadoDelete={empleadoDelete}
                />)
        }
        </>
    )
}

export default EmpleadoAgendaComponent;