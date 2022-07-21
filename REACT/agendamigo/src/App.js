import React from "react";
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import HomeServicioComponent from "./components/HomeServicioComponent";
import OnboardingComponent from "./components/OnboardingComponent";
import ExplicacionConfiguracionComponent from "./components/ExplicacionConfiguracionComponent";




const App = () => {
    return(
    <BrowserRouter>
    <Routes>
        <Route path='/' element={<OnboardingComponent/>}></Route>
        <Route path='/Paso0config' element={<ExplicacionConfiguracionComponent/>}></Route>
        <Route path='/HomeServicio' element={<HomeServicioComponent/>}></Route>

    </Routes>
    </BrowserRouter>);
};

export default App;