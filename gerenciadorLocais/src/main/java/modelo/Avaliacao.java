package main.java.modelo;

public class Avaliacao {

    // atributos
    private int estrelas;
    private Local local;
    private String comentarios;

    public Avaliacao(Local local, int estrelas, String comentarios) {
        this.local = local;
        this.estrelas = estrelas;
        this.comentarios = comentarios;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
