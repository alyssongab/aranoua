package modelo;

import java.util.ArrayList;

public class Clube {

    private String nome;
    private String raca;

    private ArrayList<Proprietario> proprietarios = new ArrayList<Proprietario>();

    public Clube() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void addProprietario(Proprietario proprietario){
        if(!this.proprietarios.contains(proprietario)) {
            this.proprietarios.add(proprietario);
        }
    }

    public void removeProprietario(Proprietario proprietario){
        if(this.proprietarios.contains(proprietario)) {
            this.proprietarios.remove(proprietario);
        }
    }

    public void listarProprietarios(){
        for(Proprietario e:proprietarios){
            System.out.println(e.getNome());
        }
    }
}
