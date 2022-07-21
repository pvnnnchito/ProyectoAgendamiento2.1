import React,{useCallback} from "react";
import {useNavigate} from 'react-router-dom'
//cosas importantes para navegar entre páginas^

import Logo from "../assets/LOGO.png"
import Slide01 from "../assets/TND_M380_01.png"
import Slide02 from "../assets/TND_M380_07.png"
import Slide03 from "../assets/TND_M380_08.png"

const OnboardingComponent = () => {
    
    const navigate = useNavigate();
    
    const handleOnClick = useCallback(()=> navigate('/Paso0config', {replace:true}, [navigate]))
    
    return (<>
    
            <body>
                <div class="d-flex justify-content-center mt-5 mb-4">
                    <img className="d-block w-50" src={Logo} alt="LOGO AGENDAMIGOS"/>
                </div>
                <div>
                    <div class="d-flex justify-content-center align-self-center">
                        <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
                            {/* indicadores del carrusel */}
                            <div class="carousel-indicators">
                                <button type="button" style={{backgroundColor: "#B44BF4"}} data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                                <button type="button" style={{backgroundColor: "#B44BF4"}} data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
                                <button type="button" style={{backgroundColor: "#B44BF4"}} data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
                            </div>
                            {/* slides del carrusel */}
                            <div class="carousel-inner">
                                {/* elemento 1 */}
                                <div class="carousel-item active" data-bs-interval="10000">
                                    <img src={Slide01} className="d-block w-100 imagenesBienvenida" alt="Pareja Organizada"/>
                                    <h5 style={{color: "#803CAA"}} class="d-flex justify-content-center fs-3">UN AMIGO PARA TU AGENDA</h5>
                                    <p className="d-flex justify-content-center m-5">Ve tu horario disponible y horas agendadas en una sola pantalla. <br/><br/> Modifica lo que podrán ver tus clientes de una forma intuitiva.</p>
                                </div>
                                {/* elemento 2 */}
                                <div class="carousel-item" data-bs-interval="2000">
                                    <img src={Slide02} class="d-block w-100 imagenesBienvenida" alt="Emprendedor Organizado"/>
                                    <h5 style={{color: "#803CAA"}} class="d-flex justify-content-center fs-3">UN AMIGO PARA TU NEGOCIO</h5>
                                    <p class="d-flex justify-content-center m-5">Organiza tus servicios de forma rápida y facil! Manten tu negocio actualizado en la web.<br/><br/>Agrega servicios, empleados, clientes y citas con solo un click.<br/></p>
                                </div>
                                {/* elemento 3 */}
                                <div class="carousel-item">
                                    <img src={Slide03} class="d-block w-100 imagenesBienvenida" alt="Emprendedora empoderada"/>
                                    <h5 style={{color: "#803CAA"}} class="d-flex justify-content-center fs-3">UN AMIGO PARA TI</h5>
                                    <p class="d-flex justify-content-center m-5">Agrega empleados y gestiona tu negocio de forma cooperativa.<br/><br/>Lleva tu organización al siguiente nivel y toma el control de tu negocio.<br/></p>
                                </div>
                            </div>
                            {/* botones de adelante y atras */}
                            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Anterior</span>
                            </button>
                            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Siguiente</span>
                            </button>
                        </div>
                    </div>
                    {/* Botón para salir del Onboarding */}
                    <div class="d-grid gap-2 mx-5">
                        <a style={{
                            background: "#AC7FC8",
                            color: "aliceblue"}}
                            class="btn btn-light"
                            role="button"
                            onClick={handleOnClick}>Ingresar</a>
                    </div>
                </div>

            </body>
            </>)
};

export default OnboardingComponent;