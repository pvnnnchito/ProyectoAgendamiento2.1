<%--
  Created by IntelliJ IDEA.
  User: hob
  Date: 07-07-22
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servicio</title>
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    <script>
        $.get('http://localhost:8080/api/obtener/servicio', function(respuesta) {

            for (let i = 0; i < respuesta.length; i++) {
                console.log(respuesta[i]);
            }
        }, 'json');
    </script>
</head>
<body>

</body>
</html>
