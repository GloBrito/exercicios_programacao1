/* Algoritmo em java para ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.  */

import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Utilizando uma variável auxiliar para trocar os valores, se necessário
        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        System.out.println("Os valores em ordem crescente são: " + valor1 + " e " + valor2);
    }
}