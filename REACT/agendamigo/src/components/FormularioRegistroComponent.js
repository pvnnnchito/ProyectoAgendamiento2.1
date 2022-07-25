import React from "react";

const FormularioRegistroComponent = () => {
    return (
    <div className="container" style={{width: '50%', marginBottom: '30px'}}>
    <form>
        <div className="from-group">
            <label>Nombre completo: </label>
            <input
            style={{backgroundColor: '#F5ECFB',
                    border: 'solid 1px #AC7FC8'
            }}
            type="text"
            className="form-control"
            placeholder="Ingrese su nombre."
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
            />
            <br/>
        </div>
        <div className="from-group">
            <label>Número de contacto: </label>
            <input
            style={{backgroundColor: '#F5ECFB',
            border: 'solid 1px #AC7FC8'
            }}
            type="password"
            className="form-control"
            placeholder="Ingrese su numero contacto."
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
            />
            <br/>
        </div>
    </form>
    </div>
)
}
export default FormularioRegistroComponent;