import React,{useCallback} from "react";
import {useNavigate} from 'react-router-dom'
//cosas importantes para navegar entre páginas^


import Logo from "../assets/LOGO.png"
import ImgConfig from "../assets/TND_M380_02.png"
import 'bootstrap/dist/css/bootstrap.min.css';

const ExplicacionConfiguracionComponent = () => {
    
    const navigate = useNavigate();

    const handleOnClick = useCallback(()=> navigate('/', {replace:true}, [navigate]))

    return (<>
    <body>
        <div style={{backgroundColor: "#FFFFFF"}} >
            {/*LOGO*/}
            <div class="d-flex justify-content-center mt-5 mb-4">
                <img className="d-block w-50" src={Logo} alt="LOGO AGENDAMIGOS"/>
            </div>
            {/*Ilustración*/}
            <div class="container-fluid text-center p-2 ">
                <img src={ImgConfig} alt="Ilustracion" className="d-block w-100 imagenesBienvenida"/>
            </div>
            {/*Texto de explicación de configuración*/}
            <div class="container-fluid justify-content-md-center p-2 mt-2">
                <p class="fs-5 text-center" style={{color: "#803CAA",
                                                    marginBottom: 91}}>
                    <b>TOMA EL CONTROL DE TU NEGOCIO</b>
                    <b style={{color: "#333333"}}><br/>- en tan solo tres pasos -</b>
                </p>
                <br/>
                <p class="text-center" style={{color: "#333333"}}><b>¡Empieza ahora tu configuración!</b></p>
            </div>

            <div class="d-grid gap-2 mx-5 mb-15">
                <a style={{background: "#AC7FC8",
                        color: "aliceblue"}} 
                        class="btn btn-light" 
                        role="button"
                        onClick={handleOnClick}>Configurar</a>
            </div>

        </div>
    </body>

    </>)
}

export default ExplicacionConfiguracionComponent;