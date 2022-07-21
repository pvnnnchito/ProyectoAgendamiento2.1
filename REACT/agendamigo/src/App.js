import React from "react";
<<<<<<< HEAD
import { BrowserRouter, Routes, Route} from "react-router-dom";
import HomeServicioComponent from "./components/HomeServicioComponent";
import FormularioConfiguracion01Component from "./components/FormularioConfiguracion01Component";
=======
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import HomeServicioComponent from "./components/HomeServicioComponent";
import OnboardingComponent from "./components/OnboardingComponent";
import ExplicacionConfiguracionComponent from "./components/ExplicacionConfiguracionComponent";

>>>>>>> main



const App = () => {
    return(
    <BrowserRouter>
    <Routes>
<<<<<<< HEAD
        <Route path="/servicio" element={<HomeServicioComponent/>}></Route>
        <Route path="/conf01" element={<FormularioConfiguracion01Component/>}></Route>
    </Routes>
    </BrowserRouter>
    );
=======
        <Route path='/' element={<OnboardingComponent/>}></Route>
        <Route path='/Paso0config' element={<ExplicacionConfiguracionComponent/>}></Route>
        <Route path='/HomeServicio' element={<HomeServicioComponent/>}></Route>

    </Routes>
    </BrowserRouter>);
>>>>>>> main
};

export default App;