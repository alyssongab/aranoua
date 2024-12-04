<%@ page import="aranoua.javaweb.aranouajavawebjsp.dao.PessoaDAO" %>
<%@ page import="aranoua.javaweb.aranouajavawebjsp.model.Pessoa" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: alysson
  Date: 12/4/24
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de pessoas</title>
</head>
<body>
    <h1>Lista de pessoas</h1>

    <%
        PessoaDAO pessoaDao = new PessoaDAO();

        List<Pessoa> pessoas = pessoaDao.listar();
    %>
        <table border="1">
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>

            <% for(Pessoa p : pessoas){ %>
            <tr> <%-- Cria uma linha para cada pessoa --%>
                <td>
                    <a href="pessoa-consultar.jsp?id=<%=p.getId()%>"><%=(p.getId())%></a>
                </td>
                <td>
                    <%=(p.getNome())%>
                </td>
                <td>
                    <%=(p.getEmail())%>
                </td>
            </tr>
            <% } %>
        </table>

    <a href="pessoa-cadastrar.jsp">Cadastrar Pessoa</a>
</body>
</html>
