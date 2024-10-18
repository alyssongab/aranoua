package modelo;

import modelo.Pet;

public class TestePet {

    public static void testaPetParaProprietario(){
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Giordana");
        proprietario.setEmail("giordana@ifam.edu.br");
        proprietario.setTelefone("92 91234-5678");


        // Criei o objeto
        Pet pet = new Pet();

        // Pet pet = new Pet("Bartolomeu","Giordana",2020,"Felina","SRD");

        // Setei os valores.
        pet.setNome("Bartolomeu");
        pet.setEspecie("Felina");
        pet.setRaca("SRD");
        pet.setAnoNascimento(2020);
        // Realizar a associação entre os objetos.
        pet.setProprietario(proprietario);

        // Mostrei os valores do Pet

        System.out.println("Nome:"+pet.getNome());
        System.out.println("Espécie:"+pet.getEspecie());
        System.out.println("Raça:"+pet.getRaca());
        System.out.println("Nascimento:"+pet.getAnoNascimento());
        System.out.println("Idade:"+pet.getIdade());

        // Mostrei os valores do proprietário do Pet.

//        Proprietario proprietarioSaida= pet.getProprietario();

        System.out.println("Proprietário - Nome:"+pet.getProprietario().getNome());
        System.out.println("Proprietário - Email:"+pet.getProprietario().getEmail());
        System.out.println("Proprietário - Telefone:"+pet.getProprietario().getTelefone());
    }

    public static void testaProprietarioParaPets(){

        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Giordana");
        proprietario.setEmail("giordana@ifam.edu.br");
        proprietario.setTelefone("92 91234-5678");

        Pet pet = new Pet();

        pet.setNome("Bartolomeu");
        pet.setEspecie("Felina");
        pet.setRaca("SRD");
        pet.setAnoNascimento(2020);

        proprietario.addPet(pet);

        pet = new Pet();

        pet.setNome("Belinha");
        pet.setEspecie("Felina");
        pet.setRaca("SRD");
        pet.setAnoNascimento(2018);

        proprietario.addPet(pet);


        //Mostrar proprietário

        System.out.println("Proprietario:"+proprietario.getNome());
        System.out.println("Proprietario:"+proprietario.getTelefone());
        System.out.println("Proprietario:"+proprietario.getEmail());

        System.out.println("Mostrando os pets ******");

        proprietario.listarPets();

    }




    public static void testaProprietarioParaPetsBidirecional(){

        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Giordana");
        proprietario.setEmail("giordana@ifam.edu.br");
        proprietario.setTelefone("92 91234-5678");

        // Criei o objeto
        Pet pet = new Pet();

        // Pet pet = new Pet("Bartolomeu","Giordana",2020,"Felina","SRD");

        // Setei os valores.
        pet.setNome("Bartolomeu");
        pet.setEspecie("Felina");
        pet.setRaca("SRD");
        pet.setAnoNascimento(2020);
        // Realizar a associação entre os objetos.
//        pet.setProprietario(proprietario);
        proprietario.addPet(pet);

        System.out.println("Pet:"+pet.getNome());
        System.out.println("Proprietario do Pet:"+pet.getProprietario().getNome());

        System.out.println("Mostrando os Pets do Proprietario:");

        proprietario.listarPets();

    }

    public static void main(String args[]){

//        testaPetParaProprietario();
//        testaProprietarioParaPets();
        testaProprietarioParaPetsBidirecional();

    }

}
