package aranoua.javaweb.aranouaweblservlet.testes;

import aranoua.javaweb.aranouaweblservlet.dao.PessoaDAO;
import aranoua.javaweb.aranouaweblservlet.model.Pessoa;

import java.sql.SQLException;

public class TestaConexaoBDcomDAO {

    public static void main(String[] args) {

        try {
            // Inserir com DAO
            Pessoa pessoa = new Pessoa("Mario", "mario@gmail.com"); // id 4

            PessoaDAO pessoaDAO = new PessoaDAO();

            pessoaDAO.inserir(pessoa);

            System.out.println("Inserido com sucesso!\n");
        }
        catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
