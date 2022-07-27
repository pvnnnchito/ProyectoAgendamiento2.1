import React,{useState, useEffect} from "react";

const RegistroComponent = ({guardarEmpleado}) => {

    const empleadoValues =[
        {
        id:'',
        nombre:'',
        correo:'',
        numeroContacto:'', 
        contraseña:''
    }
    ]

    const [values, setValues] = useState(empleadoValues);
    const {nombre, correo, numeroContacto, contraseña}= values;

    
    const handleSubmit =(e)=>{
        e.preventDefault()
        guardarEmpleado(values)
        
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
                type="text"
                className="form-control"
                placeholder="Ingrese su número de teléfono."
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

export default RegistroComponent;