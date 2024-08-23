/* Escreva um algoritmo em java para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F */

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Fórmula de conversão: Celsius = (Fahrenheit - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.2f graus Fahrenheit equivalem a %.2f graus Celsius.", fahrenheit, celsius);
    }
}