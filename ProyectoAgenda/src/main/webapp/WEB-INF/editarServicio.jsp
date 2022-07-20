<%--
  Created by IntelliJ IDEA.
  User: luism
  Date: 22-06-2022
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- tenemos que agregar los TAGLIB sino no funciona el formato -->

<html>
<head>
    <title>Servicio</title>
    <!-- agregamos el link para que funcione bootstrap -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>

<body>
<h1>Hola, por favor edita tu servicio:</h1>

<div>
    <c:if test="${msgError!= null }">
        <c:out value="${msgError}"></c:out>
    </c:if>

    <%--@elvariable id="servicio" type="java"--%>
    <form:form action="/servicio/actualizar/${servicio.id}" method="post" modelAttribute="servicio">

        <form:label path="nombreServicio" class="form-label">Nombre del servicio: </form:label>
        <form:input path="nombreServicio" class="form-control"/>
        <br> <!-- saldo de linea -->
        <form:label path="duracion" class="form-label">Duración del servicio en mins.: </form:label>
        <form:input type="number" path="duracion" class="form-control"/>
        <br>
        <!-- submit para el envío de información -->
        <button type="submit" class="btn btn-warning">Editar servicio</button>
    </form:form>

</div>
</body>
</html>
