/*Faça um programa para ler três notas de um aluno em uma disciplina
e imprimira sua média ponderada 
(as notas tem pesos respectivos de 5, 3 e 2).*/

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* Informando a primeira nota */
        System.out.println("Informe a sua primeira nota:");
        double nota1 = entrada.nextDouble();

        /* Informando a segunda nota */
        System.out.println("Informe a sua segunda nota:");
        double nota2 = entrada.nextDouble();

        /* Informando a terceira nota */
        System.out.println("Informe a sua terceira nota:");
        double nota3 = entrada.nextDouble();

        /*Calculando a média ponderada das 3 notas informadas*/
        double mediaPonderada = (nota1 * 2) + (nota2 * 3) + (nota3 * 4) / 9;
        System.out.println("A sua média ponderada é igual a: " + mediaPonderada);

    }
}