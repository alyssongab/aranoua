package teste;

import modelo.Funcionario;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jorge");
        funcionario.setTelefone("32345678");
        funcionario.setEmail("jorge@email.com");
        funcionario.setDocumento("123456");
        funcionario.setDataAdmissao("04/10/2024");

        System.out.println(funcionario);

    }
}
