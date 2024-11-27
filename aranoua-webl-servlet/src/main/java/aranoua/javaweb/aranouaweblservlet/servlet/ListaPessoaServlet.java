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

@WebServlet(name = "listaPessoaServlet", value = "/lista-pessoas")
public class ListaPessoaServlet extends HttpServlet {


    private List<Pessoa> pessoas = new ArrayList<>();

    private void carregarPessoas() {
//        pessoas.add(new Pessoa("Alysson", "0355", "alysson@gmail.com", "Manaus"));
//        pessoas.add(new Pessoa("Gabriel", "2323", "gabriel@gmail.com", "Curitiba"));
//        pessoas.add(new Pessoa("Joao", "1235", "joao@gmail.com", "Rio de janeiro"));

        PessoaDAO pessoaDao = new PessoaDAO();
        try {

            this.pessoas = pessoaDao.listar();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        carregarPessoas();

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html lang=\"pt-br\">");
        out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Lista de pessoas</title>");
        out.println("</head>");
        out.println("<body>");

            out.println("<h1>Lista de pessoas</h1>");
            out.println("<p>O cadastro de pessoas é importante para a coleta de dados. </p>");

                out.println("<table border = \"1\"");
                    out.println("<tr>"); // linha do cabeçalho
                        out.println("<th>Nome</th>");
                        out.println("<th>Cpf</th>");
                        out.println("<th>Email</th>");
                        out.println("<th>Cidade</th>");
                    out.println("</tr>");

                    for(Pessoa p : pessoas) { // adiciona dinamicamente as linhas conforme tenha pessoas na lista
                        out.println("<tr>");
                            out.println("<td>" + p.getNome() + "</td>");
                            out.println("<td>" + p.getEmail() + "</td>");
                        out.println("</tr>");
                    }
                out.println("</table>");


        out.println("</body>");
        out.println("</html>");
    }
}
