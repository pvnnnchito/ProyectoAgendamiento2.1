import React,{useCallback} from "react";
import {useNavigate} from 'react-router-dom'

const BotonRegistroCliente = () => {
    return(
        <div class="d-grid gap-2 mx-5">
            <button type="submit" className="btn btn-outline-light"
                style={
                    {backgroundColor: '#AC7FC8',
                    border: 'solid 1px #AC7FC8',
                    borderColor: '#black',
                    width: '',
                    textAlign: 'center',
                    marginBottom: '15px'
                }
                }
            >       
            Registrar Cliente</button>
        </div>
    )
}

export default BotonRegistroCliente;