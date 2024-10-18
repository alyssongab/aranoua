package teste;

import modelo.Fornecedor;
import modelo.Funcionario;
import modelo.Pessoa;

import java.util.ArrayList;

public class TestaValidacoes {

    public static void validarDocumentacao(ArrayList<Pessoa> pessoas) {
        int qtdValidados = 0;
        for(Pessoa p : pessoas) {
            System.out.println(p.getNome()+" - "+p.getDocumento()+" - "+p.validacao());
            if(p.validacao())
                qtdValidados++;
        }
        System.out.println("Total de validados: " + qtdValidados);
    }

    public static void main(String[] args) {

        ArrayList<Pessoa> funcionarios = new ArrayList<>();
        ArrayList<Pessoa> fornecedores = new ArrayList<>();

        // Funcionarios
        funcionarios.add(new Funcionario("funcionario01", "92999", "func@gmail.com",
                "01/10/2024", "12345"));
        funcionarios.add(new Funcionario("funcionario02", "928866", "func2@gmail.com", "03/10/2024", "2314"));

       // Fornecedores
        fornecedores.add(new Fornecedor("coca-cola", "921212", "coca@gmail", "02135345313002"));
        fornecedores.add(new Fornecedor("pepsi", "923232", "pepsi@gmail", "12135345313002"));
        fornecedores.add(new Fornecedor("samsung", "923412", "samsung@gmail", "16135345943002"));

        validarDocumentacao(funcionarios);
        System.out.println();
        validarDocumentacao(fornecedores);

    }
}
