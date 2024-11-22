package dao;

import model.Pessoa;
import util.ConexaoUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PessoaDAO {

    public void inserir(Pessoa p) throws SQLException {

        ConexaoUtil conexaoutil = new ConexaoUtil();
        Connection con = conexaoutil.getConexao();

        Statement instrucao  = con.createStatement();

        String sqlInserir = "insert into pessoa2" +
                " (nome, email)" +
                " values" +
                " ('"+p.getNome()+"', '"+p.getEmail()+"')";

        System.out.println("SQL: " + sqlInserir);

        instrucao.execute(sqlInserir);
    }

    public void alterar(Pessoa p) throws SQLException {

        ConexaoUtil conexaoutil = new ConexaoUtil();
        Connection con = conexaoutil.getConexao();

        Statement instrucao  = con.createStatement();

        String sqlAlterar = "update pessoa2" +
                " set nome = 'Jorge'" +
                " where id = 2";


        System.out.println("SQL: " + sqlAlterar);

        instrucao.execute(sqlAlterar);
    }
}
