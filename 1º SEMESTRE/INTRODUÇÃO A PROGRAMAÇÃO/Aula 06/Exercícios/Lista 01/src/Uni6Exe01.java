
/*Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever. */
import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[10];

        // logica para ler os números inteiros
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número para a posição:" + i + "do vetor");
            vetor[i] = scanner.nextInt();
        }

        // lógica para imprimir o vetor na ordem inversa
        System.out.println("Números lidos na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Posição[" + i + "] = " + vetor[i]);
        }
        scanner.close();
    }
}