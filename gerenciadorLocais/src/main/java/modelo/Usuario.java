package main.java.modelo;

import java.util.ArrayList;
import java.util.List;

// Utilização de herança por parte da classe usuario, que herda atributos de pessoa
// Como a classe pessoa é abstrata, tem também o polimorfismo dinâmico através da sobrescrita

public class Usuario extends Pessoa{

    // atributos
    private String username;
    private List<Local> locaisVisitados;

    public Usuario(String nome, String username) {
        super(nome);
        this.username = username;
        this.locaisVisitados = new ArrayList<Local>();
    }

    // adicionar local visitado

    public void adicionarLocal(Local local) {
        this.locaisVisitados.add(local);
    }

    // avaliar local

    public void avaliarLocal(Local local, int estrelas, String comentario) {
        if(this.locaisVisitados.isEmpty()) {
            System.out.println("Lista de locais vazia. Adicione um local");
            return;
        }
        else if (estrelas < 1 || estrelas > 5) {
            System.out.println("Nota de 1 a 5!");
        }
        Avaliacao avaliacao = new Avaliacao(local, estrelas, comentario);
        local.adicionarAvaliacao(avaliacao);
        System.out.println("Avaliação adicionada com sucesso ao local: " + local.getNome() + " - " + estrelas);
    }

    // obter locais visitados

    public void getLocaisVisitados() {
        if(this.locaisVisitados.isEmpty()) {
            System.out.println("Lista de locais vazia. Adicione um local");
            return;
        }
        for(Local local : this.locaisVisitados) {
            System.out.println(local.getNome());
        }
    }

    // implementando metodo abstrato (polimorfismo de forma dinâmica)

    @Override
    public String getTipoPessoa() {
        return "Usuario";
    }
}
