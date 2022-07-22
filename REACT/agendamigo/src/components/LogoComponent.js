import React from "react";
import logo from "../assets/img/logo.png"

const LogoComponent = () => {
    return (
        <div className="text-center"
        style={{
            margin: '40px'
        }}>
            <img src={logo}/>
        </div>
    )
}

export default LogoComponent;