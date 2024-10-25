package modelo;

public class Fornecedor extends Pessoa implements EntidadeEnviaEmails{

    // Construtores
    public Fornecedor() {
    }

    public Fornecedor(String nome, String telefone, String email, String documento) {
        super(nome, telefone, email, documento);

    }

    // Método validacao implementado
    @Override
    public boolean validacao() {
        return documento.toCharArray()[0] == '1';
    }

    @Override
    public String toString() {
        return super.toString() +
                "CNPJ: " + getDocumento() + '\n'+
                "Documento Validado: "+validacao();
    }

    @Override
    public String prepararConteudoEmail() {
        return "Destinatário: " + this.getEmail() +
                "\nCaro " + this.getNome() +
                "\nCom intuito de termos os melhores preços, gostaríamos de negociar com a empresa!";
    }
}
