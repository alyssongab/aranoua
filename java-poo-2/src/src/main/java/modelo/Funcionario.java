package modelo;

public class Funcionario extends Pessoa{

    // Atributo específico
    private String dataAdmissao;

    // Construtores
    public Funcionario() {
    }

    public Funcionario(String nome, String telefone, String email, String dataAdmissao, String documento) {
        super(nome, telefone, email, documento);
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    // Método validacao implementado
    @Override
    public boolean validacao() {
        return documento.toCharArray()[0] == '2';
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+'\n'+
                "Telefone: "+getTelefone()+'\n'+
                "Email: "+getEmail()+'\n'+
                "Data de admissão: "+getDataAdmissao()+'\n'+
                "Carteira: " +getDocumento()+'\n'+
                "Documento Validado: "+validacao();
    }
}
