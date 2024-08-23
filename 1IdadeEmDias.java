/*1-Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a 
idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

import java.util.Scanner;

public class IdadeEmDias{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //solicita ao usuário a idade em anos, meses e dias
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        //converte anos e meses para dias
        int totalDias = (anos * 365) + (meses * 30) + dias;

        //exibe a idade total em dias
        System.out.println("a idade espressa em dias é: " + totalDias);

        scanner.close();
    }
}