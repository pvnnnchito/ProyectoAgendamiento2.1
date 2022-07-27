import React from "react";
import Texto from "../assets/img/texto.jpeg"
import logotipo from "../assets/img/logotipo.jpeg"

const LogotipoComponent = () => {
    return(
        <div className="container text-center" style={{
            padding: '40px'
        }}>
            <img src={logotipo}/>
            <br/>
            <img src={Texto}/>
        </div>
    )
}

export default LogotipoComponent;