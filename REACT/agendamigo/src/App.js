import React from "react";
import { BrowserRouter, Routes, Route} from "react-router-dom";
import HomeServicioComponent from "./components/HomeServicioComponent";
import FormularioConfiguracion01Component from "./components/FormularioConfiguracion01Component";



const App = () => {
    return(
    <BrowserRouter>
    <Routes>
        <Route path="/servicio" element={<HomeServicioComponent/>}></Route>
        <Route path="/conf01" element={<FormularioConfiguracion01Component/>}></Route>
    </Routes>
    </BrowserRouter>
    );
};

export default App;