/* Algoritmo em java para ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */

import java.util.Scanner;

public class DuracaoXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();

        // Cálculo da duração, considerando a possibilidade de passar da meia-noite
        int duracao = horaFim - horaInicio;
        if (duracao < 0) {
            duracao += 24; // Se a hora de fim for menor que a hora de início, o jogo passou da meia-noite
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");
    }
}