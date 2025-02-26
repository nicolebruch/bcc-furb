/*Uma loja de calçados está concedendo 12% de desconto nos produtos.
Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos
 e quanto deve custar o produto com o desconto. 
 O preço do par de sapatos deve ser informado pelo usuário. 
 Como resultado, o programa deverá exibir as seguintes mensagens:
O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx */

import java.util.Scanner;

public class Uni3Exe02 {

    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* Informando o nome do sapato */
        System.out.println("Informe o nome do Sapato:");
        String nomeSapato = entrada.next();

        /* Informando o valor do sapato */
        System.out.println("Informe o valor do Sapato:");
        double precoSapato = entrada.nextDouble();

        /* Fazendo o cálculo do desconto (Caso o cliente tenha desconto) */
        double valorDesconto = precoSapato * 0.12;

        /* Realizo uma condição, para só dar desconto a nomes de sapatos específicos */
        if (nomeSapato.equalsIgnoreCase("Salto") || nomeSapato.equalsIgnoreCase("Tenis")
                || nomeSapato.equalsIgnoreCase("Sandalia")) {
            System.out.println("Você tem direito ao desconto de 12%! Ficando por: " + valorDesconto);
            /*
             * Caso não seja os nomes que estão na condição, ele não deixará levar o
             * desconto
             */
        } else {
            System.out.println("Você não tem direito ao desconto.");
        }

    }
}
