package edu.ifam;

import java.sql.*;

public class TestaConexaoBD {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/aranoua_java_web";
        String user = "root";
        String password = "4341";

        try{

            Pessoa pessoa = new Pessoa("Pessoa 05", "pessoa5@ifam.edu.br", 6);

            Connection conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao realizada");

            Statement instrucao  = conexao.createStatement();

            String sqlInserir = "insert into pessoa2" +
                        " (nome, email)" +
                        " values" +
                        " ('"+pessoa.getNome()+"','"+pessoa.getEmail()+"')";

            String sqlAlterar = "update pessoa2" +
                                " set nome = '"+pessoa.getNome()+"'" +
                                " where id = "+pessoa.getId();

            String sqlDeletar = "delete from pessoa2" +
                                " where id = 2";

            String sqlListar = "select id, nome, email from pessoa2";

            System.out.println("SQL: " + sqlInserir);
            instrucao.execute(sqlInserir);
            boolean resultado = instrucao.execute(sqlInserir);

            if(resultado) {
                ResultSet resultados = instrucao.getResultSet();
                while(resultados.next()) {
                    System.out.println("Id: "+resultados.getInt(1));
                    System.out.println("Nome: "+resultados.getString(2));
                    System.out.println("Email: "+resultados.getString(3));
                    System.out.println("#############################################");
                }
            }

            System.out.println("Instrução realizada com sucesso");
        }
        catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Programa finalizado");
    }
}
