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
                <title>MostrarClientes</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>

            <body>
                <div class="container">

                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Telefono</th>
                                <th scope="col">Correo</th>

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="cliente" items="${clienteCapturados}">
                                <tr>
                                    <th scope="row">${cliente.id}</th>
                                    <td>${cliente.nombre}</td>
                                    <td>${cliente.telefono}</td>
                                    <td>${cliente.correo}</td>

                                    <td><a class="btn btn-warning" href="/auto/editar/${cliente.id}" role="button">Editar</a></td>
                                    <td><a class="btn btn-danger" href="/auto/eliminar/${cliente.id}" role="button">Eliminar</a></td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

            </body>

            </html>