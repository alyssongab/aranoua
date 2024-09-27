package main.java.modelo;

import java.util.ArrayList;

public class Proprietario {
    //Atributos
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Pet> pets = new ArrayList<>();

    // Getters Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // MÉTODOS ESPECIAIS

    public void addPet(Pet pet) {
        if(!pets.contains(pet)) {
            pets.add(pet);
            pet.setProprietario(this);
        }
    }

    public void listarPets() {
        for (Pet p : pets) {
            System.out.println(p);
        }
    }

    // Construtor
    public Proprietario() {

    }
}
