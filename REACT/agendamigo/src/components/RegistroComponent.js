import React, { useState } from "react";


const initialValues=[
    {
        key:"",
        nombre:"",
        correo:"",
        telefono:"",
        password:"",
    }
]

const RegistroComponent = ({userAdd}) => {

    const[values,setValues]=useState(initialValues);
    const{nombre, correo, telefono, password}=values;

    

    const handleInputValues=(e)=>{
        const changeValues={
            ...values,
            [e.target.name]:e.target.value
        }
        setValues(changeValues);
    }

    const handleSubmit=(e)=>{
        e.preventDefault();
        userAdd(values);
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
                placeholder="Ingrese su nombre."
                name="nombre"
                value={nombre}
                onChange={handleInputValues}
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
                placeholder="Ingrese su eMail."
                name="correo"
                value={correo}
                onChange={handleInputValues}

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
                placeholder="Ingrese su número de teléfono."
                name="telefono"
                value={telefono}
                onChange={handleInputValues}

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
                placeholder="Ingrese su contraseña."
                name="password"
                value={password}
                onChange={handleInputValues}

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
                }

                
            >       
            Registrarse</button>
        </div>
        </form>
        </div>
    )
}

export default RegistroComponent;