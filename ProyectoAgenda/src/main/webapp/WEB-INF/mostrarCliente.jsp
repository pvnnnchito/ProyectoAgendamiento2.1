<%--
  Created by IntelliJ IDEA.
  User: hob
  Date: 27-06-22
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Clientes</title>
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
            <th scope="col">ID</th>
            <th scope="col">Nombre</th>
            <th scope="col">Telefono</th>
            <th scope="col">Correo</th>
        </tr>
        </thead>
        <c:forEach var="cliente" items="${clientesCapturados}" >
            <tr>
                <th>id</th>
                <th scope="row">${cliente.id}</th>
                <td>${cliente.nombre}</td>
                <td>${cliente.telefono}</td>
                <td>${cliente.correo}</td>
                <td><a class="btn btn-warning" href="/cliente/editar/${cliente.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/cliente/eliminar/${cliente.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
