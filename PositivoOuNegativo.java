/*  Algoritmo em java para ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). */

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
    }
}