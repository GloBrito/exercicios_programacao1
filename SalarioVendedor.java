/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo em java que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor. */

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarros = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor da comissão por carro: R$ ");
        double comissaoPorCarro = scanner.nextDouble();

        // Cálculo da comissão sobre o valor total das vendas
        double comissaoValorVendas = valorVendas * 0.05;

        // Cálculo da comissão total por carro vendido
        double comissaoTotalCarros = numCarros * comissaoPorCarro;

        // Cálculo do salário final
        double salarioFinal = salarioFixo + comissaoTotalCarros + comissaoValorVendas;

        System.out.printf("O salário final do vendedor é: R$ %.2f", salarioFinal);
    }
}