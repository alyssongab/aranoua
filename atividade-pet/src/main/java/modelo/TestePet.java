package main.java.modelo;

import java.util.Arrays;

public class TestePet {

    public static void testaPetParaProprietario() {
        // novo proprietario com parametros do construtor
        Proprietario prop = new Proprietario();
        prop.setNome("Alysson");
        prop.setTelefone("92 98801");
        prop.setEmail("user@email.com");

        // novo pet com parametros do construtor
        Pet pet = new Pet("niko", prop, 2020,
                "felino", "srd");

        // main.java.modelo.Pet
        System.out.println(pet.getNome());
        System.out.println(pet.getAnoNascimento());
        System.out.println(pet.getIdade());
        System.out.println(pet.getEspecie());
        System.out.println(pet.getRaca());

        // main.java.modelo.Proprietario
        System.out.println(pet.getProprietario().getNome());
        System.out.println(pet.getProprietario().getTelefone());
        System.out.println(pet.getProprietario().getEmail());
    }

    // *********************************************************

    public static void testaProprietarioParaPets(){
        // novo proprietario com parametros do construtor
        Proprietario prop = new Proprietario();
        prop.setNome("Alysson");
        prop.setTelefone("92 98801");
        prop.setEmail("user@email.com");

        Pet[] pets = new Pet[2];

        prop.getPets()[0] = new Pet();
        prop.getPets()[0].setNome("Tom");
        prop.getPets()[0].setAnoNascimento(2020);
        prop.getPets()[0].setEspecie("Felino");
        prop.getPets()[0].setRaca("SRD");
        prop.getPets()[0].setProprietario(prop);

        prop.getPets()[1] = new Pet();
        prop.getPets()[1].setNome("Coiso");
        prop.getPets()[1].setAnoNascimento(2018);
        prop.getPets()[1].setEspecie("Cachorro");
        prop.getPets()[1].setRaca("Poodle");
        prop.getPets()[1].setProprietario(prop);

        System.out.println("pets: " + Arrays.toString(prop.getPets()));

/*        for(int i = 0; i < prop.getPets().length; i++) {

            // Previnir o NullPointerException
            if(prop.getPets()[i] == null) {
                break;
            }

            System.out.println("pet " + (i+1) + ": " + prop.getPets()[i].getNome());
            System.out.println("pet " + (i+1) + ": " + prop.getPets()[i].getAnoNascimento());
            System.out.println("pet " + (i+1) + ": " + prop.getPets()[i].getEspecie());
            System.out.println("pet " + (i+1) + ": " + prop.getPets()[i].getRaca());
            System.out.println("pet " + (i+1) + ": " + prop.getPets()[i].getProprietario().getNome());
            System.out.println("----------------------------");
        }*/
    }

    public static void main(String[] args) {
//        testaPetParaProprietario();
        testaProprietarioParaPets();
    }
}