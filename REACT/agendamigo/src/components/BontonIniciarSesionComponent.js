import React from "react";

const BotonIniciarSesionComponent = () => {
    return(
        <div className="text-center">
            <button type="submit" className="btn btn-outline-dark"
                style={
                    {backgroundColor: '#E0C0f4',
                    border: 'solid 1px #AC7FC8',
                    borderColor: '#black',
                    width: '20%',
                    textAlign: 'center',
                    marginBottom: '15px'
                }
                }
            >       
            Iniciar sesión</button>
    </div>
    )
}

export default BotonIniciarSesionComponent;