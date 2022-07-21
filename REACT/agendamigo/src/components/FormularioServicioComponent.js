import React,{useState, useEffect} from "react";

//initial values fuera del componente, declarando json
const initialValues = [
    {
        key:'',
        nombreServicio:'',
        duracionServicio:'',
        precioServicio:'',
        prestadorServicio:''
    }
]


const FormularioServicioComponent = ({servicioAdd, servicioEditado, servicioEdit, setServicioEditado}) => {
    
    //1 CONSTANTES
    const [values, setValues] = useState(initialValues);
    //aquí creamos un objeto que nos permite usar a "values" para capturar los datos de los input
    const {key, nombreServicio, duracionServicio, precioServicio, prestadorServicio} = values;
    
    //2 FUNCIONES USE-EFFECT (se corren al menos una vez al recargar la pag)
    useEffect(
        //si [servicioEditado] cambia esto se ejecuta: 
        ()=>{
            //si [servicioEditado] es distinto de null
            if(servicioEditado !== null){
                //cambia los values por lo que trae el servicioEditado
                setValues(servicioEditado);
            }else{//si es null
                //ponle estos valores a values:
                setValues(
                    {
                        key:'',
                        nombreServicio:'',
                        duracionServicio:'',
                        precioServicio:'',
                        prestadorServicio:''
                    }
                );
            }
        }
        ,[servicioEditado])//está pendiente de si este parametro cambia

    //3 FUNCIONES USE-STATE
    //crear una funcion para que recepcione los cambios, para poder actualizar datos y no perderlos
    //las funciones que se ocupan de cambios se empiezan con handle
    const handleInputChange = (e) => {
        //cada vez que tengas un evento (e) realiza esta siguiente funcion:
        const changedFormValue = {
            //manten los valores anteriores
            ...values,
            //y del evento traeme el target con este "name" e ingresame el "value"
            [e.target.name]:e.target.value
        }
        //cambiar el estado
        setValues(changedFormValue);
    };

    //creamos handleSubmit para darle la funcionalidad
    const handleSubmit = (e) => {
        e.preventDefault();
        //tenemos que ir a HomeServicioComponent para crear una funcion de crear servicio
        if(servicioEditado !== null){
            //si el servicioEditado viene lleno edita el servicio de la lista
            servicioEdit(values)
            setValues(initialValues);
        }else{
            //si no viene lleno, agrega a la lista
            servicioAdd(values)
            
        };
        
    };


    return (<>
            <h2 className="d-flex justify-content-center mb-3">{servicioEditado ? "Edita tu servicio":"Agregar nuevo servicio"}</h2>
            {/*se crea el onSubmit para que el botón de abajo tenga funcionalidad*/}
            <form onSubmit={handleSubmit}>
                        <div className="form-group">
                            <label>key</label>
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
                            <label>Nombre del servicio</label>
                            <input
                            type="text"
                            className="form-control"
                            id="nombreServicio"
                            placeholder="Nombre servicio"
                            value={nombreServicio}
                            name='nombreServicio'
                            onChange={handleInputChange}
                            />
                            <br/>
                        </div>
                        <div className="form-group">
                            <label>Duración del servicio (mins)</label>
                            <input
                            type="text"
                            className="form-control"
                            id="duracionServicio"
                            placeholder="Duracion servicio"
                            value={duracionServicio}
                            name='duracionServicio'
                            onChange={handleInputChange}
                            />
                            <br/>
                        </div>
                        <div className="form-group">
                            <label>Precio del servicio</label>
                            <input
                            type="text"
                            className="form-control"
                            id="precioServicio"
                            placeholder="Precio del servicio"
                            value={precioServicio}
                            name='precioServicio'
                            onChange={handleInputChange}
                            />
                            <br/>
                        </div>
                        <div className="form-group">
                            <label>Nombre del prestador</label>
                            <input
                            type="text"
                            className="form-control"
                            id="prestadorServicio"
                            placeholder="Nombre del prestador"
                            value={prestadorServicio}
                            name='prestadorServicio'
                            onChange={handleInputChange}
                            />
                            <br/>
                        </div>
                        <div className="d-flex justify-content-center">
                            <button type="submit" className="btn btn-primary col-6 me-2 mb-5">{servicioEditado ? "Editar servicio":"Registrar servicio"}</button>
                            {servicioEditado ? (<button type="button" className="btn btn-warning col-6 mb-5" onClick={()=>setServicioEditado(null)}>Cancelar</button>):''}
                            
                        </div>
                    </form>
            </>);
};

export default FormularioServicioComponent;