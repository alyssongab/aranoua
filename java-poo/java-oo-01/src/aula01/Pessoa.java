package aula01;

public class Pessoa {

    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / (altura*altura);
    }
}
