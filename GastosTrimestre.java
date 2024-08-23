/*16-Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa em java que calcule e imprima a despesa total no trimestre e a média mensal de gastos. */

public class GastosTrimestre {
    public static void main(String[] args) {
        // Gastos de cada mês
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        // Cálculo do gasto total
        int gastoTotal = gastosJaneiro + gastosFevereiro + gastosMarco;

        // Cálculo da média mensal
        double mediaMensal = (double) gastoTotal / 3;

        // Impressão dos resultados
        System.out.println("Gasto total no trimestre: R$" + gastoTotal);
        System.out.printf("Média mensal de gastos: R$ %.2f", mediaMensal);
    }
}