/*17-Programa em java que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno. Fórmula para cálculo de média de LP1.
(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.2) */

import java.util.Scanner;

public class MediaLP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        System.out.print("Digite a nota da P1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double e1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double e2 = scanner.nextDouble();

        System.out.print("Digite a nota do API: ");
        double api = scanner.nextDouble();

        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de SUB: ");
        double sub = scanner.nextDouble();

        // Cálculo da média ponderada inicial
        double mediaPonderada = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4) * 0.5;

        // Cálculo do fator de ajuste
        double fatorAjuste = Math.max((mediaPonderada - 5.9), 0) / (mediaPonderada - 5.9);

        // Cálculo da média final
        double mediaFinal = mediaPonderada + fatorAjuste * api * 0.5 + x + sub * 0.2;

        // Impressão do resultado
        System.out.printf("A média final de LP1 é: %.2f", mediaFinal);
    }
}