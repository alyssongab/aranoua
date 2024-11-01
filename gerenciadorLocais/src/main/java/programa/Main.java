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

        // Verificação das relações
        System.out.println("País: " + brasil.getNome());
        System.out.println("Estados no país: ");
        for (Estado estado : brasil.getEstados()) {
            System.out.println(" - " + estado.getNome());
        }

        System.out.println("Estado: " + amazonas.getNome());
        System.out.println("Cidades no estado: ");
        for (Cidade cidade : amazonas.getCidade()) {
            System.out.println(" - " + cidade.getNome());
        }
        System.out.println("-------------------------------------------------");

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

        testarZonas(centro);

    }

    public static void testarZonas(Zona zona) {
        System.out.println("Locais visitados na zona: " + zona);
        for(Local l : zona.getLocais()) {
            System.out.println(l.getNome());
        }
    }
}
