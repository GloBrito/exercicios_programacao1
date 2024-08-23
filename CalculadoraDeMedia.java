/*Algoritmo em java para ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.  */

import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda avaliação: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        // Verificação da aprovação
        if (media >= 6) {
            System.out.printf("Parabéns! Você foi aprovado com média %.2f.", media);
        } else {
            System.out.printf("Infelizmente você não foi aprovado. Sua média foi %.2f.", media);
        }
    }
}