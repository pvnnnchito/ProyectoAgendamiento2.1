import axios from "axios";

const baseUrl = "http://localhost:8080/api/servicio";

/* Obtencion de los datos Servicios */
const getAllServicio =async()=>{
    const res = await axios.get(baseUrl + "/obtener");
    return res.data;
}

/* Eliminacion de datos Servicio */
const eliminarServicio=async(id)=>{
    const res = await axios.post(baseUrl + "/eliminar/"+id);
    return res.data
}

/* Guardado de datos Servicio */
const guardarServicio=async(servicio)=>{
    const res = await axios.post(baseUrl + "/guardar",servicio);
    return res.data;
}

export {getAllServicio,eliminarServicio,guardarServicio};