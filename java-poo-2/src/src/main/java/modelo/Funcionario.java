package modelo;

public class Funcionario extends Pessoa implements EntidadeEnviaEmails, EntidadeEnviaSMS{

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
        return super.toString() +
                "CPF: " + getDocumento() + '\n'+
                "Data de admissão: "+getDataAdmissao()+'\n'+
                "Documento Validado: "+validacao();
    }

    @Override
    public String prepararConteudoEmail() {
        return "Destinatário: " + this.getEmail() +
                "\nPrezado " + this.getNome() +
                "\nObrigado por sua colaboração em nossa empresa!";

    }

    @Override
    public String prepararSMS() {
        return "Destinatário: " + this.getTelefone() +
                "\nPrezado " + this.getNome() +
                "\nNotificação automática por SMS";
    }
}
