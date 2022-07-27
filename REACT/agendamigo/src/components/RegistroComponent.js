import React, { useState } from "react";
import BotonRegistroComponent from "./BotonRegistroComponent"

const initialValues =[
    {
        key:"",
        nombre:"",
        correo:"",
        telefono:"",
        password:""
    }
]

const RegistroComponent = ({empleadoAdd}) => {
    const [values, setValues] = useState(initialValues);
    const {nombre, correo, telefono, password} = values;

    const handleInputChange=(e)=>{
        const changedFormValue ={
            ...values,
            [e.target.name]:e.target.value
        }
        setValues(changedFormValue)
    }

    const handleSubmit = (e) =>{
        e.preventDefautl()
        empleadoAdd(values)
    }

    return(
        <div className="container" style={{width: '', marginBottom: '30px'}}>
        <form onSubmit={handleSubmit}> 
            <div className="from-group">
                <label>Nombre Completo: </label>
                <input
                style={{backgroundColor: '#F5ECFB',
                border: 'solid 1px #AC7FC8'
                }}
                type="text"
                className="form-control"
                placeholder="Ingrese su nombre"
                onChange={handleInputChange}
                value={nombre}
                name='nombre'
                />
                <br/>
            </div>
            <div className="from-group">
                <label>Correo electrónico: </label>
                <input
                style={{backgroundColor: '#F5ECFB',
                border: 'solid 1px #AC7FC8',
                }}
                type="text"
                className="form-control"
                placeholder="Ingrese su e-mail"
                onChange={handleInputChange}
                value={correo}
                name='correo'
                />
                <br/>
            </div>
            <div className="from-group">
                <label>Número de contacto: </label>
                <input
                style={{backgroundColor: '#F5ECFB',
                border: 'solid 1px #AC7FC8'
                }}
                type="text"
                className="form-control"
                placeholder="Ingrese su número de teléfono"
                onChange={handleInputChange}
                value={telefono}
                name='telefono'
                />
                <br/>
            </div>
            <div className="from-group">
                <label>Contraseña: </label>
                <input
                style={{backgroundColor: '#F5ECFB',
                border: 'solid 1px #AC7FC8'
                }}
                type="password"
                className="form-control"
                placeholder="Ingrese su contraseña"
                onChange={handleInputChange}
                value={password}
                name='password'
                />
                <br/>
            </div>
            <div class="d-grid gap-2 mx-5">
            <button type="submit" className="btn btn-outline-light"
                style={
                    {backgroundColor: '#AC7FC8',
                    border: 'solid 1px #AC7FC8',
                    borderColor: '#black',
                    width: '',
                    textAlign: 'center',
                    marginBottom: '15px'
                }
                }>Registrarse</button>
            </div>
        </form>
        </div>
    )
}

export default RegistroComponent;