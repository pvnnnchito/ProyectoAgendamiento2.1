import axios from "axios";

const baseUrl = "http://localhost:8080/api/cliente";

/* Obtencion de los datos Cliente */
const getAllCliente = async()=>{
    const res = await axios.get(baseUrl + "/obtener");
    return res.data;
}

/* Eliminacion de datos Cliente */
const eliminarCliente = async(id)=>{
    const res = await axios.post(baseUrl + "/eliminar/"+id);
    return res.data;
}

/* Guardado de datos Cliente */
const guardarCliente=async(cliente)=>{
    const res = await axios.post(baseUrl +"/guardar", cliente);
    return res.data;
}

export {getAllCliente, eliminarCliente, guardarCliente};