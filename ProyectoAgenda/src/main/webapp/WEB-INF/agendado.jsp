<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 22-06-2022
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servicio Agendado</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Cita</th>
            <th scope="col">Servicio</th>
            <th scope="col">Acciones</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="servicioAgendado" items="${listaAgenda}">
            <tr>
                <th scope="row">${auto.id}</th>
                <td>${auto.marca}</td>
                <td>${auto.modelo}</td>
                <td>${auto.color}</td>
                <td>${auto.cilindrada}</td>
                <td><a class="btn btn-warning" href="/auto/editar/${auto.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/auto/eliminar/${auto.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</body>
</html>
