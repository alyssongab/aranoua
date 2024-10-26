package teste;

import modelo.EntidadeEnviaEmails;
import modelo.EntidadeEnviaSMS;
import modelo.Fornecedor;
import modelo.Funcionario;

public class TesteEnvioDeEmail {

    private static void enviarEmail(EntidadeEnviaEmails entidade) {
        System.out.println(entidade.prepararConteudoEmail());
    }

    private static void enviarSMS(EntidadeEnviaSMS entidade) {
        System.out.println(entidade.prepararSMS());
    }

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Alysson",
                "929292",
                "alysson@gmail.com",
                "20/12/2024",
                "03945289");

        Fornecedor fornecedor = new Fornecedor("Gabriel",
                "8801664",
                "agob@gmail.com",
                "12309428");

        enviarEmail(funcionario);
        enviarEmail(fornecedor);
        System.out.println("***********************************");
        enviarSMS(funcionario);
    }
}
