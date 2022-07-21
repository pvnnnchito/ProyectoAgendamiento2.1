import React from "react";

FormularioRegistroComponent = () => {
    return(
        <form>
            <div className="form-group">
            <label>Nombre completo: </label>
            <input
            type="text"
            className="form-control"
            placeholder="Ingrese su nombre."
            />
            <br/>
            </div>
            <div className="form-group">
            <label>Correo electrónico: </label>
            <input
            type="text"
            className="form-control"
            placeholder="Ingrese su eMail."
            />
            <br/>
            </div>
            <div className="form-group">
            <label>Número de contácto: </label>
            <input
            type="text"
            className="form-control"
            placeholder="Ingrese su número telefónico."
            />
            <br/>
            </div>
            <div className="form-group">
            <label>Contraseña: </label>
            <input
            type="text"
            className="form-control"
            placeholder="Ingrese su contraseña."
            />
            <br/>
            </div>
        </form>
    )
}

export default FormularioRegistroComponent;