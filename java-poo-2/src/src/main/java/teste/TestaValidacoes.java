package teste;

import modelo.Fornecedor;
import modelo.Funcionario;

import java.util.ArrayList;

public class TestaValidacoes {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();

        // Funcionarios
        funcionarios.add(new Funcionario("funcionario01", "92999", "func@gmail.com",
                "01/10/2024", "12345"));

        funcionarios.add(new Funcionario("funcionario02", "928866", "func2@gmail.com", "03/10/2024", "2314"));

       for(Funcionario f : funcionarios) {
           System.out.println(f.getNome()+'\n'+f.getDocumento()+'\n'+"Validado: "+f.validacao());
           System.out.println();
       }

       // Fornecedores
        fornecedores.add(new Fornecedor("coca-cola", "921212", "coca@gmail", "02135345313002"));
        fornecedores.add(new Fornecedor("pepsi", "923232", "pepsi@gmail", "12135345313002"));
        fornecedores.add(new Fornecedor("samsung", "923412", "samsung@gmail", "16135345943002"));

        int qtdFornecedores = 0;
        for(Fornecedor f : fornecedores) {
            System.out.println(f.getNome()+'\n'+f.getDocumento()+'\n'+"Validado: "+f.validacao()+'\n');
            if(f.validacao())
                qtdFornecedores++;
        }
        System.out.println(qtdFornecedores);
    }
}
