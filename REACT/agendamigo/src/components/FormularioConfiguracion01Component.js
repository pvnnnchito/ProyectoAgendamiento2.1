import React from "react";
import Logo from "../assets/LOGO.png";
import 'bootstrap/dist/css/bootstrap.min.css';


const FormularioConfiguracion01Component = () => {
//falta el cosito de progreso (pasos), imagen de agendamigo y el boton + estética + union del paso 1 de conf al 2 y del 2 al 3
    return(
    <form>
        <div style={{backgroundColor: "#FFFFFF"}} >
        {/* debo preguntar si el h3 va antes o despues del container y si el tamaño es el correcto*/}
        <div className="container" style={{width: '50%', marginBottom: '30px'}}>
            <h3>¡Bienvenid@! Para comenzar por favor registre los datos de su pyme:</h3>
        <div className="form-group">
        <label>Nombre de Pyme</label>
        <input
        style={{backgroundColor: '#F5ECFB',
        border: 'solid 1px #AC7FC8'
        }}
        type="text"
        className="form-control"
        id="nombrePyme"
        placeholder="Nombre Pyme"
        />
        <br/>
        </div>
        <div className="form-group">
        <label>Número de contacto</label>
        <input
        style={{backgroundColor: '#F5ECFB',
        border: 'solid 1px #AC7FC8'
        }}
        type="text"
        className="form-control"
        id="numeroContacto"
        placeholder="Número contacto"
        />
        <br/>
        </div>
        <div className="form-group">
        <label>Rubro</label>
        <input
        style={{backgroundColor: '#F5ECFB',
        border: 'solid 1px #AC7FC8'
        }}
        type="text"
        className="form-control"
        id="rubro"
        placeholder="Rubro"
        />
        <br/>
        </div>
        <div className="form-group">
        <label>Número de empleados</label>
        <input
        style={{backgroundColor: '#F5ECFB',
        border: 'solid 1px #AC7FC8'
        }}
        type="number"
        className="form-control"
        id="numeroEmpleados"
        placeholder="Número empleados"
        ></input>
        <br/>
        </div>
        <div className="form-group">
        <label>Dirección</label>
        <input
        style={{backgroundColor: '#F5ECFB',
        border: 'solid 1px #AC7FC8'
        }}
        type="text"
        className="form-control"
        id="direccion"
        placeholder="Dirección"
        ></input>
        <br/>
        </div>
            {/*LOGO*/}
            <div class="d-flex justify-content-center mt-5 mb-4">
                <img className="d-block w-50" src={Logo} alt="LOGO AGENDAMIGOS"/>
            </div>
        
        <div class="d-grid gap-2 mx-5">
            <button type="submit" className="btn btn-outline-light"
                style={
                    {backgroundColor: '#E0C0f4',
                    border: 'solid 1px #AC7FC8',
                    borderColor: '#black',
                    width: '',
                    textAlign: 'center',
                    marginBottom: '15px'
                }
                }
            >       
            Siguiente</button>
        </div>
        </div>
        </div>
    </form>
    );
}

export default FormularioConfiguracion01Component;