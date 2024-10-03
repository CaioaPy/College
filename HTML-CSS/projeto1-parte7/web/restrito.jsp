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
        <title>Home empresar :3</title>
        <link rel="stylesheet" href="indexo.css">
    </head>
    <body>
        <header> 
            <div class="logo">
                <a href="index.html"><img src="logo.png" alt="logotipo generio de tecnologia"> </a>
            </div>
            <div class="slogan">
                <h1>
                    Bem vindo, <%= request.getParameter("nome")%>
                </h1>
            </div>
            <div class="Saiba">
                <button onclick="location.href = 'https://youtube.com'" >
                    Saiba Mais
                </button>
            </div>
        </header>
        <nav>
            <div>
                <a href="CadastrarProds.html" target="conteudo">Cadastro de produtos</a>
            </div>
            <div>
                <a href="consulta.html" target="conteudo">Consultar produto</a>
            </div>
            <div>
                <a href="excluir.html" target="conteudo">Excluir produtos</a>
            </div>
            <div>
                <a href="vizualizador.jsp" target="conteudo">Listagem</a>
            </div>
        </nav>
        <main>
            <iframe src='inicio.html' name='conteudo' style: width="100%"; height="800px"; border="0px"></iframe>
        </main>
        <footer>
            <div class="Saiba">
                <button onclick="location.href = 'index.html'">
                    voltar
                </button>
            </div>
            <br>
            <p>fim do site fim do site fim do site fim do site fim do site
                fim do site fim do site fim do site fim do site fim do site
                fim do site fim do site fim do site fim do site fim do site 
                fim do site fim do site fim do site fim do site fim do site
                fim do site fim do site fim do site fim do </p>
        </footer>
        <%
            
        %>
    </body>
</html>
