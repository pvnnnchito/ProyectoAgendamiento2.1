import React from "react";
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import HomeServicioComponent from "./components/HomeServicioComponent";
import OnboardingComponent from "./components/OnboardingComponent";
import ExplicacionConfiguracionComponent from "./components/ExplicacionConfiguracionComponent";
import FormularioServicioComponent from "./components/FormularioServicioComponent";
import FormularioConfiguracion01Component from "./components/FormularioConfiguracion01Component";




const App = () => {

    return(
    <BrowserRouter>
    <Routes>
        <Route path='/' element={<OnboardingComponent/>}></Route>
        <Route path='/Paso0config' element={<ExplicacionConfiguracionComponent/>}></Route>
        <Route path='/HomeServicio' element={<HomeServicioComponent/>}></Route>
        <Route path="/Config01" element={<FormularioConfiguracion01Component/>}></Route>
        <Route path="/FormularioService" element={<FormularioServicioComponent/>}></Route>

    </Routes>
    </BrowserRouter>);
};

export default App;