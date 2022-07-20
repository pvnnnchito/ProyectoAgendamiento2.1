<%--
  Created by IntelliJ IDEA.
  User: hob
  Date: 22-06-22
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<div>
    <c:if test="${msgError != null}">
        <c:out value="${msgError}"></c:out>
    </c:if>
    <%--@elvariable id="empleado" type="Java"--%>
    <form:form action="/empleado/guardar" method="post" modelAttribute="empleado">
        <form:label path="nombre">Nombre:</form:label>
        <form:input path="nombre" placeholder="Ingrese su nombre"/>
        <br>
        <form:label path="apellido">Apellido:</form:label>
        <form:input path="apellido" placeholder="Ingrese su apellido"/>
        <br>
        <button type="submit">Guardar Empleado</button>
    </form:form>
</div>
</body>
</html>
