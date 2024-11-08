package edu.ifam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexaoBD {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/aranoua_java_web";
        String user = "root";
        String password = "4341";

        try{
            Connection conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada");

            Statement instrucao  = conexao.createStatement();

            String sql = "insert into pessoa2" +
                        " (nome, email)" +
                        " values" +
                        " ('Joao', 'joao@gmail.com')";

            System.out.println("SQL: " + sql);

            boolean resultado = instrucao.execute(sql);
            System.out.println("Instrução realizada com sucesso");
        }
        catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Programa finalizado");
    }
}
