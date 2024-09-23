<%-- 
    Document   : salvar_produtos
    Created on : 23 de set. de 2024, 09:33:53
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <%
            String c, n, m,d;
            Double p;
            Connection connec;
            c = request.getParameter("codigo");
            n = request.getParameter("nome");
            m = request.getParameter("marca");
            p = Double.parseDouble(request.getParameter("preco"));
            d = request.getParameter("dataFabricacao");
            Class.forName("com.mysql.cj.jdbc.Driver");

            //cria conexão
            connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            //cria o holder de comandos
            PreparedStatement st;
            //query
            String query = "insert into produtos(codigo, nome, marca, preco, data_fab) values(?,?,?,?,?)";
            //prenche os valores e executa a query
            st = connec.prepareStatement(query);
            st.setString(1, c);
            st.setString(2, n);
            st.setString(3, m);
            st.setDouble(4, p);
            st.setString(5, d);
            st.executeUpdate();
            out.print("Cadastro realizado com sucesso");
        %>
    </body>
</html>
 