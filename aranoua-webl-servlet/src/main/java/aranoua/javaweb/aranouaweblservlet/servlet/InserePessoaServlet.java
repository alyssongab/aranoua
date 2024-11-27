package aranoua.javaweb.aranouaweblservlet.servlet;

import aranoua.javaweb.aranouaweblservlet.dao.PessoaDAO;
import aranoua.javaweb.aranouaweblservlet.model.Pessoa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name="inserePessoa", value = "/insere-pessoa")
public class InserePessoaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("nome");
        String email = req.getParameter("email");

        Pessoa pessoa = new Pessoa(nome, email);
        pessoa.setNome(nome);
        pessoa.setEmail(email);

        PessoaDAO pessoaDAO = new PessoaDAO();
        try{
            pessoaDAO.inserir(pessoa);
        }
        catch(SQLException e){
            throw new ServletException(e);
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html lang=\"pt-br\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Cadastro de Pessoa</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Cadastro de pessoa</h1>");
        out.println("<p>Pessoa cadastrada com sucesso!</p>");
        out.println("<p>Nome: "+pessoa.getNome()+", Email: "+pessoa.getEmail()+"</p");


        out.println("</body>");
        out.println("</html>");
    }
}
