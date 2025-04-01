/*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
Considerando que alguém está pagando uma compra, 
faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco.
Escreva também o número de cada tipo de nota a ser fornecido como troco.
Suponha que o sistema monetário não utilize centavos. */

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* peço pro usuário colocar o valor do produto */
        System.out.println("Digite o valor do produto: ");
        int valorProduto = entrada.nextInt();

        /*
         * peço pro usuário colocar o valor que ele
         * deu para poder pagar (Pois com isso eu vejo o troco final)
         */
        System.out.println("Digite o valor pago: ");
        int valorPago = entrada.nextInt();

        /* fecho o scanner para não consumir memória */
        entrada.close();

        /* aqui o cálculo pro troco que deve ser devolvido */
        int troco = valorPago - valorProduto;

        // 384 / 100 = 3
        int nota100 = troco / 100;
        // 384 % 100 = 84

        /*
         * % --> pega o resto da divisão,
         * no caso os números q sobraram da divisão
         */
        int resto = troco % 100;
        // 84 / 10 = 8
        int nota10 = resto / 10;
        // 84 % 10 = 4
        int nota1 = resto % 10;

        // aqui eu printo a saída
        System.out.println("Troco: " + troco + " reais");
        System.out.println("Notas de 100: " + nota100);
        System.out.println("Notas de 10: " + nota10);
        System.out.println("Notas de 1: " + nota1);
    }
}
