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

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    // Construtor
    public Proprietario() {

    }
}
