package aula01.util;

public class IMCUtil {
    static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void classificarImc(double imc) {

        String classificacao, dicas;

        if (imc < 18.5) {
            classificacao = "Magreza";
            dicas = "Aumente a ingestão calórica com alimentos ricos em nutrientes, como frutas, legumes, proteínas magras, grãos integrais e gorduras saudáveis (abacate, nozes, azeite de oliva).";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso normal";
            dicas = "Mantenha uma dieta variada e equilibrada, incluindo frutas, vegetais, proteínas, carboidratos integrais e gorduras saudáveis.";
        } else {
            classificacao = "Sobrepeso e Obesidade";
            dicas = "Reduza a ingestão calórica, especialmente evitando alimentos processados, ricos em açúcar e gorduras saturadas. Dê preferência a alimentos integrais, vegetais e proteínas magras.";
        }

        System.out.println();
        System.out.format("Imc: %.2f\n", imc);
        System.out.println("Classificacao: " + classificacao);
        System.out.println("Dicas: " + dicas);
    }
}
