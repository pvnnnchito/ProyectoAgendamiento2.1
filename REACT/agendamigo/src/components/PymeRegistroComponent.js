import React from "react";
import RegistroComponent from "./RegistroComponent";
import IniciarSesionConComponent from "./IniciarSesionConComponent";
import BotonConocenosComponent from "./BotonConocenosComponent";
import BotonRegistroComponent from "./BotonRegistroComponent"
import LogoComponent from "./LogoComponent";
import BotonAtrasComponent from "./BotonAtrasComponent";


const PymeRegistroComponent = () => {
    return (<>
            <LogoComponent/>
            <RegistroComponent/>
            {/*<IniciarSesionConComponent/>*/}
            <BotonRegistroComponent/>
            <BotonConocenosComponent/>
            <BotonAtrasComponent/>
            </>)
}

export default PymeRegistroComponent;