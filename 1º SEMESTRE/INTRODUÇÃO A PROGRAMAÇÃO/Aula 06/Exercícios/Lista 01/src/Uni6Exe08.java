/*Faça um programa que leia um valor N inteiro limitado a 20 posições. X
 Com base neste valor, crie um vetor do tipo real. X 
Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. X
 Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor (veja exemplo a seguir). */

import java.util.Scanner;

public class Uni6Exe08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de números (máximo 20): ");
        int N = scanner.nextInt();

        while (N > 20 || N <= 0) {
            System.out.print("Valor inválido! Digite um número entre 1 e 20: ");
            N = scanner.nextInt();
        }

        double[] vetor = new double[N];

        // Inserção dos valores
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            vetor[i] = scanner.nextDouble();
        }

        // Contagem de frequências
        System.out.println("\nValor\tFrequência");
        for (int i = 0; i < N; i++) {
            boolean jaContado = false;

            // Verifica se já contou esse número
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    jaContado = true;
                    break;
                }
            }

            if (!jaContado) {
                int cont = 1;
                for (int j = i + 1; j < N; j++) {
                    if (vetor[i] == vetor[j]) {
                        cont++;
                    }
                }
                System.out.printf("%.2f\t%d\n", vetor[i], cont);
            }
        }

        scanner.close();
    }
}