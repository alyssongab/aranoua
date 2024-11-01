package main.java.localizacao;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    // atributos
    private String nome;
    private List<Estado> estados;

    public Pais(String nome) {
        this.nome = nome;
        this.estados = new ArrayList<Estado>(); // a lista de estados é iniciada
    }

    // getters
    public String getNome() {
        return nome;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    // metodo opcional
    public void adicionarEstado(Estado estado) {
        estados.add(estado);
    }
}
