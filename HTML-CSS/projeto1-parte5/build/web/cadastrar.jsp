<%-- 
    Document   : cadastrar
    Created on : 9 de set. de 2024, 09:33:53
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String password, user, nome;
            user = request.getParameter("user");
            password = request.getParameter("password");
            nome = request.getParameter("nome");
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
        %>
    </body>
</html>
