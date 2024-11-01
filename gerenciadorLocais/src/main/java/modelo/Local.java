package main.java.modelo;

import main.java.localizacao.Cidade;
import main.java.localizacao.Estado;
import main.java.localizacao.Pais;
import main.java.localizacao.Zona;

import java.util.ArrayList;
import java.util.List;

public class Local {

    // atributos
    private String nome;
    private String endereco;
    private Pais pais;
    private Estado estado;
    private Cidade cidade;
    private Zona zona;
    private List<Avaliacao> avaliacoes;

    // construtores
    public Local(String nome, Pais pais, Estado estado, Cidade cidade, Zona zona) {
        this.nome = nome;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.zona = zona;
        this.avaliacoes = new ArrayList<>();
        zona.adicionarLocal(this);
    }

    public Local(String nome, String endereco, Pais pais, Estado estado, Cidade cidade, Zona zona) {
        this.nome = nome;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.zona = zona;
        this.avaliacoes = new ArrayList<>();
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    // metodo de adicionar avaliacao ao local

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    // exibir avaliacoes de um local

    public void exibirAvaliacoes() {
        if (avaliacoes.isEmpty()) {
            System.out.println("Nenhuma avaliação disponível para " + nome + ".");
            return;
        }

        System.out.println("Avaliações do " + nome + ":");
        for (Avaliacao avaliacao : avaliacoes) {
            System.out.println("Estrelas: " + avaliacao.getEstrelas() + " - Comentário: " + avaliacao.getComentarios());
        }
    }
}
