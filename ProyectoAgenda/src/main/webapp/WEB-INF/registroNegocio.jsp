<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 01-07-2022
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro del Negocio</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<h1>Registre su negocio</h1>
<h2>
    <div>
        <form:form action="deberia ir a una especie de perfil" method="post" modelAttribute="negocio">
            <form:label path="nombre" class="form-label">Nombre:</form:label>
            <form:input type="text" class="form-control" path="nombre"/>
            <br>
            <form:label path="rubro" class="form-label">Rubro:</form:label>
            <form:input type="text" class="form-control" path="rubro"/>
            <br>
            <form:label path="direccion" class="form-label">Direccion:</form:label>
            <form:input type="text" class="form-control" path="direccion"/>
            <br>
            <form:label path="telefono" class="form-label">Telefono:</form:label>
            <form:input type="text" class="form-control" path="telefono"/>
            <br>
            <form:label path="email" class="form-label">Email:</form:label>
            <form:input type="text" class="form-control" path="email"/>
            <br>
            <input type="submit" value="Registrar">
        </form:form>
    </div>
</h2>
</body>
</html>
