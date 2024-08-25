package aula01.testes;
import java.util.Scanner;

//import static aula01.util.IMCUtil.calcularImc;
//import static aula01.util.IMCUtil.classificarImc;

public class AtendimentoMedicoComIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        boolean vacinacaoEmDia;
        String sintomas;
        String dataAtendimento;

        System.out.print("Nome: ");
        nome = scanner.nextLine();

        System.out.print("Peso: ");
        peso = scanner.nextDouble();

        System.out.print("Altura: ");
        altura = scanner.nextDouble();

        System.out.println("Vacinação em dia? ");
        vacinacaoEmDia = scanner.nextBoolean();

        System.out.print("Sintomas: ");
        sintomas = scanner.next();

        System.out.print("Data de atendimento: ");
        dataAtendimento = scanner.next();

    }
}
