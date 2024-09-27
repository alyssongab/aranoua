package main.java.modelo;

public class Pet {
    // atributos
    private String nome;
    private Proprietario proprietario;
    private int anoNascimento;
    private String especie;
    private String raca;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Calcular a idade
    public int getIdade() {
        return (2024 - this.anoNascimento);
    }

    // Construtores
    public Pet() {
        this.nome = "Desconhecido";
        this.proprietario = null;
        this.anoNascimento = 0;
        this.especie = "Desconhecido";
        this.raca = "Desconhecido";
    }

    public Pet(String nome) {
        this.nome = nome;
    }

    public Pet(String nome, Proprietario proprietario) {
        this.nome = nome;
        this.proprietario = proprietario;
    }

    public Pet(String nome, Proprietario proprietario, int anoNascimento) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.anoNascimento = anoNascimento;
    }

    public Pet(String nome, Proprietario proprietario, int anoNascimento, String especie) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.anoNascimento = anoNascimento;
        this.especie = especie;
    }

    public Pet(String nome, Proprietario proprietario, int anoNascimento, String especie, String raca) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.anoNascimento = anoNascimento;
        this.especie = especie;
        this.raca = raca;
    }

    @Override
    public String toString() {
        String proprietarioInfo = (proprietario != null)
                ? "proprietario=" + proprietario.getNome() +
                ", telefone=" + proprietario.getTelefone() +
                ", email=" + proprietario.getEmail()
                : "proprietario=Desconhecido";

        return "\nPet{" +
                "nome='" + nome + '\'' +
                ", " + proprietarioInfo +
                ", anoNascimento=" + anoNascimento +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
