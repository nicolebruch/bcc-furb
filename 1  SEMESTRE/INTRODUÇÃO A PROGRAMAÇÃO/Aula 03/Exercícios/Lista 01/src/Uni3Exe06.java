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

        /*Definindo as variáveis/atributos */
        double precoPorQuilo = 25;
        /*Convertendo gramas para quilos */
        double pesoPratoVazio = 750 / 1000;

        System.out.println("Peso total em KG:");
        double pesoTotal = entrada.nextDouble();

        entrada.close(); //Fechando aqui o Scanner pra não consumir memória

        /*Cálculo do peso da comida*/
        double pesoComida = pesoTotal - pesoPratoVazio;


        /*Condição para não ser colocado um número menor que zero na condição*/
        if (pesoComida < 0) {
            System.out.println("Peso inválido");
            /*Se caso não for menor que zero, ele vai calcular e passar o valor */
        } else {
            double valorAPagar = pesoComida * precoPorQuilo;
            /*Aqui ele printa o quanto vai pagar na refeição */
            System.out.println("Valor da refeição é de: " + "R$" + valorAPagar);
        }

    }
}
