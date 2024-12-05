<%@ page import="aranoua.javaweb.aranouajavawebjsp.dao.PessoaDAO" %>
<%@ page import="aranoua.javaweb.aranouajavawebjsp.model.Pessoa" %><%--
  Created by IntelliJ IDEA.
  User: alysson
  Date: 12/4/24
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exclusão de pessoa</title>
</head>
<body>
    <h1>Exclusão de pessoa</h1>

    <%
        String idParam = request.getParameter("id");
        String excluir = request.getParameter("excluir");
        Pessoa pessoa = null;
        String mensagem = "";

        try{
            int id = Integer.parseInt(idParam);
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoa = pessoaDAO.consultar(id);

            if("true".equals(excluir)){
                pessoaDAO.excluir(id);
                mensagem = "Pessoa excluída com sucesso";
            }
        }
        catch(Exception e){
            mensagem = "Erro ao excluir: " + e.getMessage();
        }

    %>

    <strong><%=mensagem%></strong>

    <% if(pessoa != null && !"true".equals(excluir)) { %>
    <p>Id: <%=pessoa.getId()%></p>
    <p>Nome: <%=pessoa.getNome()%></p>
    <p>Email: <%=pessoa.getEmail()%></p>
    <p>Confirmar exclusão?</p>

    <form action="pessoa-excluir.jsp" method="get">
        <input type="hidden" name="id" value="<%=pessoa.getId()%>">
        <button type="submit" name="excluir" value="true">Sim</button>
    </form>

    <% } %>
    <a href="pessoa-listar.jsp">Voltar</a>
</body>
</html>
