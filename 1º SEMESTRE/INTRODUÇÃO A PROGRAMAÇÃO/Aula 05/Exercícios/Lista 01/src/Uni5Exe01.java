/*Descreva um algoritmo que leia 20 números inteiros e escreva,
 para cada número lido, se o mesmo é par ou ímpar. */

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }
        }
        entrada.close();
    }
}
