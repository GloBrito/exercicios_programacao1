/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa em java que leia o número de maçãs compradas, calcule e escreva o custo total da compra.  */

import java.util.Scanner;

public class CustoMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double preco;
        if (quantidade < 12) {
            preco = 1.30;
        } else {
            preco = 1.00;
        }

        double custoTotal = quantidade * preco;

        System.out.printf("O custo total da compra é: R$ %.2f", custoTotal);
    }
}