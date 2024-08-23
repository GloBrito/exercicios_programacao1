/*3-Escreva um algoritmo em java para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. */

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //entrada de dados
        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = entrada.nextDouble();

        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = entrada.nextDouble();

        //cálculo do reajuste
        double valorReajuste = salarioAtual * (percentualReajuste / 100);
        double novoSalario = salarioAtual + valorReajuste;

        //saída
        System.out.printf("O novo salário é: R$ %.2f", novoSalario);
        entrada.close();
    }
}