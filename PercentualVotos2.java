/*2-Escreva um algoritmo para ler o número total de eleitores de um município, 
o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
que cada um representa em relação ao total de eleitores.*/

import java.util.Scanner;

public class PercentualVotos{
    public static void main(String[] args){
        //cria o scanner para receber os inputs dos usuários
        Scanner scanner = new Scanner(System.in);

        //solicita ao usuário o número total de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        //solicita ao usuário o número de votos brancos
        System.out.print("Digite o número de votos em branco: ");
        int votosBrancos = scanner.nextInt();

        //solicita ao usuário o número de votos nulos
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        //solicita ao usuário o número de votos válidos
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        //verifica se a soma dos votos não ultrapassa o número toral de eleitores
        if (votosBrancos + votosNulos + votosValidos <= totalEleitores){
            //calcula os percentuais
            double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
            double percentualNulos = (double) votosNulos / totalEleitores * 100;
            double percentualValidos = (double) votosValidos / totalEleitores * 100;

            //exibe os resultados
            System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Percentual de votos validos: %.2f%%\n", percentualValidos);
        } else {
            //exibe uma mensagem de erro se a soma dos votos forem maiores que o número de eleitores
            System.out.println("A soma dos votos não pode ser maior que o número total de eleitores");
        }
        //fecha o scanner
        scanner.close();
    }
}