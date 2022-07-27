import React,{useState, useEffect} from "react";
import RegistroComponent from "./RegistroComponent";
import LogoComponent from "./LogoComponent";
import BotonAtrasComponent from "./BotonAtrasComponent";
import {getAllEmpleado, guardarEmpleado} from "../services/EmpleadoService"

const initialEmpleado1 =[
    {
        key:"",
        nombre:"",
        correo:"",
        telefono:"",
        password:""
    }
]

const PymeRegistroComponent = () => {
    //usando el estado para decir que el empleado1 viene vacio por defecto
    const [empleado1, setEmpleado1] = useState(initialEmpleado1);


    const obtenerEmpleados = async() =>{
        setEmpleado1(await getAllEmpleado())
    }

    useEffect(
        ()=>{obtenerEmpleados()}
    ,[])

    const empleadoAdd = async(empleado)=>{
        await guardarEmpleado(empleado)
        setEmpleado1(await getAllEmpleado())
    }

    return (<>
            <LogoComponent/>
            {/*formulario*/}
            <RegistroComponent
            empleadoAdd={empleadoAdd}/>
            <BotonAtrasComponent/>
            </>)
}

export default PymeRegistroComponent;