import React, { useEffect, useState } from "react";
import RegistroComponent from "./RegistroComponent";
import IniciarSesionConComponent from "./IniciarSesionConComponent";
import BotonConocenosComponent from "./BotonConocenosComponent";
import BotonRegistroComponent from "./BotonRegistroComponent"
import LogoComponent from "./LogoComponent";
import BotonAtrasComponent from "./BotonAtrasComponent";
<<<<<<< HEAD
import { guardarEmpleado } from "../services/EmpleadoService";
=======
import { getAllEmpleado, guardarEmpleado } from "../services/EmpleadoService";
import { AgendaEmpleadosComponent } from "./AgendaComponent";

const initialEmpleado=[
    {
        key:"",
        nombre:"",
        correo:"",
        telefono:"",
        password:"",
    }
]

>>>>>>> LeonardoUtreras

const PymeRegistroComponent = () => {

    const[empleados,setEmpleados]=useState(initialEmpleado);

    const obtenerEmpleado=async()=>{
        setEmpleados(await getAllEmpleado());
    }

    useEffect(
        ()=>{obtenerEmpleado()}
        ,[])

    const userAdd =async(empleado)=>{
        await guardarEmpleado(empleado)
        setEmpleados(await getAllEmpleado())
    }

    return (<>
            <LogoComponent/>
<<<<<<< HEAD
            <RegistroComponent
            guardarEmpleado={guardarEmpleado}/>
=======
            <RegistroComponent userAdd={userAdd}/>
>>>>>>> LeonardoUtreras
            {/*<IniciarSesionConComponent/>*/}
{/*             <BotonRegistroComponent/>
 */}        
 
            <BotonConocenosComponent/>
            <BotonAtrasComponent/>
            </>)
}

export default PymeRegistroComponent;