package main.java.testes;

import main.java.modelo.Pet;
import main.java.modelo.Proprietario;

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

        Pet pet = new Pet();
        pet.setNome("tom");
        pet.setEspecie("felina");
        pet.setRaca("srd");
        pet.setAnoNascimento(2020);

        prop.getPets().add(pet);

        pet = new Pet(); // Desreferenciando o primeiro pet criado

        pet.setNome("tonho");
        pet.setEspecie("peixe");
        pet.setRaca("baiacu");
        pet.setAnoNascimento(2015);

        prop.getPets().add(pet);

        for(Pet p : prop.getPets()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        testaProprietarioParaPets();
    }
}