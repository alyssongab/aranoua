package aranoua.javaweb.aranouajavawebjsp.dao;


import aranoua.javaweb.aranouajavawebjsp.model.Pessoa;
import aranoua.javaweb.aranouajavawebjsp.util.ConexaoUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PessoaDAO {
    // Metodo para inserir pessoa
    public void inserir(Pessoa p) throws SQLException {

        ConexaoUtil conexaoutil = new ConexaoUtil();

        Connection con = conexaoutil.getConexao();

        Statement instrucao  = con.createStatement();

        String sql = "insert into pessoa2" +
                " (nome, email)" +
                " values" +
                " ('"+p.getNome()+"', '"+p.getEmail()+"')";

        System.out.println("SQL: " + sql);

        instrucao.execute(sql);
    }

    // Metodo para alterar pessoa
    public void alterar(Pessoa p) throws SQLException {

        ConexaoUtil conexaoutil = new ConexaoUtil();

        Connection con = conexaoutil.getConexao();

        Statement instrucao  = con.createStatement();

        String sql = "update pessoa2 " +
                " set nome = '"+p.getNome()+"',"+
                "     email = '"+p.getEmail()+"'"+
                " where id = "+p.getId();

        System.out.println("SQL:" + sql);

        instrucao.execute(sql);
    }

    // Metodo para excluir por id
    public void excluir(int id) throws SQLException {
        ConexaoUtil conexaoutil = new ConexaoUtil();

        Connection con = conexaoutil.getConexao();

        Statement instrucao  = con.createStatement();

        String sql = "delete from pessoa2 " +
                " where id = "+id;

        System.out.println("SQL:" + sql);

        instrucao.execute(sql);
    }

    // Metodo para listar pessoas
    public List<Pessoa> listar() throws SQLException {

        ConexaoUtil conexaoUtil = new ConexaoUtil();

        Connection conexao = conexaoUtil.getConexao();

        Statement instrucao = conexao.createStatement();

        String sql = "select id,nome,email from pessoa2";

        System.out.println("SQL:"+sql);

        boolean resultado = instrucao.execute(sql);

        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa;

        if(resultado){
            ResultSet resultados = instrucao.getResultSet();
            while(resultados.next()){
                pessoa = new Pessoa();
                pessoa.setId(resultados.getInt(1));
                pessoa.setNome(resultados.getString(2));
                pessoa.setEmail(resultados.getString(3));
                pessoas.add(pessoa);
            }
        }
        return pessoas;
    }

    // Metodo para consultar pessoa por id
    public Pessoa consultar(int id) throws SQLException {

        ConexaoUtil conexaoUtil = new ConexaoUtil();

        Connection conexao = conexaoUtil.getConexao();

        Statement instrucao = conexao.createStatement();

        String sql = "select id,nome,email from pessoa2 where id="+id;

        System.out.println("SQL: "+sql);

        boolean resultado = instrucao.execute(sql);

        Pessoa pessoa;

        if(resultado){
            ResultSet resultados = instrucao.getResultSet();
            while(resultados.next()){
                pessoa = new Pessoa();
                pessoa.setId(resultados.getInt(1));
                pessoa.setNome(resultados.getString(2));
                pessoa.setEmail(resultados.getString(3));
                return pessoa;
            }
        }
        return null;
    }
}
