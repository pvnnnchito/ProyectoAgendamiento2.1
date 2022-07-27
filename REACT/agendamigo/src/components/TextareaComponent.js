import React from "react";

const TextareaComponent = () => {
    return(
        <div className="container">
            <div>
                <textarea className="p-2"
                style={{
                    margin: '20px',
                    backgroundColor: '#F5ECFB',
                    width: '90%',
                    border: 'solid 1px #AC7FC8',
                    borderRadius: '10px',
                }}
                placeholder="Deje acá su comentario."/>
            </div>
        </div>  
    )
}

export default TextareaComponent;