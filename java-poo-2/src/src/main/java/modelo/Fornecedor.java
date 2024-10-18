package modelo;

public class Fornecedor extends Pessoa {

    // atributos

    public Fornecedor() {
    }

    public Fornecedor(String nome, String telefone, String email, String documento) {
        super(nome, telefone, email, documento);

    }

    @Override
    public boolean validacao() {
        return documento.toCharArray()[0] == '1';
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+'\n'+
                "Telefone: "+getTelefone()+'\n'+
                "Email: "+getEmail()+'\n'+
                "CNPJ: "+getDocumento()+'\n'+
                "Documento Validado: "+validacao();
    }
}
