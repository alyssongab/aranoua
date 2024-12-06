<%@ page import="aranoua.javaweb.aranouajavawebjsp.dao.PessoaDAO" %>
<%@ page import="aranoua.javaweb.aranouajavawebjsp.model.Pessoa" %><%--
  Created by IntelliJ IDEA.
  User: alysson
  Date: 12/5/24
  Time: 11:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alteração de pessoa</title>
</head>
<body>

    <%
        String id = request.getParameter("id");
        PessoaDAO pessoaDao = new PessoaDAO();
        Pessoa pessoa = pessoaDao.consultar(Integer.parseInt(id));
        String mensagem = "";
        boolean alteracaoFeita = false;

       try{
           String alterar = request.getParameter("alterar");
           String nome = request.getParameter("nome");
           String email = request.getParameter("email");
            if(alterar != null){
                pessoa.setNome(nome);
                pessoa.setEmail(email);
                pessoaDao.alterar(pessoa);
                mensagem = "Usuário alterado com sucesso.";
                alteracaoFeita = true;
            }
       }
       catch(Exception e){
           mensagem = "Erro ao alterar: " + e.getMessage();
       }

    %>

    <h1>Alteração de pessoa</h1>
    <br>
    <%
        if(alteracaoFeita == false) { %>

    <form action="pessoa-alterar.jsp" method="post">
        <input type="hidden" name="id" id="id" value="<%=pessoa.getId()%>">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" value="<%=pessoa.getNome()%>" required>
        <br>
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" value="<%=pessoa.getEmail()%>" required>
        <br>
        <br>
        <button type="submit" name="alterar">Alterar</button>
    </form>

    <%
        } else {
    %>
    <strong><%=mensagem%></strong>
    <%
        }
    %>
    <a href="pessoa-listar.jsp">Voltar</a>
</body>
</html>
