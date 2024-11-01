package main.java.localizacao;

import java.util.ArrayList;
import java.util.List;

// Estado compõe a classe país (um país tem muitos estados)

public class Estado {

    //atributos
    private String nome;
    private Pais pais;
    private List<Cidade> cidades;

    // construtor
    public Estado(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
        this.cidades = new ArrayList<Cidade>();
        pais.adicionarEstado(this);
    }

    // getters
    public String getNome() {
        return nome;
    }

    public List<Cidade> getCidade() {
        return cidades;
    }

    public Pais getPais() {
        return pais;
    }

    // metodo opcional
    public void adicionarCidade(Cidade cidade) {
        this.cidades.add(cidade);
    }
}
