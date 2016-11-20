<%-- 
    Document   : listar
    Created on : 20/11/2016, 11:38:58
    Author     : Itanir
--%>

<%@page import="model.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controle.AlunoImpl"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Lista de Aluno</title>
    </head>
    <body>
        <%@include file="index.html" %>
        <h1>Alunos</h1>
        <div>
            <table>
                <tr>
                    <td>ID</td>
                    <td>Nome do Aluno</td>
                </tr>
                <%
                    AlunoImpl AlunoImpl = new AlunoImpl();
                    List<Aluno> list = AlunoImpl.getListAll();
                    for(Aluno a : list){
                        %>
                        <tr>
                            <td><%= a.getIdAluno() %></td>
                            <td><%= a.getNomeAluno()%></td>
                            <td><a href="alteraraluno.jsp?id=<%= a.getIdAluno()%>">editar</a></td>
                        </tr>
                        <%
                    }
                %>
            </table>
            <a href="index.html">Inicio</a>
        </div>
    </body>
</html>