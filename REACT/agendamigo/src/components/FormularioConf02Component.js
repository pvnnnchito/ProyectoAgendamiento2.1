import React from "react";
import Select from "react-select";
import FormularioConfiguracion01Component from "./FormularioConfiguracion01Component";

const options = [
    { value: 'siAtiendo', label: 'Si atenderé' },
    { value: 'noAtiendo', label: 'No atenderé' }
]
//OJITO!! para usar el select se debe poner npm install react-select en la terminal
const MyComponent = () => (
    <Select options={options}></Select>
)

export default function TimePickers() {
    const options = options();}

const FormularioConf02Component = ({nombrePyme}) => {

    nombrePyme = '';

    return(
        <form>
            <h2>Un gusto ser tus amigos, {nombrePyme}! Ahora vamos a necesitar que nos digas los horarios en los que atiendes: </h2>
        <div className="form-group">
            {/*el tipo de botón que está en el figma es un toggle pero cuesta mucho hacerlo y no se ve igual el resultado final así que busqué otra opción*/}
        <h4>Lunes</h4>
        <Select options={options}></Select>
        <div className="form-group">
        <form className={options.container} noValidate>
            <label>Hora Apertura</label>
                <input
                    id="time"
                    label="Hora Apertura"
                    type="time"
                    defaultValue="08:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
            <label>Hora Cierre</label>
                <input
                    id="time"
                    label="Hora Cierre"
                    type="time"
                    defaultValue="18:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
        </form>
        </div>
        </div>
        <br></br>
        <div>
            <h4>Martes</h4>
            <Select options={options}></Select>
        <div className="form-group">
        <form className={options.container} noValidate>
            <label>Hora Apertura</label>
                <input //quiero poner los cositos de elegir la hora uno al lado del otro, pero no recuerdo cómo se hace
                    id="time"
                    label="Hora Apertura"
                    type="time"
                    defaultValue="08:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
            <label>Hora Cierre</label>
                <input
                    id="time"
                    label="Hora Cierre"
                    type="time"
                    defaultValue="18:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
        </form>
        </div>
        </div>
        <br></br>
        <div>
            <h4>Miércoles</h4>
        <Select options={options}></Select>
        <div className="form-group">
        <form className={options.container} noValidate>
            <label>Hora Apertura</label>
                <input //quiero poner los cositos de elegir la hora uno al lado del otro, pero no recuerdo cómo se hace
                    id="time"
                    label="Hora Apertura"
                    type="time"
                    defaultValue="08:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
            <label>Hora Cierre</label>
                <input
                    id="time"
                    label="Hora Cierre"
                    type="time"
                    defaultValue="18:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
        </form>
        </div>
        </div>
        <br></br>
        <div>
            <h4>Jueves</h4>
            <Select options={options}></Select>
        <div className="form-group">
        <form className={options.container} noValidate>
            <label>Hora Apertura</label>
                <input //quiero poner los cositos de elegir la hora uno al lado del otro, pero no recuerdo cómo se hace
                    id="time"
                    label="Hora Apertura"
                    type="time"
                    defaultValue="08:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
            <label>Hora Cierre</label>
                <input
                    id="time"
                    label="Hora Cierre"
                    type="time"
                    defaultValue="18:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
        </form>
        </div>
        </div>
        <br></br>
        <div>
            <h4>Viernes</h4>
            <Select options={options}></Select>
        <div className="form-group">
        <form className={options.container} noValidate>
            <label>Hora Apertura</label>
                <input //quiero poner los cositos de elegir la hora uno al lado del otro, pero no recuerdo cómo se hace
                    id="time"
                    label="Hora Apertura"
                    type="time"
                    defaultValue="08:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
            <label>Hora Cierre</label>
                <input
                    id="time"
                    label="Hora Cierre"
                    type="time"
                    defaultValue="18:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
        </form>
        </div>
        </div>
        <br></br>
        <div>
            <h4>Sábado</h4>
            <Select options={options}></Select>
        <div className="form-group">
        <form className={options.container} noValidate>
            <label>Hora Apertura</label>
                <input //quiero poner los cositos de elegir la hora uno al lado del otro, pero no recuerdo cómo se hace
                    id="time"
                    label="Hora Apertura"
                    type="time"
                    defaultValue="08:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
            <label>Hora Cierre</label>
                <input
                    id="time"
                    label="Hora Cierre"
                    type="time"
                    defaultValue="18:30"
                    className={options.textField}
                    InputLabelProps={{
                    shrink: true,
                    }}
                    inputProps={{
                    step: 300, // 5 min
                    }}
        />
        </form>
        </div>
        </div>
        <button>Anterior(no funciona)</button><button>Siguiente(tampoco funciona)</button>
        </form>
        
    );
}

export {FormularioConf02Component, FormularioConfiguracion01Component, MyComponent};