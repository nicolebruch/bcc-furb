/*Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor. */

//impar aumenta 5%
//par aumenta 2%

// 1 - Ler os valores
// 2 - Ajustar os valores
// 3 - Escrever os valores atualizados

import java.util.Scanner;

public class Uni6Exe03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[12];

        // lendo os valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número para a posição: " + i + " do vetor");
            vetor[i] = scanner.nextDouble();

        }

        // ajustando os valores
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { // par
                vetor[i] = vetor[i] * 0.02;
            } else { // impar
                vetor[i] = vetor[i] * 0.05;
            }

        }

        // escrevendo os valores atualizados
        System.out.println("Os valores atualizados são:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição[" + i + "] = " + vetor[i]);
        }
        scanner.close();
    }
}