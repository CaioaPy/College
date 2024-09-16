<%-- 
    Document   : cadastrar
    Created on : 9 de set. de 2024, 09:33:53
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <%
            String u, p, n;
            Connection connec;
            u = request.getParameter("user");
            p = request.getParameter("password");
            n = request.getParameter("nome");
            Class.forName("com.mysql.cj.jdbc.Driver");

            //cria conexão
            connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            //cria o holder de comandos
            PreparedStatement st;
            //query
            String query = "insert into users(usuario, senha, nome) values(?,?,?)";
            //prenche os valores e executa a query
            st = connec.prepareStatement(query);
            st.setString(1, u);
            st.setString(2, p);
            st.setString(3, n);
            st.executeUpdate();
            out.print("Cadastro realizado com sucesso")
        %>
        <p>
            <a href="index.html">Logar</a>    
        </p>    

    </body>
</html>
 