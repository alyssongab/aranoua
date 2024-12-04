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
import java.util.List;

@WebServlet(name = "pessoaServlet", value = "/pessoa")
public class PessoaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            // https://localhost:8080/pessoa?acao=cadastrar
            String acao = req.getParameter("acao");

            switch (acao != null ? acao : "") {
                case "cadastrar", "alterar":
                    formulario(req, resp); break;
                case "consultar":
                    consultarPessoa(req, resp); break;
                case "excluir":
                    excluirPessoa(req, resp); break;
                default: listarPessoa(req, resp); // página default
            }
        }
        catch(Exception e){
            throw new ServletException(e);
        }
    }

    private void listarPessoa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            PessoaDAO pessoaDAO = new PessoaDAO();
            List<Pessoa> pessoas = pessoaDAO.listar();

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
            out.println("<th>ID</th>");
            out.println("<th>Nome</th>");
            out.println("<th>Email</th>");
            out.println("</tr>");

            for (Pessoa p : pessoas) { // adiciona dinamicamente as linhas conforme tenha pessoas na lista
                out.println("<tr>");
                out.println("<td> <a href='pessoa?acao=consultar&id=" + p.getId() + "'>" + p.getId() + "</a></td>");
                out.println("<td>" + p.getNome() + "</td>");
                out.println("<td>" + p.getEmail() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");

            out.println("<a href='pessoa?acao=cadastrar'>Cadastrar Pessoa</a>");

            out.println("</body>");
            out.println("</html>");
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void formulario(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // Se vier com ID preenchido, é para mostrar o formulário de alterar
            String id = req.getParameter("id");
            Pessoa pessoa;

            // caso exista a pessoa
            if(id != null && !id.isEmpty()){
                PessoaDAO pessoaDAO = new PessoaDAO();
                pessoa = pessoaDAO.consultar(Integer.parseInt(id));
            }
            // caso nao haja pessoa, o input irá aparecer vazio
            else {
                pessoa = new Pessoa();
                pessoa.setNome("");
                pessoa.setEmail("");
            }

            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            if(id != null){
                out.println("<title>Alterar pessoa</title>");
            }
            else {
                out.println("<title>Cadastrar pessoa</title>");
            }
            out.println("</head>");
            out.println("<body>");
            if(id != null){
                out.println("<h1>Alterar pessoa</h1>");
            }
            else {
                out.println("<h1>Cadastrar pessoa</h1>");
            }

            out.println("<form action='pessoa' method='post'>");

//            if(id != null){
//                out.println("<input type='hidden' name='id' value='" + id + "'>");
//            }
//            out.println("<label for='id'>ID:</label>");
            out.println("<input type='hidden' name='id' value='"+pessoa.getId()+"'>");
            out.println("<label for='pessoa_nome'>Nome:</label>");
            out.println("<input type='text' name='nome' value='"+pessoa.getNome()+"' required>");
            out.println("<br><br>");
            out.println("<label for='pessoa_email'>E-mail:</label>");
            out.println("<input type='text' name='email' value='"+pessoa.getEmail()+"' required>");
            out.println("<br><br>");
            out.println("<input type='reset' name='limpar' value='Limpar'>");
            out.println("<input type='submit' name='salvar' value='Salvar'>");

            out.println("</form>");

            out.println("<a href='pessoa'>Voltar</a>");

            out.println("</body>");
            out.println("</html>");
        }catch (Exception e){
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String tituloCadastrar = "Cadastro de pessoa";
        String tituloAlterar = "Alteração de pessoa";
        String titulo;

        String mensagemCadastrar = "Pessoa cadastrada com sucesso!";
        String mensagemAlterar = "Pessoa alterada com sucesso!";
        String mensagem;

        try {
            String salvar = req.getParameter("salvar");

            if (salvar != null) {

                Pessoa pessoa = new Pessoa();
                String id = req.getParameter("id");

                pessoa.setNome(req.getParameter("nome"));
                pessoa.setEmail(req.getParameter("email"));

                PessoaDAO pessoaDAO = new PessoaDAO();

                if(id != null && !id.equals("0")){
                    // para alterar
                    titulo = tituloAlterar;
                    mensagem = mensagemAlterar;
                    pessoa.setId(Integer.parseInt(id));
                    pessoaDAO.alterar(pessoa);
                }
                else {
                    titulo = tituloCadastrar;
                    mensagem = mensagemCadastrar;
                    pessoaDAO.inserir(pessoa);
                }

                resp.setContentType("text/html");
                resp.setCharacterEncoding("UTF-8");
                PrintWriter out = resp.getWriter();

                out.println("<html>");
                out.println("<head>");
                out.println("<meta charset=\"utf-8\">");
                out.println("<title>"+titulo+"</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>"+titulo+"</h1>");

                out.println("<p>"+mensagem+"</p>");

                out.println("<a href='pessoa'>Voltar</a>");

                out.println("</body>");
                out.println("</html>");
            }
        }
        catch(Exception e){
            throw new ServletException(e);
        }
    }

    private void consultarPessoa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try{
            PessoaDAO pessoaDAO = new PessoaDAO();

            // http//localhost:8080/pessoa?acao=consultar&id=1
            String id = req.getParameter("id");
            Pessoa pessoa = pessoaDAO.consultar(Integer.parseInt(id));

            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Consulta Detalhes da Pessoa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Consulta Detalhes da Pessoa</h1>");

            out.println("<p>Id: "+pessoa.getId() +"</p>");
            out.println("<p>Nome: "+pessoa.getNome() +"</p>");
            out.println("<p>Email: "+pessoa.getEmail() +"</p>");

            out.println("<a href='pessoa?acao=excluir&id="+pessoa.getId()+"'>Excluir</a>");
            out.println("<a href='pessoa?acao=alterar&id="+pessoa.getId()+"'>Editar</a>");
            out.println("<a href='pessoa'>Voltar</a>");

            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e){
            throw new ServletException(e);
        }
    }

    private void excluirPessoa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            PessoaDAO pessoaDao = new PessoaDAO();

//            http://localhost:8080/pessoa?acao=excluir&id=1

            String id = req.getParameter("id");

            pessoaDao.excluir(Integer.parseInt(id));

            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Exclusão de Pessoa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Exclusão de Pessoa</h1>");

            out.println("<p> Pessoa excluída com sucesso</p>");

            out.println("<a href='pessoa'>Voltar</a>");

            out.println("</body>");
            out.println("</html>");
        }catch (Exception e){
            throw new ServletException(e);
        }

    }
}
