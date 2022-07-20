import React from "react";

const TarjetaServicioComponent = ({servicio, tarjetaServicioDelete, setServicioEditado}) => {
    return (<>
            <div className="card mb-2">
                        <div className="card-body">
                            <h3 className="card-title">{servicio.nombreServicio}</h3>
                            <p>Precio: {servicio.precioServicio}</p>
                            <p>Duración (mins): {servicio.duracionServicio}</p>
                            <p>Prestador: {servicio.prestadorServicio}</p>
                            <hr/>
                            <div className="d-flex justify-content-end">
                                <button className="btn btn-sm btn-warning ms-2"onClick={()=>setServicioEditado(servicio)}>Editar</button>
                                <button className="btn btn-sm btn-danger ms-2" onClick={()=>tarjetaServicioDelete(servicio.key)}>Eliminar</button>
                            </div>
                        </div>
                    </div>
            </>)
};

export default TarjetaServicioComponent;