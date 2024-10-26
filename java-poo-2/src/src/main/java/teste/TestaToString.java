package teste;

import modelo.Fornecedor;
import modelo.Funcionario;

public class TestaToString {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Alysson",
                    "929292",
                    "alysson@gmail.com",
                    "20/12/2024",
                    "03945289");

        System.out.println(funcionario);

        System.out.println("****************************");

        Fornecedor fornecedor = new Fornecedor("Gabriel",
                    "8801664",
                    "agob@gmail.com",
                    "12309428");

        System.out.println(fornecedor);
    }
}
