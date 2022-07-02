<%--
  Created by IntelliJ IDEA.
  User: luism
  Date: 22-06-2022
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>SERVICIOS REGISTRADOS</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<div class="container">
    <!-- formulario de busqueda -->
    <form action="/servicio/buscar" method="post">
        <label for="categoria">Filtrar por categoría:</label>
        <input type="text" id="categoria" name="categoria">

        <input type="submit" value="Buscar" class="btn btn-primary">
    </form>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nombre del servicio:</th>
            <th scope="col">Duración en mins.:</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach var="servicio" items="${serviciosRegistrados}">
            <tr>
                <th scope="row">${servicio.id}</th>
                <td>${servicio.nombreServicio}</td>
                <td>${servicio.duracion}</td>
                <td><a class="btn btn-warning" href="editar/${servicio.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="eliminar/${servicio.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
    <a class="btn btn-primary" href="/servicio" role="button">Agregar nuevo servicio</a>
</div>
</body>
</html>
