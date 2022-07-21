import React,{useState, useEffect} from "react";

const initialValues = [
    {
        key:'',
        nombre_pyme:'',
        numero_contacto:'',
        rubro:'',
        numero_empleados:'',
        direccion:''
    }
]

const FormularioConfiguracion01Component = ({conf01Add, conf01Editado, conf01Edit, }) => {
    const [values, setValues] = useState(initialValues);
    const {key, nombre_pyme, numero_contacto, rubro, numero_empleados, direccion} = values;

    useEffect(
        ()=>{
            if(conf01Editado !== null){
                setValues(conf01Editado)
            }else{
                setValues({
                    key:'',
                    nombre_pyme:'',
                    numero_contacto:'',
                    rubro:'',
                    numero_empleados:'',
                    direccion:''
                })
            }
        }
        ,[conf01Editado]);

        const handleInputChange=(e)=>{

            const changedFormValue={
                ...values,
                [e.target.name]:e.target.value
            }
            setValues(changedFormValue)
        }

        const handleSubmit =(e)=>{
            e.preventDefault();
            if(conf01Editado !== null){
                conf01Edit(values)
            }else{
                conf01Add(values)
            }
            
        }


    return(
    <form onSubmit={handleSubmit}>
        <h1>¡Bienvenid@! Para comenzar por favor registre los datos de su pyme:</h1>
        <div>
        <div className="form-group">
        <label>Nombre de Pyme</label>
        <input
        type="text"
        className="form-control"
        id="key"
        placeholder="Key"
        value={key}
        name='key'
        onChange={handleInputChange}
        />
        <br/>
        </div>
        <div className="form-group">
        <label>Nombre de Pyme</label>
        <input
        type="text"
        className="form-control"
        id="nombre_pyme"
        placeholder="Nombre Pyme"
        value={nombre_pyme}
        name='nombre_pyme'
        onChange={handleInputChange}
        />
        <br/>
        </div>
        <div className="form-group">
        <label>Número de contacto</label>
        <input
        type="text"
        className="form-control"
        id="numero_contacto"
        placeholder="Número contacto"
        value={numero_contacto}
        name='numero_contacto'
        onChange={handleInputChange}
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
        value={rubro}
        name='rubro'
        onChange={handleInputChange}
        />
        <br/>
        </div>
        <div className="form-group">
        <label>Número de empleados</label>
        <input
        type="number"
        className="form-control"
        id="numero_empleados"
        placeholder="Número empleados"
        value={numero_empleados}
        name='numero_empleados'
        onChange={handleInputChange}
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
        value={direccion}
        name='direccion'
        onChange={handleInputChange}
        ></input>
        <br/>
        </div>
        <button>PEDIR EL BOTON SIGUIENTE y el logo y cosito de arriba</button>
        </div>
    </form>
    );
}

export default FormularioConfiguracion01Component;