import React from "react";
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import HomeServicioComponent from "./components/HomeServicioComponent";
import OnboardingComponent from "./components/OnboardingComponent";
import ExplicacionConfiguracionComponent from "./components/ExplicacionConfiguracionComponent";
import PymeRegistroComponent from "./components/PymeRegistroComponent";
import ContactoComponent from "./components/ContactoComponent";
import RegistroOIngresoComponent from "./components/RegistroOIngresoComponent"





const App = () => {

    return(
    <BrowserRouter>
    <Routes>
        <Route path='/' element={<OnboardingComponent/>}></Route>
        <Route path='/contacto' element={<ContactoComponent/>}></Route>
        <Route path='/registroingreso' element={<RegistroOIngresoComponent/>}></Route>
        <Route path='/pymeregistro' element={<PymeRegistroComponent/>}></Route>
        <Route path='/paso0config' element={<ExplicacionConfiguracionComponent/>}></Route>
        <Route path='/HomeServicio' element={<HomeServicioComponent/>}></Route>
        <Route path='' element={<OnboardingComponent/>} />

    </Routes>
    </BrowserRouter>);
};

export default App;