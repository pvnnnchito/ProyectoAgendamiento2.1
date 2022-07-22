import React,{useCallback} from "react";
import {useNavigate} from 'react-router-dom'

const SelectorListaComponent = () => {

    const navigate = useNavigate();

    const handleOnClick = useCallback(()=> navigate('/', {replace:true}, [navigate]))

    return (<>
                {/*!-- botón GRANDE: tipo de ordenamiento*/}
                <div id="selectorFiltro" class="btn-group mb-2">
                        <button class="btn btn-warning btn-lg dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Servicios
                        </button>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" onClick={handleOnClick}>Servicios</a></li>
                            <li><a class="dropdown-item" onClick={handleOnClick}>Empleados</a></li>
                            <li><a class="dropdown-item" onClick={handleOnClick}>Clientes</a></li>
                        </ul>
                        
                        
                    </div>
    </>)
};

export default SelectorListaComponent;