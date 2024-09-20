package main.java.modelo;

public class Proprietario {
    //Atributos
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets = new Pet[10];

    // Getters Setters
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

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    // Construtor
    public Proprietario() {

    }
}
