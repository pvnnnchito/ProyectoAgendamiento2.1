import axios from "axios";

const baseUrl = "http://localhost:8080/api/disponibilidad"

const getAllDisponibilidad=async()=>{
    const res = await axios.get(baseUrl + "/obtener");
    return res.data;
}

const eliminarDisponibilidad=async(id)=>{
    const res = await axios.post(baseUrl + "/eliminar/"+id);
    return res.data;
}

const guardarDisponibilidad= async(disponibilidad)=>{
    const res = await axios.post(baseUrl + "/guardar",disponibilidad);
    return res.data;
}

export {getAllDisponibilidad,eliminarDisponibilidad,guardarDisponibilidad};