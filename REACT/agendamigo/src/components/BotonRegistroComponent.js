import React from "react";
import {useNavigate} from 'react-router-dom'

const BotonRegistroComponent = () => {

    const navigate = useNavigate();
    
    const handleOnClickRegistroPymeFinal = (()=> navigate('/paso0config', {replace:true}, [navigate]))

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
                onClick={handleOnClickRegistroPymeFinal}
            >       
            Registrarse</button>
        </div>
    )
}

export default BotonRegistroComponent;