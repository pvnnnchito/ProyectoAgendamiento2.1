import axios from "axios";

const baseUrl = "http://localhost:8080/api/empleado";

/* Obtencion de los datos Empleado */
const getAllEmpleado = async()=>{
    const res = await axios.get(baseUrl + "/obtener");
    return res.data;
}

/* Eliminacion de datos Empleado */
const eliminarEmpleado=async(id)=>{
    const res = await axios.post(baseUrl + "/eliminar/"+id);
    return res.data;
}

/* Guardado de datos Empleado */
const guardarEmpleado =(empleado)=>{
    const res = await axios.post(baseUrl + "/guardar", empleado);
    return res.data;
}

export {getAllEmpleado, eliminarEmpleado, guardarEmpleado};