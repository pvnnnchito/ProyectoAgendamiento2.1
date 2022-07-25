import React from "react";

/* AgendaEmpleado */
const AgendaEmpleadosComponent = ({ empleado, empleadoDelete }) => {
    return (
        <>
            <div className="container-fluid p-5 position-relative ">

                <div className="card shadow" style={{ backgroundColor: "#F5ECFB", color: "#6303A0" }}>
                    <div className="card-body" style={{ color: "#6303A0", backgroundColor: "transparent", borderColor: "#6303A0" }} >
                        <div className="fs-1 mb-3" >
                            {empleado.nombre}
                        </div>
                        <div>{empleado.telefono}</div>
                        <div>{empleado.correo}</div>
                        <hr />
                    </div>
                    <div className="d-flex justify-content-end">
                        <button className="btn btn-sm btn-outline-danger " onClick={() => empleadoDelete(empleado.id)}>
                            Eliminar
                        </button>
                    </div>
                </div>
                <div class="position-fixed start-50 bottom-0 translate-middle-x mt-4 mb-4 ">
                    <a style={{
                        background: "#AC7FC8",
                        color: "aliceblue",
                    }}
                        class="btn btn-light "
                        role="button"
                    >Ingresar</a>
                </div>

            </div>
        </>
    );
}

/* AgendaServicio */
const AgendaServiciosComponent = ({servicio, servicioDelete}) => {
    return (
        <>
            <div className="container-fluid p-5 position-relative ">

                <div className="card shadow" style={{ backgroundColor: "#F5ECFB", color: "#6303A0" }}>
                    <div className="card-body" style={{ color: "#6303A0", backgroundColor: "transparent", borderColor: "#6303A0" }} >
                        <div className="fs-1 mb-3" >
                            {servicio.nombreServicio}
                        </div>
                        <p className="fs-3">{servicio.precio} CLP</p>
                        <div>{servicio.duracion} Minutos</div>
                        <hr />
                    </div>
                    <div className="d-flex justify-content-end">
                        <button className="btn btn-sm btn-outline-danger " onClick={() => servicioDelete(servicio.id)}>
                            Eliminar
                        </button>
                    </div>
                </div>
                <div class="position-fixed start-50 bottom-0 translate-middle-x mt-4 mb-4 ">
                    <a style={{
                        background: "#AC7FC8",
                        color: "aliceblue",
                    }}
                        class="btn btn-light "
                        role="button"
                    >Ingresar</a>
                </div>

            </div>
        </>
    );
}

/* AgendaClientes */
const AgendaClientesComponent = ({cliente,clienteDelete}) => {
    return (
        <>
            <div className="container-fluid p-5 position-relative ">

                <div className="card shadow" style={{ backgroundColor: "#F5ECFB", color: "#6303A0" }}>
                    <div className="card-body" style={{ color: "#6303A0", backgroundColor: "transparent", borderColor: "#6303A0" }} >
                        <div className="fs-1 mb-3" >
                            {cliente.nombre}
                        </div>
                        <div>{cliente.telefono}</div>
                        <div>{cliente.correo}</div>
                        <hr />
                    </div>
                    <div className="d-flex justify-content-end">
                        <button className="btn btn-sm btn-outline-danger " onClick={() => clienteDelete(cliente.id)}>
                            Eliminar
                        </button>
                    </div>
                </div>
                <div class="position-fixed start-50 bottom-0 translate-middle-x mt-4 mb-4 ">
                    <a style={{
                        background: "#AC7FC8",
                        color: "aliceblue",
                    }}
                        class="btn btn-light "
                        role="button"
                    >Ingresar</a>
                </div>

            </div>
        </>
    );
}

export { AgendaClientesComponent, AgendaEmpleadosComponent, AgendaServiciosComponent };