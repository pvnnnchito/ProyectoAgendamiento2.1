import React from "react";
import logoFB from "../assets/img/logoFB.png"
import logoIG from "../assets/img/logoIG.jpeg"

const IniciarSesionConComponent = () => {
    return(
        <div className="container" 
        style={{
            width: '30%',
            marginBottom: '40px'
        }}>
            <div className="text-center">
            <b><p style={{color: '#8243A9'}}>Registrarse con: </p></b> 
            </div>
            <div className="container d-flex justify-content-evenly"         
            style={{
            width: '100px',
            padding: '10px',
            marginBottom: '10px'
        }}>
            <img src={logoFB}
            style={{
                margin: '10px',
                width: '40px',
                height: '40px'
            }}/> 
            <img src={logoIG}
                style={{
                margin: '10px',
                width: '40px'
                }}/>
            </div>
        </div>
    )
}

export default IniciarSesionConComponent;