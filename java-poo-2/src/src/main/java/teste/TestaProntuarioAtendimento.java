package teste;

import modelo.Atendimento;
import modelo.Pet;
import modelo.Prontuario;

public class TestaProntuarioAtendimento {

    public static void main(String[] args) {


        Pet pet = new Pet();
        pet.setNome("Belinha");

        Prontuario prontuario = new Prontuario();
        prontuario.setNumero("1234");
        prontuario.setData("04/10/2024");
        prontuario.setPet(pet);
        prontuario.addAtendimento("Vacina contra Raiva","04/10/2024");
        prontuario.addAtendimento("Castração","04/10/2024");

        System.out.println(prontuario.getPet().getNome());
        System.out.println(prontuario.getNumero());
        System.out.println(prontuario.getData());
        prontuario.listarAtendimento();

        prontuario = null;

        System.out.println("Objeto prontuario sem a referência");

//        System.out.println(prontuario.getPet().getNome());
//        System.out.println(prontuario.getNumero());
//        System.out.println(prontuario.getData());
//        prontuario.listarAtendimento();

//        System.out.println(atendimento1.getDescricao());
//        System.out.println(atendimento2.getDescricao());







    }

}
