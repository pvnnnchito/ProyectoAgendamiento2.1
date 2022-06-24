<%--
  Created by IntelliJ IDEA.
  User: hob
  Date: 22-06-22
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Mostrar Empleados</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
</head>
<body>

<div class="container">

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="empleado" items="${empleadosCapturados}" >
            <tr>
                <th>id</th>
                <th scope="row">${empleado.id}</th>
                <td>${empleado.nombre}</td>
                <td>${empleado.apellido}</td>
                <td><a class="btn btn-warning" href="/empleado/editar/${empleado.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/empleado/eliminar/${empleado.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
