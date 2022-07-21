import React from "react";

const BotonConocenosComponent = () => {
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
            Conócenos</button>
    </div>
    )
}

export default BotonConocenosComponent;