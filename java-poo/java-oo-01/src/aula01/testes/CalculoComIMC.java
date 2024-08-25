package aula01.testes;

import aula01.modelo.Pessoa;
import aula01.util.IMCUtil;
import java.util.Scanner;

public class CalculoComIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa("joao", 65.2, 1.76, "manaus");

        System.out.println(pessoa1.getNome() + pessoa1.getPeso() + pessoa1.getAltura() + pessoa1.getCidade());
        System.out.format("Imc: %.2f\n", pessoa1.calcularImc());
        IMCUtil.classificarImc(pessoa1.calcularImc());


    }
}
