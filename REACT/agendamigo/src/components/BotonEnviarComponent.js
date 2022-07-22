import React from "react";

const BotonEnviarComponent = () => {

    //con la esperanza de poner un submit de alguna forma
    const handleOnClickEnviarSolicitud = "";

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
                //dandole al botón una funcion on click
                onClick = {handleOnClickEnviarSolicitud}
            >       
            Enviar</button>
        </div>
        )
}

export default BotonEnviarComponent;