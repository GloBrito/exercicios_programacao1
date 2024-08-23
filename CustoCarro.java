/*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo em java para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.  */

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        // Percentuais
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        // Cálculos
        double valorDistribuidor = custoFabrica * percentualDistribuidor;
        double valorImpostos = custoFabrica * percentualImpostos;
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.printf("O custo final do carro ao consumidor é: R$ %.2f", custoFinal);
    }
}