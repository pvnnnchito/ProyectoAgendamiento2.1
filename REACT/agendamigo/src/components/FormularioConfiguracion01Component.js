import React, {useState, useEffect}from "react";
//Importar para navegar entre paginas

//Importamos imagenes y estilos

import 'bootstrap/dist/css/bootstrap.min.css';
import BotonSiguienteComponent from "./BotonSiguienteComponent";



//Initial values para el componente

const initialValues = [
    {
        nombrePyme:'',
        numeroContacto:'',
        rubro:'',
        numeroEmpleados:'',
        direccion:''
    }
]


const FormularioConfiguracion01Component = ({configAdd, configEditado, configEdit}) => {

    //1.- Constante
    const [values, setValues] = useState(initialValues);
    //Creamos un objeto que nos permita usar a "values" capturando datos
    const {nombrePyme, numeroContacto, rubro, numeroEmpleados, direccion} = values;

    //2.- Funcion UseEffect, no recarga la pagina
    useEffect( ()=>{
        if(configEditado !== null){
            setValues(configEditado);
        }else{
            setValues(
                {
                    nombrePyme:'',
                    numeroContacto:'',
                    rubro:'',
                    numeroEmpleados:'',
                    direccion:''
                }
            );
        }
    }
    , [configEditado])

    //3.- Funcion UseState, funcion que recepciona los cambios, actualiza y no se pierden
    const handleInputChange = (e) => {
        const changedFormValue = {
            ...values,
            [e.target.name]:e.target.value
        }
        setValues(changedFormValue);
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        if(configEditado !== null){
            configEdit(values)
            setValues(initialValues);
        }else{
            configAdd(values)
        };
    };

    //falta el cosito de progreso (pasos), imagen de agendamigo y el boton + estética + union del paso 1 de conf al 2 y del 2 al 3
    return (
        <form onSubmit={handleSubmit}>
            <h1>¡Bienvenid@! Para comenzar por favor registre los datos de su pyme:</h1>
            <div>
                <div className="form-group">
                    <label>Nombre de Pyme</label>
                    <input
                        type="text"
                        className="form-control"
                        id="nombrePyme"
                        placeholder="Nombre Pyme"
                        value={nombrePyme}
                        name='nombrePyme'
                        onChange={handleInputChange}
                    />
                    <br />
                </div>
                <div className="form-group">
                    <label>Número de contacto</label>
                    <input
                        type="text"
                        className="form-control"
                        id="numeroContacto"
                        placeholder="Número contacto"
                        value={numeroContacto}
                        name='numeroContacto'
                        onChange={handleInputChange}
                    />
                    <br />
                </div>
                <div className="form-group">
                    <label>Rubro</label>
                    <input
                        type="text"
                        className="form-control"
                        id="rubro"
                        placeholder="Rubro"
                        value={rubro}
                        name='rubro'
                        onChange={handleInputChange}
                    />
                    <br />
                </div>
                <div className="form-group">
                    <label>Número de empleados</label>
                    <input
                        type="number"
                        className="form-control"
                        id="numeroEmpleados"
                        placeholder="Número empleados"
                        value={numeroEmpleados}
                        name='numeroEmpleados'
                        onChange={handleInputChange}
                    ></input>
                    <br />
                </div>
                <div className="form-group">
                    <label>Dirección</label>
                    <input
                        type="text"
                        className="form-control"
                        id="direccion"
                        placeholder="Dirección"
                        value={direccion}
                        name='direccion'
                        onChange={handleInputChange}
                    ></input>
                    <br />
                </div>
                <div>
                    <BotonSiguienteComponent/>
                </div>
            </div>
        </form >
    );
}

export default FormularioConfiguracion01Component;