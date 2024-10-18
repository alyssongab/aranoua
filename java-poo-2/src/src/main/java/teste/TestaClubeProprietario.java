package teste;

import modelo.Clube;
import modelo.Proprietario;

public class TestaClubeProprietario {

    public static void main(String[] args) {
        Proprietario p1 = new Proprietario();
        p1.setNome("Kayo");
        p1.setEmail("kayo@email.com");

        Proprietario p2 = new Proprietario();
        p2.setNome("Matheus");
        p2.setEmail("matheus@email.com");

        Proprietario p3 = new Proprietario();
        p3.setNome("Yasmin");
        p3.setEmail("yasmin@email.com");

        Clube clube = new Clube();
        clube.setNome("Clube de Criadores de Yorkshire de Manaus");
        clube.addProprietario(p1);
        clube.addProprietario(p2);
        clube.addProprietario(p3);

        clube.listarProprietarios();



    }

}
