/*Numa loja de materiais de construção,
um azulejo estampado custa R$ 12,50.
Faça um programa para ler
o comprimento
e altura de uma parede (em metros),
e depois escrever o valor gasto com a compra de azulejos.
Considere que um metro quadrado é formado por 9 azulejos. */

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        /*
         * Scanner pra poder estar puxando os dados
         * na memória que o usuário informou
         */
        Scanner entrada = new Scanner(System.in);

        /* declaro a váriavel que seria o valor do azulejo */
        double azulejoEstampado = 12.50;
        double porM2 = 9;

        /* peço pro usuário informar o comprimento da parede */
        System.out.println("Qual o comprimento da parede?");
        double comprimento = entrada.nextDouble();

        /* fecho o scanner para não consumir memória */
        entrada.close();

        /* peço também para o usuário informar a altura da parede */
        System.out.println("Qual a altura da parede?");
        double altura = entrada.nextDouble();

        /* calculo a área da parede para saber a quantidade de azulejos usados */
        double area = comprimento * altura;

        /* calculo o preço a ser pago */
        System.out.println("O preço a ser pago é: R$" + area * (azulejoEstampado * porM2));
    }
}
