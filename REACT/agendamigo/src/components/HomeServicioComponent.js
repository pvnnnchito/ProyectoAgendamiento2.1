import React,{useState} from "react";
import TarjetaServicioComponent from "./TarjetaServicioComponent";
import FormularioServicioComponent from "./FormularioServicioComponent";
import NombreNegocioComponent from "./NombreNegocioComponent";
import SelectorListaComponent from "./SelectorListaComponent";

/*const servicio1 = {
    nombreServicio: 'Corte de Cabello',
    duracionServicio: '30 mins',
    precioServicio: '$15.990',
    prestadorServicio: 'Leonardo Utreras'
}
const servicio2 = {
    nombreServicio: 'Corte de Barba',
    duracionServicio: '10 mins',
    precioServicio: '$9.990',
    prestadorServicio: 'Francisco Cid'
}*/

const initialServicios = [
    {
        key: '1',
        nombreServicio: 'Corte de Cabello',
        duracionServicio: '30 mins',
        precioServicio: '$15.990',
        prestadorServicio: 'Luis Mejías'
    },
    {
        key: '2',
        nombreServicio: 'Corte de Barba',
        duracionServicio: '10 mins',
        precioServicio: '$9.990',
        prestadorServicio: 'Francisco Cid'
    },
    {
        key: '3',
        nombreServicio: 'Uñas y maquillaje',
        duracionServicio: '20 mins',
        precioServicio: '$15.990',
        prestadorServicio: 'Mary Aedo'
    },
    {
        key: '4',
        nombreServicio: 'Colorizado de Cabello',
        duracionServicio: '60 mins',
        precioServicio: '$15.990',
        prestadorServicio: 'Leonardo Utreras'
    },
    {
        key: '5',
        nombreServicio: 'Lavado de Cabello',
        duracionServicio: '15 mins',
        precioServicio: '$15.990',
        prestadorServicio: 'Francisco Perez'
    },
    {
        key: '6',
        nombreServicio: 'Depilación',
        duracionServicio: '30 mins',
        precioServicio: '$19.990',
        prestadorServicio: 'Ignacio Romero'
    }
]

const HomeServicioComponent = () => {
    //hooks dentro de los componentes
    const [servicios, setServicios] = useState(initialServicios)

    //usamos state para iniciar la edicion, lo instanciamos como null porque no tenemos un servicio que editar antes de tocar el boton de editar
    //el primer estado es el estado null, el segundo es la función que cambiará el servicio
    const [servicioEditado, setServicioEditado] = useState(null);

    const tarjetaServicioDelete = (servicioKey) => {
        const changedServicios = servicios.filter(serv => serv.key !== servicioKey)
        setServicios(changedServicios)
    };

    //le pedimos que nos entregue un servicio
    const servicioAdd = (servicio) => {
        const addServicio = [
            ...servicios,
            servicio
        ]
        setServicios(addServicio)
    };

    const servicioEdit = (servicioEditado) => {
        const changedServicios = servicios.map(serv => (serv.key === servicioEditado.key ? servicioEditado : serv))
        setServicios(changedServicios);
    };

    return (<>
                <NombreNegocioComponent/>
                <div className="container mt-3 ms-3 me-2">
                    <div className="row">
                        <div className="col-11 mt-3">
                        <SelectorListaComponent/>
                        {
                            servicios.map(servicio => <TarjetaServicioComponent
                                                        key={servicio.key}
                                                        servicio={servicio}
                                                        tarjetaServicioDelete={tarjetaServicioDelete}
                                                        setServicioEditado={setServicioEditado}
                                                        />)
                        }
                        </div>
                    <div className="col-11 mt-3 mb-5" style={{ position: "fixed"}}>
                        <p className="d-flex justify-content-end">
                            <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#collapseServicio" aria-expanded="false" aria-controls="collapseServicio">
                                Agregar Servicio
                            </button>
                        </p>
                        <div class="collapse" id="collapseServicio">
                            <div class="card card-body">
                                <FormularioServicioComponent
                                servicioAdd={servicioAdd}
                                servicioEditado={servicioEditado}
                                servicioEdit={servicioEdit}
                                setServicioEditado={setServicioEditado}
                                />
                            </div>
                        </div>
                            
                    </div>
                </div>
            </div>
            </>);
};

export default HomeServicioComponent;