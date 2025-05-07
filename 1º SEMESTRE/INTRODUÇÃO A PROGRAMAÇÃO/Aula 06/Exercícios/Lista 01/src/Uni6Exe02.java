/*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média. */

import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[12];
        double media = 0;

        // lendo os valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número para a posição:" + i + "do vetor");
            vetor[i] = scanner.nextDouble();

        }

        // calculando a média
        for (int i = 0; i < vetor.length; i++) {
            media = media + vetor[i];
        }
        media = media / vetor.length;
        System.out.println("A média é: " + media);

        // imprimindo os valores maiores que a média
        System.out.println("Os valores maiores que a média são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Posição[" + i + "] = " + vetor[i]);
            }
        }
        scanner.close();
    }
}