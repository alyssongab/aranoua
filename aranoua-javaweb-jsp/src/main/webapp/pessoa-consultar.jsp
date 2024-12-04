<%@ page import="aranoua.javaweb.aranouajavawebjsp.dao.PessoaDAO" %>
<%@ page import="aranoua.javaweb.aranouajavawebjsp.model.Pessoa" %><%--
  Created by IntelliJ IDEA.
  User: alysson
  Date: 12/4/24
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Consulta de pessoas</title>
</head>
<body>
    <h1>Consulta de detalhes da pessoa</h1>

    <%
        String id = request.getParameter("id");
        PessoaDAO pessoaDAO = new PessoaDAO();
        Pessoa pessoa = pessoaDAO.consultar(Integer.parseInt(id));
    %>
    <p>ID: <%=pessoa.getId()%></p>
    <p>Nome: <%=pessoa.getNome()%></p>
    <p>Email: <%=pessoa.getEmail()%></p>

    <a href="pessoa-listar.jsp">Voltar</a>
    <a href="pessoa-alterar.jsp?id=<%=pessoa.getId()%>">Alterar</a>
    <a href="pessoa-excluir.jsp?id=<%=pessoa.getId()%>">Excluir</a>
</body>
</html>
