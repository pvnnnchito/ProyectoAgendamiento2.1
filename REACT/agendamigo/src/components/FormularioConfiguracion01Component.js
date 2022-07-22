import React from "react";


const FormularioConfiguracion01Component = () => {
//falta el cosito de progreso (pasos), imagen de agendamigo y el boton + estética + union del paso 1 de conf al 2 y del 2 al 3
    return(
    <form>
        <h1>¡Bienvenid@! Para comenzar por favor registre los datos de su pyme:</h1>
        <div>
        <div className="form-group">
        <label>Key (ocultar?)</label>
        <input
        type="text"
        className="form-control"
        id="key"
        placeholder="Key"
        />
        <br/>
        </div>
        <div className="form-group">
        <label>Nombre de Pyme</label>
        <input
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
        type="text"
        className="form-control"
        id="direccion"
        placeholder="Dirección"
        ></input>
        <br/>
        </div>
        <button>PEDIR EL BOTON SIGUIENTE y el logo y cosito de arriba</button>
        </div>
    </form>
    );
}

export default FormularioConfiguracion01Component;