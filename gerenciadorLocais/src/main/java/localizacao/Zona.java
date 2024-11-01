package main.java.localizacao;

import main.java.modelo.Local;

import java.util.ArrayList;
import java.util.List;

public class Zona {

    // atributos
    private String nome;
    private List<Local> locais; // a lista de locais que essa zona engloba

    // construtor
    public Zona(String nome) {
        this.nome = nome;
        this.locais = new ArrayList<>();
    }

    // opcional
    public void adicionarLocal(Local local) {
        this.locais.add(local);
    }
}
