/*Dados dois números inteiros 
descreva um algoritmo para informar o maior valor entre eles. */

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* pedindo pro usuário informar o primeiro número */
        System.out.println("Informe o primeiro número: ");
        int numero1 = entrada.nextInt();

        /* pedindo pro usuário informar o segundo número */
        System.out.println("Informe o segundo número: ");
        int numero2 = entrada.nextInt();

        /* fecho o scanner p/ não consumir memória */
        entrada.close();

        /* condição p/ avisar qual número é maior que qual */
        /*
         * se o número1 for maior que o número2, vai dizer
         * que o número 1 é o maior
         */
        if (numero1 > numero2) {
            System.out.println("O número: " + numero1 + " é maior que o número: " + numero2);
            /*
             * se o número2 for maior que o número1, vai dizer
             * que o número 2 é o maior
             */
        } else if (numero1 < numero2) {
            System.out.println("O número: " + numero2 + " é maior que o número: " + numero1);
            /*
             * se não for nenhuma das condições acima, então quer dizer que
             * os números são iguais, pois nenhum é maior que o outro nem menor
             */
        } else {
            System.out.println("Os números são iguais");
        }
    }
}