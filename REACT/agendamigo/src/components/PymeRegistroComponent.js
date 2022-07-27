import React from "react";
import RegistroComponent from "./RegistroComponent";
import IniciarSesionConComponent from "./IniciarSesionConComponent";
import BotonConocenosComponent from "./BotonConocenosComponent";
import BotonRegistroComponent from "./BotonRegistroComponent"
import LogoComponent from "./LogoComponent";
import BotonAtrasComponent from "./BotonAtrasComponent";
import { guardarEmpleado } from "../services/EmpleadoService";

const PymeRegistroComponent = () => {
    return (<>
            <LogoComponent/>
            <RegistroComponent
            guardarEmpleado={guardarEmpleado}/>
            {/*<IniciarSesionConComponent/>*/}
            <BotonRegistroComponent/>
            <BotonConocenosComponent/>
            <BotonAtrasComponent/>
            </>)
}

export default PymeRegistroComponent;