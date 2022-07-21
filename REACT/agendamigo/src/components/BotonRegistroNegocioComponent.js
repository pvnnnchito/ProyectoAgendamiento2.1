import React from "react";

const BotonRegistroNegocioComponent = () => {
    return(
        <div className="text-center">
            <button type="submit" className="btn btn-outline-light"
                style={
                    {backgroundColor: '#AC7FC8',
                    border: 'solid 1px #AC7FC8',
                    borderColor: '#black',
                    width: '25%',
                    textAlign: 'center',
                    marginBottom: '15px'
                }
                }
            >       
            Registrar negocio</button>
        </div>
    )
}

export default BotonRegistroNegocioComponent;