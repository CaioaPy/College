<%-- 
    Document   : salvar_produtos
    Created on : 7 de out. de 2024, 09:33:53
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
            ResultSet resultado = st.executeQuery();
            if(resultado.next()) {
        %>
        <form>
            <p>
                <label for="c">Código</label>
                <input id="c" type="text" name="codigo" size="10" maxlength="10" value="<%= resultado.getString("codigo")%>" readonly>
            </p>
            <p>
                <label for="n">Nome</label>
                <input id="n" type="text" name="nome" size="40" maxlength="40" value="<%= resultado.getString("nome")%>">
            </p>
            <p>
                <label for="m">Marca</label>
                <input id="m" type="text" name="marca" size="40" maxlength="40" value="<%= resultado.getString("marca")%>">
            </p>
            <p>
                <label for="p">Preço</label>
                <input id="p" type="number" name="preco" min="0" step="0.01" value="<%= resultado.getString("preco")%>" required>
            </p>
            <p>
                <label for="d">Data de fabricação</label>
                <input id="d" type="date" name="data_fab" value="<%= resultado.getString("data_fab")%>">
            </p>
            <p>
                <input type="submit" value="Salvar alterações">
            </p>
        </form>
        <% } else{
            out.print("Produto não localizado");
    }   %>
    </body>
</html>
 