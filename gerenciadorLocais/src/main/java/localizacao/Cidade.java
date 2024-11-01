package main.java.localizacao;

// Cidade compõe a classe Estado (um estado tem muitas cidades)

public class Cidade {

    // atributos
    private String nome;
    private Estado estado;

    // construtor
    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
        estado.adicionarCidade(this);
    }

    // getters
    public String getNome() {
        return nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public Pais getPais() {
        return estado.getPais();
    }

}
