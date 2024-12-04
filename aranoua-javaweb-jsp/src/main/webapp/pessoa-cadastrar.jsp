<%@ page import="aranoua.javaweb.aranouajavawebjsp.dao.PessoaDAO" %>
<%@ page import="aranoua.javaweb.aranouajavawebjsp.model.Pessoa" %><%--
  Created by IntelliJ IDEA.
  User: alysson
  Date: 12/4/24
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de pessoa</title>
</head>
<body>

    <%
       String cadastrar = request.getParameter("cadastrar");
       String mensagem = "";

       if(cadastrar != null){

           try {

               String nome = request.getParameter("nome");
               String email = request.getParameter("email");

               Pessoa pessoa = new Pessoa(nome, email);
               PessoaDAO pessoaDAO = new PessoaDAO();
               pessoaDAO.inserir(pessoa);
               mensagem = "Dados salvos com sucesso!";
           }
           catch(Exception e){
               mensagem = "Erro ao salvar!";
           }
       }

    %>

    <h1>Cadastrar Pessoa</h1>

    <strong><%=mensagem%></strong>

    <form action="pessoa-cadastrar.jsp" method="post">
        <label for="nome">Nome</label>
        <input type="text" id="nome" name="nome" required>
        <br>
        <label for="email">Email</label>
        <input type="email" id="email" name="email" required>
        <br>
        <br>
        <button type="submit" name="cadastrar">Cadastrar</button>
        <button type="reset">Resetar</button>
        <a href="pessoa-listar.jsp">Voltar</a>
    </form>
</body>
</html>
