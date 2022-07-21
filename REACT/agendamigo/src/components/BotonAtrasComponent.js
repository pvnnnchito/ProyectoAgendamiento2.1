import { getByDisplayValue } from "@testing-library/react";
import React from "react";

const BotonAtrasComponent = () => {
    return(
        <div className="text-center">
            <button type="submit" className="btn btn-outline-dark"
                style={
                    {backgroundColor: '#E0C0f4',
                    border: 'solid 1px #AC7FC8',
                    borderColor: '#black',
                    width: '15%',
                    textAlign: 'center',
                    marginBottom: '15px',
                }
                }
            >       
            Atrás</button>
        </div>
    )
}

export default BotonAtrasComponent;