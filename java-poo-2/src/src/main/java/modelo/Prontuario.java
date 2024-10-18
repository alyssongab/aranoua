package modelo;

import java.util.ArrayList;

public class Prontuario {

    private String numero;

    private String data;

    private Pet pet;

    private ArrayList<Atendimento> atendimentos = new ArrayList<>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addAtendimento(String descricao,String data){
        Atendimento atendimento = new Atendimento(descricao,data);
        this.atendimentos.add(atendimento);
    }

    public void listarAtendimento(){
        for(Atendimento atendimento:atendimentos){
            System.out.println(atendimento.getData()+" --- "+atendimento.getDescricao());
        }
    }

}
