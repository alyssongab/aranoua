package modelo;

import java.util.ArrayList;

public class Proprietario {

    private String nome;
    private String telefone;
    private String email;

    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public void addPet(Pet pet){
        if(!this.pets.contains(pet)) {
            this.pets.add(pet);
            pet.setProprietario(this);
        }
    }

    public void listarPets(){
        for(Pet pet : this.pets){
            System.out.println(pet.getNome());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }



}
