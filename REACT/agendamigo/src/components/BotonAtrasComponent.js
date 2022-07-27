import { getByDisplayValue } from "@testing-library/react";
import React from "react";
import {useNavigate} from 'react-router-dom'

const BotonAtrasComponent = () => {
    
    const navigate = useNavigate();
    
    const handleOnClickAtrasContacto = (()=> navigate('/registroingreso', {replace:true}, [navigate]))
    
    return(
        <div class="d-grid gap-2 mx-5">
            <button type="submit" className="btn btn-outline-dark"
                style={
                    {backgroundColor: '#E0C0f4',
                    border: 'solid 1px #AC7FC8',
                    borderColor: '#black',
                    width: '',
                    textAlign: 'center',
                    marginBottom: '15px',
                }
                }
                onClick={handleOnClickAtrasContacto}
            >       
            Atrás</button>
        </div>
    )
}

export default BotonAtrasComponent;