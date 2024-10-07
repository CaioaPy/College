<%-- 
    Document   : consulta
    Created on : 30 de set. de 2024, 08:41:59
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
        <title>Consulta</title>
    </head>
    <body>
        <%
            //variaveis
            String c;
            Connection connec;
            c = request.getParameter("codigo");
            //importa classe
            Class.forName("com.mysql.cj.jdbc.Driver");
            //cria conexão
            connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            //procura no db
            PreparedStatement st = connec.prepareStatement("SELECT * FROM produtos WHERE codigo=?");
            st.setString(1, c);
            ResultSet resultado = st.executeQuery(); //executa o select
            if(resultado.next()){ //encontrou
                out.print("Codigo: " + resultado.getString("codigo") + "<br>");
                out.print("Nome: " + resultado.getString("nome") + "<br>");
                out.print("Marca: " + resultado.getString("marca") + "<br>");
                out.print("Preço: " + resultado.getString("preco") + "<br>");
                out.print("Fabricação: " + resultado.getString("data_fab"));
            }
            else{ //nao encontrou
                out.print("Código não encontrado ou incorreto");
            }
        %>
    </body>
</html>
