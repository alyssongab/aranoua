import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        double peso;
        double altura;

        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Peso: ");
        peso = scanner.nextDouble();
        System.out.print("Altura: ");
        altura = scanner.nextDouble();

        double imc = peso / (altura * altura);


//        Imc = peso / altura²;

        System.out.println("Calculadora de IMC");
        System.out.println("Nome: " + nome);
        System.out.printf("IMC: %.2f", imc);

        String classificacao;

        if(imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso normal";
        } else {
            classificacao = "Sobrepeso e Obesidade";
        }

        System.out.println();
        System.out.println("Classificacao: " + classificacao);
    }
}