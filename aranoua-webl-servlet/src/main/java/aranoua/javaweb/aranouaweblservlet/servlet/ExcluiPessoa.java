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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "excluiPessoa", value = "/exclui-pessoa")
public class ExcluiPessoa extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PessoaDAO pessoaDAO = new PessoaDAO();

        String idString = req.getParameter("id");
        int id = Integer.parseInt(idString);
        boolean pessoaEncontrada = false;

        try {
            for (Pessoa pessoa : pessoaDAO.listar()) {
                if (pessoa.getId() == id) {
                    pessoaDAO.excluir(id);
                    pessoaEncontrada = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html lang=\"pt-br\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Exclusão de Pessoa</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Exclusão de Pessoa</h1>");

        if (pessoaEncontrada) {
            out.println("<p>Pessoa excluída com sucesso!</p>");
            out.println("<a href='http://localhost:8080/aranoua_webl_servlet_war_exploded/excluiPessoa.html'>Voltar</a>");
        } else {
            out.println("<p>Não foi encontrada nenhuma pessoa com o ID fornecido.</p>");
            out.println("<a href='http://localhost:8080/aranoua_webl_servlet_war_exploded/excluiPessoa.html'>Voltar</a>");
        }

        out.println("</body>");
        out.println("</html>");
    }

}
