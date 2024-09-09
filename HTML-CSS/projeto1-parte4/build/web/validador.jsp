<%-- 
    Document   : validador
    Created on : 2 de set. de 2024, 10:33:08
    Author     :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>integracao banco de dados</title>
    </head>
    <body>
        <%
            //variaveis
            String password, user;
            Connection connec;
            user = request.getParameter("user");
            password = request.getParameter("password");
            //importa classe
            Class.forName("com.mysql.cj.jdbc.Driver");
            //cria conexão
            connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
            //procura no db
            PreparedStatement pstmt = connec.prepareStatement("SELECT * FROM 'cadastro' WHERE usuario=? AND senha=?");
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            ResultSet resultado = pstmt.executeQuery(); //executa o select
            if(resultado.next()){ //encontrou
                response.sendRedirect("restrito.html");
            }
            else{ //nao encontrou
                out.print("Usuario e/ou senha incorretos");
            }
        %>
    </body>
</html>
