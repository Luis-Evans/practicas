<%-- 
    Document   : index
    Created on : 25/08/2017, 04:42:47 PM
    Author     : emanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script>
        function una() {
            var algo = document.getElementById("boton");
            algo.submit();
        }
    </script>
    <body onload="una()">
        <form action="http://localhost:8080/Serv/Hello" method="post" id="boton">
            <input type="submit" value="Ver hola mundo">
        </form>
    </body>
</html>
