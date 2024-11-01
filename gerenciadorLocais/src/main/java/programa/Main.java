package main.java.programa;

import main.java.localizacao.Cidade;
import main.java.localizacao.Estado;
import main.java.localizacao.Pais;
import main.java.localizacao.Zona;
import main.java.modelo.Local;
import main.java.modelo.Usuario;

public class Main {
    public static void main(String[] args) {

        // Localização adotada
        Pais brasil = new Pais("Brasil");
        Estado amazonas = new Estado("Amazonas", brasil);
        Cidade manaus = new Cidade("Manaus", amazonas);
        Zona centro = new Zona("Centro");
        Zona pontaNegra = new Zona("Ponta negra");

        /*------------ USUARIO 1 -----------*/
        Usuario user1  = new Usuario("Alysson", "user01");
        Local teatro = new Local("Teatro Amazonas", brasil, amazonas, manaus, centro);
        Local pn = new Local("Ponta negra", brasil, amazonas, manaus, pontaNegra);
        Local ifam = new Local("Ifam", brasil, amazonas, manaus, centro);

        // adicionando os locais do usuario 1
        System.out.println("Locais visitados:");
        user1.adicionarLocal(teatro);
        user1.adicionarLocal(pn);
        user1.getLocaisVisitados();
        System.out.println("-------------------------------------------------");

        // avaliacoes do usuario 1
        user1.avaliarLocal(teatro, 5, "Local muito bonito");
        user1.avaliarLocal(pn, 5, "Muito bom, mas pode melhorar");
        teatro.exibirAvaliacoes();
        pn.exibirAvaliacoes();
        System.out.println("-------------------------------------------------");

        // informacoes da pessoa
        System.out.println("Informações da pessoa: ");
        System.out.println("Nome: " + user1.getNome());
        System.out.println("Tipo de pessoa: " + user1.getTipoPessoa());

//        testarZonas(centro);
//        testarRelacoes(brasil, amazonas);

    }

    public static void testarZonas(Zona zona) {
        System.out.println("Locais visitados na zona: " + zona.getNome());
        for(Local l : zona.getLocais()) {
            System.out.println(l.getNome());
        }
    }

    public static void testarRelacoes(Pais pais, Estado estado) {
        System.out.println("País: " + pais.getNome());
        System.out.println("Estados no país: ");
        for (Estado e : pais.getEstados()) {
            System.out.println(" - " + estado.getNome());
        }

        System.out.println("Estado: " + estado.getNome());
        System.out.println("Cidades no estado: ");
        for (Cidade cidade : estado.getCidade()) {
            System.out.println(" - " + cidade.getNome());
        }
    }
}
