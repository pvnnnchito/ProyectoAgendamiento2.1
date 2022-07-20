import React from "react";

const SelectorListaComponent = () => {
    return (<>
                {/*!-- botón GRANDE: tipo de ordenamiento*/}
                <div id="selectorFiltro" class="btn-group mb-2">
                        <button class="btn btn-warning btn-lg dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Servicios
                        </button>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Servicios</a></li>
                            <li><a class="dropdown-item" href="#">Empleados</a></li>
                            <li><a class="dropdown-item" href="#">Clientes</a></li>
                        </ul>
                        
                        
                    </div>
    </>)
};

export default SelectorListaComponent;