package aula01.modelo;

public class Pessoa {

    private String nome;
    private double peso;
    private double altura;
    private String cidade;

//    public Pessoa(String nome, double peso, double altura, String cidade) {
//        this.nome = nome;
//        this.peso = peso;
//        this.altura = altura;
//        this.cidade = cidade;
//    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, double peso, double altura, String cidade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double calcularImc() { return peso / (altura*altura); }
}
