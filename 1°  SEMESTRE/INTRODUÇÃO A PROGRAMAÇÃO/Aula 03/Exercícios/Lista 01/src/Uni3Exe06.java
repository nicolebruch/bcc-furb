/*Um restaurante cobra R$ 25,00 por cada quilo de refeição.
Escreva um programa que leia o peso do prato montado pelo cliente (em quilos)
e imprima o valor a pagar.
O peso do prato é de 750 gramas. */

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o peso do prato:");
        double pesoPrato = entrada.nextDouble();

        /*
         * dividi o custo de produção (25 pila),
         * pelo custo da quantidade consumida(pesoPrato)
         */
        double quiloCobrado = pesoPrato / 25;

        /* Se o peso do prato ultrapassar 1000G == 1KG */
        if (pesoPrato > 1000) {
            /* Vai ter que pagar pelo quilo cobrado */
            System.out.println("Você pagará: " + quiloCobrado);
            /* Se não, não é cobrado pelo quilo cobrado */
        } else {
            System.out.println("Você não será cobrado a mais pela refeição.");

        }

    }
}


/*errado, refazer */