<%-- 
    Document   : validador
    Created on : 2 de set. de 2024, 10:33:08
    Author     :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>integracao banco de dados</title>
    </head>
    <body>
        <%
            //variaveis
            String p, u;
            Connection connec;
            u = request.getParameter("user");
            p = request.getParameter("password");
            //importa classe
            Class.forName("com.mysql.cj.jdbc.Driver");
            //cria conexão
            connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            //procura no db
            PreparedStatement st = connec.prepareStatement("SELECT * FROM users WHERE usuario=? AND senha=?");
            st.setString(1, u);
            st.setString(2, p);
            ResultSet resultado = st.executeQuery(); //executa o select
            if(resultado.next()){ //encontrou
                response.sendRedirect("restrito.jsp");
            }
            else{ //nao encontrou
                out.print("Usuario e/ou senha incorretos");
            }
        %>
    </body>
</html>
