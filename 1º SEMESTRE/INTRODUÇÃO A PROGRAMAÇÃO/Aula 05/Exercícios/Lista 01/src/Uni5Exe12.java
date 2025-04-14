/*Escreva um programa que leia um número inteiro positivo n 
e em seguida imprima n linhas do chamado Triangulo de Floyd:

Triangulo de Floyd

1  
2   3   
4   5   6
7   8   9   10
11  12  13  14  15
16  17  18  19  20  21

Pense no resultado! */

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int linhas = 0, colunas = 0, n, numeros = 1;
        System.out.println("Adicione o número de linhas do triângulo:");
        n = ler.nextInt();
        for (linhas = 1; linhas <= n; linhas++) {
            for (colunas = 1; colunas <= linhas; colunas++) {
                System.out.print("\t" + numeros);
                numeros++;
            }

            System.out.println();
        }
        ler.close();
    }
}
