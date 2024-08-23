/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo em java que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).  */

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int HORAS_SEMANAIS = 40;
        final double ACRESCIMO_HORA_EXTRA = 1.5;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        // Cálculo das horas extras
        int horasExtras = Math.max(horasTrabalhadas - (HORAS_SEMANAIS * 4), 0);

        // Cálculo do salário total
        double salarioTotal = horasTrabalhadas * valorHora + horasExtras * valorHora * ACRESCIMO_HORA_EXTRA;

        System.out.printf("O salário total do funcionário é: R$ %.2f", salarioTotal);
    }
}