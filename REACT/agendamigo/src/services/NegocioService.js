import axios from "axios";

const baseUrl = "http://localhost:8080/api/negocio";

/* Obtencion de los datos Negocio */
const getAllNegocio =async()=>{
    const res = await axios.get(baseUrl + "/obtener");
    return res.data;
}

/* Eliminacion de datos Negocio */
const eliminarNegocio=async(id)=>{
    const res = await axios.post(baseUrl + "/eliminar/"+id);
    return res.data;
}

/* Guardado de datos Negocio */
const guardarNegocio=async(negocio)=>{
    const res = await axios.post(baseUrl + "/guardar",negocio);
    return res.data;
}

export {getAllNegocio, eliminarNegocio, guardarNegocio};