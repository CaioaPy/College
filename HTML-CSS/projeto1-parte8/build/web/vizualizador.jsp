<%-- 
    Document   : vizualizador
    Created on : 30 de set. de 2024, 09:18:52
    Author     :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vizualizador</title>
        <link rel="stylesheet" href="tabelas.css">
    </head>
    <body>
        <h1>Lista completa dos produtos</h1>
        <%
            Connection connec;
            //importa classe
            Class.forName("com.mysql.cj.jdbc.Driver");
            //cria conexão
            connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            //procura no db
            PreparedStatement st = connec.prepareStatement("SELECT * FROM produtos");
            ResultSet resultado = st.executeQuery(); //executa o select
            out.print("<table>");
            out.print("<tr><th> Codigo do produto </th><th> Nome </th><th> Marca </th><th> Preço </th><th> Data de fabricação </th><th> Alteração </th><th> Exclusão </th>");
            while(resultado.next()){
                out.print("<tr><td>" + resultado.getString("codigo") + "</td>" +
                "<td>" + resultado.getString("nome") + "</td>" +
                "<td>" + resultado.getString("marca") + "</td>" + 
                "<td>" + resultado.getString("preco") + "</td>" + 
                "<td>" + resultado.getString("data_fab") + "</td>");
                out.print("<td><a href=excluir.jsp?codigo=" + resultado.getString("codigo") + ">Excluir</a></td>");
                out.print("<td><a href=editor.jsp?codigo=" + resultado.getString("codigo") + ">Alterar</a></td></tr>");
            
            }
            out.print("</table>");
        %>
    </body>
</html>
