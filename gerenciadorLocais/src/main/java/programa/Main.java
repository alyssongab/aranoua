package main.java.programa;

import main.java.localizacao.Cidade;
import main.java.localizacao.Estado;
import main.java.localizacao.Pais;
import main.java.localizacao.Zona;
import main.java.modelo.Local;
import main.java.modelo.Usuario;

public class Main {
    public static void main(String[] args) {

        // Manaus
        Pais brasil = new Pais("Brasil");
        Estado amazonas = new Estado("Amazonas");
        Cidade manaus = new Cidade("Manaus");
        Zona centro = new Zona("Centro");

        /*------------ USUARIO 1 -----------*/
        Usuario user1  = new Usuario("Alysson", "user01");
        Local teatro = new Local("Teatro Amazonas", brasil, amazonas, manaus, centro);
        Local pn = new Local("Ponta negra", brasil, amazonas, manaus, centro);

        user1.adicionarLocal(teatro);
        user1.adicionarLocal(pn);

        // avaliacoes
        user1.getLocaisVisitados();
        user1.avaliarLocal(teatro, 5, "Local muito bonito");
        user1.avaliarLocal(pn, 5, "Muito bom, mas pode melhorar");
        System.out.println("-------------------------------------------------");
        teatro.exibirAvaliacoes();

        // informacoes da pessoa
        System.out.println(user1.getNome());
        System.out.println(user1.getTipoPessoa());



    }
}
