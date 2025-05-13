/*Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores. */

//Ler valores de 2 vetores inteiros
//vetores contendo 10 elementos

//criar terceiro vetor 
//cada elemento do terceiro é a soma da posicao 1  do vetor1 + posicao1 do vetor2

//1 metodo pra ler valor dos vetores
//metodo pra somar
//metodo pra escrever os vetores

import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
a
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];

        lerValores(scanner, vetor1, vetor2);
        somarValores(vetor1, vetor2, vetor3);
        escreverValores(vetor1, vetor2, vetor3);

        scanner.close();

    }

    public static void lerValores(Scanner scanner, int[] vetor1, int[] vetor2) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o número para a posição: " + i + " do vetor 1");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite o número para a posição: " + i + " do vetor 2");
            vetor2[i] = scanner.nextInt();

        }
    }

    public static void somarValores(int[] vetor1, int[] vetor2, int[] vetor3) {

        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    public static void escreverValores(int[] vetor1, int[] vetor2, int[] vetor3) {
        System.out.println("Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Posição[" + i + "] = " + vetor1[i]);
        }

        System.out.println("Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Posição[" + i + "] = " + vetor2[i]);
        }

        System.out.println("Vetor 3 (Soma):");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("Posição[" + i + "] = " + vetor3[i]);
        }
    }
}