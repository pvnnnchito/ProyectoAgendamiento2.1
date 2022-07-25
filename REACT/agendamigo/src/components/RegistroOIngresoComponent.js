import React from "react";
import BotonRegistroNegocioComponent from "./BotonRegistroNegocioComponent";
import BotonRegistroClienteComponent from "./BotonRegistroClienteComponent";
import BotonIngresarComponent from "./BotonIngresarComponent";
import BotonConocenosComponent from "./BotonConocenosComponent";
import LogoComponent from "./LogoComponent";

const RegistroOIngresoComponent = () => {
    
    

    return (
        <div className="mt-5">
            <LogoComponent/>
            <div style={{
                                        marginTop: "180px"
                                    }}>
                <BotonRegistroNegocioComponent/>
                <BotonRegistroClienteComponent/>
                <BotonIngresarComponent/>
                <BotonConocenosComponent/>
            </div>
        </div>
    )
}

export default RegistroOIngresoComponent;