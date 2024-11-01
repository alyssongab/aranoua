package main.java.modelo;

public class Admin extends Pessoa {
    private int tokenAdmin;

    public Admin(String nome, int tokenAdmin) {
        super(nome);
        this.tokenAdmin = tokenAdmin;
    }

    // implementando metodo abstrato (polimorfismo de forma dinâmica)
    @Override
    public String getTipoPessoa() {
        return "Administrador";
    }
}
