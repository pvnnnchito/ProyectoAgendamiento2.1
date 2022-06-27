<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Cliente</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>

            <body>
                <div class="container">
                    <c:if test="${msgError!= null}">
                        <c:out value="${msgError}"></c:out>
                    </c:if>
                    <form:form action="/cliente/guardar" method="post" modelAttribute="cliente">

                        <form:label path="nombre">Nombre Completo:</form:label>
                        <form:input path="nombre" placeholder="Nombre Apellido" />
                        <br>
                        <form:label path="telefono">Telefono:</form:label>
                        <form:input type="tel" path="telefono" placeholder="569xxxxxxxx" />
                        <br>
                        <form:label path="correo">Correo:</form:label>
                        <form:input type="email" path="correo" placeholder="correo@correo.com" />
                        <br>
                        <button type="submit" class="btn btn-primary">Guardar Auto</button>
                    </form:form>

                </div>

            </body>

            </html>