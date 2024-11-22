package edu.ifam;

public class Pessoa {
    private String nome;
    private String email;
    private int id;


    public Pessoa(String nome, String email, int id) {
        this.nome = nome;
        this. email = email;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


