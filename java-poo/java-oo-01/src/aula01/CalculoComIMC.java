package aula01;
import java.util.Scanner;

import aula01.IMCUtil;


public class CalculoComIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();

        Pessoa pessoa1 = new Pessoa(nome, peso, altura);
        System.out.format("Imc: %.2f\n", pessoa1.calcularImc());
        IMCUtil.classificarImc(pessoa1.calcularImc());

    }
}
