package teste;

import modelo.Fornecedor;

public class TestaFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome("Alysson");
        fornecedor.setTelefone("92123456");
        fornecedor.setEmail("alysson@gmail.com");
        fornecedor.setDocumento("19.832.471/0001-52");

        System.out.println(fornecedor);
    }
}
