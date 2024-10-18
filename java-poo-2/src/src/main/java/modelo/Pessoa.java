package modelo;

public abstract class Pessoa {

    private String nome;
    private String telefone;
    private String email;
    protected String documento;

    // Construtores

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String email, String documento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.documento = documento;
    }

    // Getters e Setters

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Metodo para ser sobrescrito

/*    public boolean validarDoc(String tipo) {
        if (tipo.equalsIgnoreCase("fornecedor")) {
            return documento.toCharArray()[0] == '1';
        }
        else if(tipo.equalsIgnoreCase("funcionario")) {
            return documento.toCharArray()[0] == '2';
        }
        return false;
    }*/

    public abstract boolean validacao();

}